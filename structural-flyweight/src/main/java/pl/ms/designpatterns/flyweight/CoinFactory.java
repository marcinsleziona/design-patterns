package pl.ms.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by Marcin on 2017-09-11 12:54
 */
public class CoinFactory {

    private static Map<String, Coin> metals = new HashMap<>();

    public static Coin getCoinByMetal(String metal) {
        if(metals.containsKey(metal)) {
            return metals.get(metal);
        }
        Coin coin = new Coin(metal);
        metals.put(metal, coin);

        return coin;
    }

}
