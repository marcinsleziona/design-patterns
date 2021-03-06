package pl.ms.designpatterns.decorator.decorators;

import pl.ms.designpatterns.decorator.components.Pizza;

/*
 * Created by Marcin on 2017-09-04 15:13
 */
public class Rucola extends PizzaDecorator {

    private Pizza pizza;

    public Rucola(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getName() + " with Rucola";
    }

    @Override
    public double cost() {
        return pizza.cost() + 2;
    }
}

