package pl.ms.designpatterns.flyweight;

/*
 * Created by Marcin on 2017-09-11 12:54
 */
public class Coin {

    private String metal;

    public Coin(String metal) {
        this.metal = metal;
    }

    public void print(CoinValue value) {
        System.out.println(String.format("Made of: %20s with value: %5s", metal, value));
    }
}
