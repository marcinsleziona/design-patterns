package pl.ms.designpatterns.decorator.components;

/*
 * Created by Marcin on 2017-09-04 15:05
 */
public class MargheritaPizza extends Pizza {

    public MargheritaPizza() {
        setName("Margherita");
    }

    @Override
    public double cost() {
        return 3;
    }
}
