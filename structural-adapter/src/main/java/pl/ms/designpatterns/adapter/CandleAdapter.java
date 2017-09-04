package pl.ms.designpatterns.adapter;

import pl.ms.designpatterns.adapter.adaptee.Candle;

/*
 * Created by Marcin on 2017-08-31 15:09
 */
public class CandleAdapter implements LightSwitch {

    private Candle candle;

    public CandleAdapter(Candle candle) {
        this.candle = candle;
    }

    @Override
    public void on() {
        candle.fireUp();
    }

    @Override
    public void off() {
        candle.fireOff();
    }
}
