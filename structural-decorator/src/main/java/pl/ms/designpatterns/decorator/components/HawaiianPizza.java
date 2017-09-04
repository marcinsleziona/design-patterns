package pl.ms.designpatterns.decorator.components;

/*
 * Created by Marcin on 2017-09-04 15:03
 */
public class HawaiianPizza extends Pizza {

    public HawaiianPizza() {
        setName("Hawaiian");
    }

    @Override
    public double cost() {
        return 5;
    }
}
