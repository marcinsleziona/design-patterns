package pl.ms.designpatterns.flyweight;

import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.List;

/*
 * Created by Marcin on 2017-09-11 12:57
 */
public class CoinClient {

    static List<String> values = Arrays.asList("1", "2", "5", "10", "20", "50");

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            String value = values.get(RandomUtils.nextInt(0, values.size()));
            System.out.println(CoinFactory.getCoinByValue(value).getValue());
        }
    }

}
