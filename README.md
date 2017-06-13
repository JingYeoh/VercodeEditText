# SlideMenuLayout
## Introduction
An android Verification code EditText.   
一个支持左右滑动并带有视差滑动效果的安卓滑动菜单控件。([中文版入口](README-CN.md))  
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
<img src="https://img.shields.io/badge/license-Apache 2.0-green.svg?style=flat">
[![API](https://img.shields.io/badge/API-12%2B-green.svg?style=flat)](https://android-arsenal.com/api?level=11)

## Demo
Prevent input overflow.  
<img src="/img/demo.gif" width="280px"/>

## Features
- [x] **Extends EditText,it can be used as EditText**  
- [x] **Prevent input overflow**  
- [x] **Custom validation code length**  
- [x] **Provide input value listener**  
- [x] **Layout height is auto adjust**  
- [x] **Attributes can be configured for customization**  

## Version
name|SlideMenuLayout
---|---
latest|![Download](https://api.bintray.com/packages/jkb/maven/vercodeedittext/images/download.svg)

## Configure
#### Maven
```xml
<dependency>
  <groupId>com.justkiddingbaby</groupId>
  <artifactId>vercodeedittext</artifactId>
  <version>the latest version</version>
  <type>pom</type>
</dependency>
```
#### JCenter
First. add to project build.gradle
```gradle
repositories {
    jcenter()
}
```
Second. add to module build.gradle
```gradle
compile 'com.justkiddingbaby:vercodeedittext:the latest version'
```

## Attributes instruction
attribute|instruction|value
---|---|---
|[slideMode](/slidemenu/src/main/res/values/attrs.xml)|sliding mode|left right both none|
|[slidePadding](/slidemenu/src/main/res/values/attrs.xml)|the content view padding when slide menu is opened|dimension|
|[slideTime](/slidemenu/src/main/res/values/attrs.xml)|the time of slide menu open,the default value is 800ms|integer|