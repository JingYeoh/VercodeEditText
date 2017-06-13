# SlideMenuLayout
## 介绍
一个支持左右滑动并带有视差滑动效果的安卓滑动菜单控件。  
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
<img src="https://img.shields.io/badge/license-Apache 2.0-green.svg?style=flat">
[![API](https://img.shields.io/badge/API-12%2B-green.svg?style=flat)](https://android-arsenal.com/api?level=11)

## Demo
防止输入溢出.  
<img src="/img/demo.gif" width="280px"/>

## Features
- [x] **继承EditText，可以当作EditText使用**  
- [x] **防止输入溢出**  
- [x] **自定义验证码位数**  
- [x] **提供输入内容的监听器**  
- [x] **高度自适配**  
- [x] **属性自定义配置**  

## Version
名称|SlideMenuLayout
---|---
最新版本|![Download](https://api.bintray.com/packages/jkb/maven/vercodeedittext/images/download.svg)

## Configure
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