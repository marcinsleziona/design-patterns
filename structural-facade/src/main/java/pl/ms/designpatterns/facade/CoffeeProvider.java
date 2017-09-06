package pl.ms.designpatterns.facade;

/*
 * Created by Marcin on 2017-09-05 14:28
 */
public class CoffeeProvider {

    public Coffee provide() {
        return new Coffee();
    }

}
