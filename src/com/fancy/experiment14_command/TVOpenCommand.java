package com.fancy.experiment14_command;

public class TVOpenCommand implements AbstractCommand{
    private Television television; //维持对接收者的引用

    public TVOpenCommand() {
        this.television = new Television();
    }

    @Override
    public void execute() {
        television.open();
    }
}
