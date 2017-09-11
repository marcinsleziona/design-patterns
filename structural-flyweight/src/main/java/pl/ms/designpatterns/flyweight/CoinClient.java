package pl.ms.designpatterns.flyweight;

import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.List;

/*
 * Created by Marcin on 2017-09-11 12:57
 */
public class CoinClient {

    static List<String> coinageMetals = Arrays.asList("Gold", "Silver", "CuproNickel", "ManganeseBronze");

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            String value = coinageMetals.get(RandomUtils.nextInt(0, coinageMetals.size()));
            Coin c = CoinFactory.getCoinByMetal(value);
            c.print(getRandomValue(CoinValue.values()));
        }
    }

    private static CoinValue getRandomValue(CoinValue[] values) {
        return values[RandomUtils.nextInt(0, values.length)];
    }

}
