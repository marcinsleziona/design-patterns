package pl.ms.designpatterns.adapter;

/*
 * Created by Marcin on 2017-08-31 14:13
 */
public class IlluminatedLightSwitch implements LightSwitch {

    @Override
    public void on() {
        System.out.println("IlluminatedLightSwitch ON");
    }

    @Override
    public void off() {
        System.out.println("IlluminatedLightSwitch OFF");
    }
}
