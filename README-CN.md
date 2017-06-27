<img src="/img/VercodeEditTex.png" width="800px"/>

## 介绍
一个安卓验证码输入框控件。  
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
<img src="https://img.shields.io/badge/license-Apache 2.0-green.svg?style=flat">
[![API](https://img.shields.io/badge/API-12%2B-green.svg?style=flat)](https://android-arsenal.com/api?level=11)

## 演示
防止输入溢出.  
<img src="/img/demo.gif" width="280px"/>

## 特性
- [x] **继承EditText，可以当作EditText使用**  
- [x] **防止输入溢出**  
- [x] **自定义验证码位数**  
- [x] **提供输入内容的监听器**  
- [x] **高度自适配**  
- [x] **属性自定义配置**  

## 版本
名称|SlideMenuLayout
---|---
最新版本|![Download](https://api.bintray.com/packages/jkb/maven/vercodeedittext/images/download.svg)

## 配置
#### Maven
```xml
<dependency>
  <groupId>com.justkiddingbaby</groupId>
  <artifactId>vercodeedittext</artifactId>
  <version>最新版本</version>
  <type>pom</type>
</dependency>
```
#### JCenter
第一步，添加至工程的build.gradle文件中
```gradle
repositories {
    jcenter()
}
```
第二步，添加至module的build.gradle文件中
```gradle
compile 'com.justkiddingbaby:vercodeedittext:最新版本'
```

## 属性说明
属性|介绍|取值
---|---|---
|[figures](/vcedittext-lib/src/main/res/values/attrs.xml)|验证码位数|integer|
|[verCodeMargin](/vcedittext-lib/src/main/res/values/attrs.xml)|每个验证码的间隔|dimension|
|[bottomLineSelectedColor](/vcedittext-lib/src/main/res/values/attrs.xml)|底线选择状态下的颜色|reference|
|[bottomLineNormalColor](/vcedittext-lib/src/main/res/values/attrs.xml)|底线未选中状态下的颜色|reference|
|[bottomLineHeight](/vcedittext-lib/src/main/res/values/attrs.xml)|底线高度|dimension|
|[selectedBackgroundColor](/vcedittext-lib/src/main/res/values/attrs.xml)|选中的背景颜色|reference|

## 方法说明
返回值|方法|说明
---|---|---
|void|[setFigures(int figures)](/vcedittext-lib/src/main/java/com/jkb/vcedittext/VerificationAction.java)|设置验证码位数|
|void|[setVerCodeMargin(int margin)](/vcedittext-lib/src/main/java/com/jkb/vcedittext/VerificationAction.java)|设置验证码之间的间隔|
|void|[setBottomSelectedColor(int bottomSelectedColor)](/vcedittext-lib/src/main/java/com/jkb/vcedittext/VerificationAction.java)|设置底线选中状态的颜色|
|void|[setBottomNormalColor(int bottomNormalColor)](/vcedittext-lib/src/main/java/com/jkb/vcedittext/VerificationAction.java)|设置底线未选中状态的颜色|
|void|[setSelectedBackgroundColor(int selectedBackground)](/vcedittext-lib/src/main/java/com/jkb/vcedittext/VerificationAction.java)|设置验证码选中的背景颜色|
|void|[setBottomLineHeight(int bottomLineHeight)](/vcedittext-lib/src/main/java/com/jkb/vcedittext/VerificationAction.java)|设置验证码底线的高度|
|void|[setOnVerificationCodeChangedListener(OnVerificationCodeChangedListener listener)](/vcedittext-lib/src/main/java/com/jkb/vcedittext/VerificationAction.java)|设置验证码变化的监听器|

## 使用
#### 在布局中使用
```xml
  <com.jkb.vcedittext.VerificationCodeEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="number"
        android:text="123"
        android:textColor="@color/colorPrimary"
        android:textSize="40sp"
        app:bottomLineHeight="2dp"
        app:bottomLineNormalColor="@color/gravy_light"
        app:bottomLineSelectedColor="@color/colorAccent"
        app:figures="4"
        app:selectedBackgroundColor="@color/colorPrimary_alpha33"
        app:verCodeMargin="10dp" />
 ```
 
 ## 发布历史
 #### v1.0.1(2017/6/27)
 1、修复点击后无法获取焦点问题.
 #### v1.0.0(2017/6/12)
 1、发布VercodeEditText控件，防止输入溢出.  
 2、封装demo.
