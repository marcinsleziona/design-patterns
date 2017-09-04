package pl.ms.designpatterns.decorator.decorators;

import pl.ms.designpatterns.decorator.components.Pizza;

/*
 * Created by Marcin on 2017-09-04 15:06
 */
public abstract class PizzaDecorator extends Pizza {

    public abstract String getDescription();

}
