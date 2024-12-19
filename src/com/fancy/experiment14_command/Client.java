package com.fancy.experiment14_command;

public class Client {
    public static void main(String[] args) {
        AbstractCommand openCommand,closeCommand,changeCommand;
        AbstractCommand aCChangeCommand,aCCloseCommand,aCOpenCommand;
        openCommand = new TVOpenCommand();
        closeCommand = new TVCloseCommand();
        changeCommand = new TVChangeCommand();
        Controller control = new Controller(openCommand,closeCommand,changeCommand);
        //打开电视
        openCommand.execute();

        //切换电视频道
        closeCommand.execute();

        //关闭电视
        changeCommand.execute();

        System.out.println("-----------------------------------------");

        aCOpenCommand = new TVOpenCommand();
        aCCloseCommand = new TVCloseCommand();
        aCChangeCommand = new ACChangeCommand();

//        打开空调
        aCOpenCommand.execute();
//        关闭空调
        aCCloseCommand.execute();
//        改变温度
        aCChangeCommand.execute();



    }
}
