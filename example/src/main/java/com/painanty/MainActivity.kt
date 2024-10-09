package com.painanty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pain.common.log.LogUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogUtil.setDebug(true)

        LogUtil.d("我是测试日志打印,级别为d")

    }

}