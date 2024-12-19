package com.fancy.experiment14_command;

public class TVCloseCommand implements AbstractCommand{
    private Television television; //维持对接收者的引用

    public TVCloseCommand() {
        this.television = new Television();
    }

    @Override
    public void execute() {
        television.close();
    }
}
