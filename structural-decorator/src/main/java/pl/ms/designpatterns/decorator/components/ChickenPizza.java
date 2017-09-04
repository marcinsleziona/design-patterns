package pl.ms.designpatterns.decorator.components;

/*
 * Created by Marcin on 2017-09-04 15:06
 */
public class ChickenPizza extends Pizza {

    public ChickenPizza() {
        setName("Chicken");
    }

    @Override
    public double cost() {
        return 10;
    }
}
