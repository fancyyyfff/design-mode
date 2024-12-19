package com.fancy.experiment13_proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Editor editor;  //针对抽象编程，客户端无须分辨真实主题和代理类
        editor = (Editor)XMLUtil.getBean();
        editor.edit();
    }
}
