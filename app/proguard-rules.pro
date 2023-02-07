# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

##
# 导入 annoguard 注解配置实现库。
#__________________________________________
# 使用`jadx-gui`工具反编译，启用优化与否，比较的效果差不多，都挺复杂。
# 启用优化后，有变化，理论上逻辑关系更乱。
# 如果把该工程作为`aar`提供，需酌情[不]启用或`@Keep`可暴露的接口。
#__________________________________________
-include ../annoguard/impl/optimize.pro
-include ../annoguard/impl/annotations.pro

#-dontnote path.xxx


#针对反射，方法里面定义了类的情况。#
-keepattributes InnerClasses,EnclosingMethod
#`lift()`功能函数相关。#
-keepclassmembers class * {
    *** liftings;
    *** liftings();
    *** *$u002E*;
    *** *$u002E*();
    **.ScalarValueLifting *;
    **.ScalarValueLifting *();
}
