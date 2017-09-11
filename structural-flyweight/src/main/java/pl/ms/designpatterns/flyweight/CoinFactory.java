package pl.ms.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by Marcin on 2017-09-11 12:54
 */
public class CoinFactory {

    private static Map<String, Coin> coins = new HashMap<>();

    public static Coin getCoinByValue(String value) {
        if(coins.containsKey(value)) {
            return coins.get(value);
        }
        Coin coin = new Coin(value);
        coins.put(value, coin);

        return coin;
    }

}
