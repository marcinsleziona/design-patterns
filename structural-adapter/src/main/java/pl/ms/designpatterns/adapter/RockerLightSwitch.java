package pl.ms.designpatterns.adapter;

/*
 * Created by Marcin on 2017-08-31 15:05
 */
public class RockerLightSwitch implements LightSwitch {

    @Override
    public void on() {
        System.out.println("RockerLightSwitch ON");
    }

    @Override
    public void off() {
        System.out.println("RockerLightSwitch OFF");
    }
}
