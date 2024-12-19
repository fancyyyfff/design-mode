package com.fancy.experiment13_proxy;
//代理类
public class BlogEditor implements Editor {
//    维护一个对真实主题的引用
    private ContentEditor contentEditor = new ContentEditor();

    @Override
    public void edit() {
        baseEdit();
        contentEditor.edit();
        filter();
    }

    public void baseEdit() {
        System.out.println("博文基本信息编辑");
    }

    public void filter() {
        System.out.println("敏感词过滤");
    }
}
