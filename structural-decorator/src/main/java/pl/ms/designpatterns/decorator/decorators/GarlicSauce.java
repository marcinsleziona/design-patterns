package pl.ms.designpatterns.decorator.decorators;

import pl.ms.designpatterns.decorator.components.Pizza;

/*
 * Created by Marcin on 2017-09-04 15:12
 */
public class GarlicSauce extends PizzaDecorator {

    private Pizza pizza;

    public GarlicSauce(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getName() + " with GarlicSauce";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1;
    }
}

