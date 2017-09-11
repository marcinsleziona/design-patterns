package pl.ms.designpatterns.flyweight;

/*
 * Created by Marcin on 2017-09-11 12:54
 */
public class Coin {

    private String value;

    public Coin(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
