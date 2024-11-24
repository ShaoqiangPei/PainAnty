/**
 * Title:项目build.gradle统一配置类
 * description:
 * autor:pei
 * created on 2024/10/23
 */
object ProConfig {

    //==========项目全局==========
    val proVersionCode = 2024112401 //eg: 2024101601 表示 2024-10-16日第01版本
    val proVersionName = "1.1.0" //eg: 1.0.0 表示 1(大版本更新).0(新功能).0(bug修复)
    //==jitpack相关配置
    val group = "com.github.ShaoqiangPei"
    val groupId = "com.pain.common"
    val artifactId = "android-common"

    //==========项目基本配置==========
    val proCurrentSdkVersion = 33
    val proMinSdkVersion = 24

    //==example部分配置
    val proExampleApplicationSpace = "com.painanty"
    val exampleNamespace = proExampleApplicationSpace
    //项目id
    val exampleApplicationId=proExampleApplicationSpace

    //==common部分配置
    val commonNameSpace = "com.pain.common"


    //==公共部分配置
    //编译的SDK版本
    val compileSdkVersion = proCurrentSdkVersion
//    //编译的Tools版本
//    val buildToolsVersion = "25.0.3"
    //支持SDK的最低版本
    val minSdkVersion = proMinSdkVersion
    //支持SDK的目标版本
    val targetSdkVersion = proCurrentSdkVersion
    //版本号
    val versionCode = proVersionCode
    //版本名称
    val versionName = proVersionName

    val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    val consumerProguardFiles = "consumer-rules.pro"

    //==========依赖库相关==========
    //依赖库版本
    val supportLibrary = "26.1.0"
    //基础库
    val implementation_androidx_core_ktx="androidx.core:core-ktx:1.7.0"
    val implementation_androidx_appcompat="androidx.appcompat:appcompat:1.4.1"
    val implementation_android_material="com.google.android.material:material:1.5.0"
    val implementation_androidx_constraintlayout="androidx.constraintlayout:constraintlayout:2.1.3"
    val testImplementation_junit="junit:junit:4.13.2"
    val androidTestImplementation_androidx_test_ext_junit="androidx.test.ext:junit:1.1.3"
    val androidTestImplementation_androidx_test_espresso_core="androidx.test.espresso:espresso-core:3.4.0"


////            //retroefit2.0
////            compile_retrofit2:"com.squareup.retrofit2:retrofit:2.3.0",
////            //retrofit2.0对gson支持
////            compile_retrofit2_converter_gson:"com.squareup.retrofit2:converter-gson:2.2.0",
////            //retrofit2.0支持内置log打印
////            compile_logging_interceptor:"com.squareup.okhttp3:logging-interceptor:3.4.1",
////            //添加Retrofit2.0对Rx的支持(RxJava2.x时使用，RxJava1.x时不支持)
////            compile_retrofit2_adapter_rxjava2:"com.squareup.retrofit2:adapter-rxjava2:2.3.0",
//
//    //rxjava2.x
//    compile_rx_android2:"io.reactivex.rxjava2:rxandroid:2.0.1",
//    compile_rx_java2:"io.reactivex.rxjava2:rxjava:2.1.0",
//
//
////            //Glide
////            compile_glide4:"com.github.bumptech.glide:glide:4.0.0",
////            annotationProcessor_glide4_compiler:"com.github.bumptech.glide:compiler:4.0.0",
//
//    //ZXing二维码
//    compile_zxing_core:"com.google.zxing:core:3.3.0"


}