package pl.ms.designpatterns.adapter.adaptee;

/*
 * Created by Marcin on 2017-08-31 15:08
 */
public class Candle {

    public void fireUp() {
        System.out.println("Candle fireUp");
    }

    public void fireOff() {
        System.out.println("Candle fireOff");
    }
}
