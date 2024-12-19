package com.fancy.experiment14_command;
//抽象命令类 ：供客户端（请求者）调用,客户端只需执行execute
public interface AbstractCommand {
    public void execute();
}
