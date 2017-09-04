package pl.ms.designpatterns.decorator.decorators;

import pl.ms.designpatterns.decorator.components.Pizza;

/*
 * Created by Marcin on 2017-09-04 15:11
 */
public class BBQSauce extends PizzaDecorator {

    private Pizza pizza;

    public BBQSauce(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getName() + " with BBQSauce";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1;
    }
}
