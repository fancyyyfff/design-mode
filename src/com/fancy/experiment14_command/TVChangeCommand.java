package com.fancy.experiment14_command;
//具体命令类
public class TVChangeCommand implements AbstractCommand{
    private Television television; //维持对接收者的引用

    public TVChangeCommand() {
        this.television = new Television();
    }

    @Override
    public void execute() {
        television.changeChannel();
    }
}

