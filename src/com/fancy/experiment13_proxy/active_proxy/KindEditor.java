package com.fancy.experiment13_proxy.active_proxy;


public class KindEditor  implements Editor{
    public void html(){
        System.out.println("使用KindEditor插件的html方法编辑内容");
    };

    @Override
    public void edit() {
        html();
    }
}
