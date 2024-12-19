package com.fancy.experiment13_proxy.active_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//自定义请求处理程序类，实现InvocationHandler接口
public class BlogEditor implements InvocationHandler {
    private Object object;
    private BaseEditClass baseEditClass;
    private FilterClass filterClass;

//    有参构造函数，注入真实代理对象
    public BlogEditor(Object object) {
        this.object = object;
        baseEditClass = new BaseEditClass();
        filterClass = new FilterClass();
    }

//  在invoke()中调用真实主题对象的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        baseEditClass.baseEdit();                                    //额外的处理
        Object result = method.invoke(object, args);  //调用真实主题对象的方法
        filterClass.filter();                                    //额外的处理
        return result;
    }
}
