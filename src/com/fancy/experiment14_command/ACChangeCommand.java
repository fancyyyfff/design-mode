package com.fancy.experiment14_command;

public class ACChangeCommand  implements AbstractCommand{
    private AirConditioner airConditioner;  //维持唯一接收者

    public ACChangeCommand() {
        this.airConditioner = new AirConditioner();
    }

    @Override
    public void execute() {
        airConditioner.changeTemperature();
    }
}
