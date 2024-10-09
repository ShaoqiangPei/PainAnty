package com.pain.common.log

import android.util.Log


/**
 * Title:Log 打印工具类
 * description:
 * autor:pei
 * created on 2024/10/10
 */
object LogUtil {

    private val TAG: String = "pei"

    //注: 打印等级v<d<i<w<e,v级别最低,e级别最高
    private val LEVEL_V: String = "v"//输出所有信息
    private val LEVEL_D: String = "d"//输出调试信息
    private val LEVEL_I: String = "i"//输出级别为info的信息
    private val LEVEL_W: String = "w"//输出警告级别的信息
    private val LEVEL_E: String = "e"//输出错误级别的信息

    private var mIsDebug: Boolean = false//默认关闭自定义打印

    /**设置是否开启打印的标志**/
    fun setDebug(isDebug: Boolean) {
        this.mIsDebug = isDebug
    }

    fun i(tag: String, msg: String) {
        if (mIsDebug) {
            printLog(formatLog(tag), msg, LEVEL_I)
        }
    }

    fun i(msg: String) {
        if (mIsDebug) {
            printLog(formatLog(TAG), msg, LEVEL_I)
        }
    }

    fun d(tag: String, msg: String) {
        if (mIsDebug) {
            printLog(formatLog(tag), msg, LEVEL_D)
        }
    }

    fun d(msg: String) {
        if (mIsDebug) {
            printLog(formatLog(TAG), msg, LEVEL_D)
        }
    }

    fun w(tag: String, msg: String) {
        if (mIsDebug) {
            printLog(formatLog(tag), msg, LEVEL_W)
        }
    }

    fun w(msg: String) {
        if (mIsDebug) {
            printLog(formatLog(TAG), msg, LEVEL_W)
        }
    }

    fun v(tag: String, msg: String) {
        if (mIsDebug) {
            printLog(formatLog(tag), msg, LEVEL_V)
        }
    }

    fun v(msg: String) {
        if (mIsDebug) {
            printLog(formatLog(TAG), msg, LEVEL_V)
        }
    }

    fun e(tag: String, msg: String) {
        if (mIsDebug) {
            printLog(formatLog(tag), msg, LEVEL_E)
        }
    }

    fun e(msg: String) {
        if (mIsDebug) {
            printLog(formatLog(TAG), msg, LEVEL_E)
        }
    }

    fun systemPrintln(tag: String, message: String) {
        if (mIsDebug) {
            println("$tag: $message")
        }
    }

    fun systemPrintln(message: String) {
        if (mIsDebug) {
            println("$TAG: $message")
        }
    }

    private fun formatLog(tag: String): String {
        var traceElements: Array<StackTraceElement> = Thread.currentThread().getStackTrace()
        var element: StackTraceElement = traceElements.get(4)

        var className: String? = element.className
        var methodName: String? = element.methodName
        var fileName: String? = element.fileName
        var lineNumber: Int = if (element.lineNumber != 0) element.lineNumber else 0
        if (!className.isNullOrBlank() && "." in className) {
            className = className.substring(className.lastIndexOf(".") + 1, className.length)
        }

        var buffer: StringBuffer = StringBuffer()
        buffer.append("$tag:")
//        buffer.append("$className.")
        buffer.append("$methodName(")
        buffer.append("$fileName:")
        buffer.append("${lineNumber.toString()})")
        return buffer.toString()
    }

    private fun printLog(tag: String, msg: String, type: String) {
        var count: Int = msg.length
        if (count > 4000) {
            for (i in 0 until count) {
                var index: Int = i + 4000
                if (index + 4000 < count) {
                    printByLogType(tag, msg.substring(i, i + 4000), type)
                } else {
                    printByLogType(tag, msg.substring(i, msg.length), type)
                }
            }
        } else {
            printByLogType(tag, msg, type)
        }
    }

    private fun printByLogType(tag: String, msg: String, type: String) {
        when (type) {
            LEVEL_I -> Log.i(tag, msg)
            LEVEL_D -> Log.d(tag, msg)
            LEVEL_W -> Log.w(tag, msg)
            LEVEL_V -> Log.v(tag, msg)
            LEVEL_E -> Log.e(tag, msg)
        }
    }

}