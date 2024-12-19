package com.fancy.experiment14_command;

//调用者
public class Controller {
    private AbstractCommand openCommand,closeCommand,changeCommand;
    public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }
    //打开电视
    public void open() {
        openCommand.execute();
    }

    //切换电视频道
    public void close() {
        closeCommand.execute();
    }

    //关闭电视
    public void change() {
        changeCommand.execute();
    }


}
