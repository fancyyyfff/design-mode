package com.fancy.experiment14_command;

public class ACCloseCommand  implements AbstractCommand{
    private AirConditioner airConditioner;  //维持唯一接收者

    public ACCloseCommand() {
        this.airConditioner = new AirConditioner();
    }

    @Override
    public void execute() {
        airConditioner.close();
    }
}