package pl.ms.designpatterns.facade;

/*
 * Created by Marcin on 2017-09-05 12:09
 */
public class CoffeeCupProvider {

    public CoffeeCup provide() {
        return new CoffeeCup.Builder().size(10).name("Big").build();
    }
}
