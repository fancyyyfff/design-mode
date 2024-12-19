package com.fancy.experiment13_proxy.active_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = null;

        Editor realEditor = null;
        realEditor = (Editor) XMLUtil.getBean();
        invocationHandler = new BlogEditor(realEditor);  //在自定义请求处理程序类中放入具体主题类!!关键处理
        Editor proxy = null;  // 抽象主题类型的 动态创建的代理类实例

        proxy = (Editor) Proxy.newProxyInstance(
                Editor.class.getClassLoader(),  //代理类（抽象主题）的类加载器
                new Class[]{Editor.class},      //代理类（真实主题）的接口列表
                invocationHandler               //自定义请求处理程序类，实现了InvocationHandler接口
        );

        proxy.edit();   //直接就是抽象类中定义的方法，但实际会调用BlogEditor处理过的方法

    }
}
