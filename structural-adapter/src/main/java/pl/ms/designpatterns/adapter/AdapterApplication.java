package pl.ms.designpatterns.adapter;

import pl.ms.designpatterns.adapter.adaptee.Candle;

/*
 * Created by Marcin on 2017-08-31 15:10
 */
public class AdapterApplication {

    public static void main(String[] args) {
        LightSwitch illuminatedLightSwitch = new IlluminatedLightSwitch();
        LightSwitch rockerLightSwitch = new RockerLightSwitch();

        Candle candle = new Candle();
        LightSwitch candleAdapter = new CandleAdapter(candle);

        illuminatedLightSwitch.on();
        illuminatedLightSwitch.off();

        rockerLightSwitch.on();
        rockerLightSwitch.off();

        candleAdapter.on();
        candleAdapter.off();
    }
}
