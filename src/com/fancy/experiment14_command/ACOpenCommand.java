package com.fancy.experiment14_command;
//具体命令类
public class ACOpenCommand implements AbstractCommand{
    private AirConditioner airConditioner;  //维持唯一接收者

    public ACOpenCommand() {
        this.airConditioner = new AirConditioner();
    }

    @Override
    public void execute() {
        airConditioner.open();
    }
}
