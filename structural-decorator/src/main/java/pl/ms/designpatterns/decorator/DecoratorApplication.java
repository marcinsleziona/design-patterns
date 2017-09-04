package pl.ms.designpatterns.decorator;

import pl.ms.designpatterns.decorator.components.ChickenPizza;
import pl.ms.designpatterns.decorator.components.HawaiianPizza;
import pl.ms.designpatterns.decorator.components.MargheritaPizza;
import pl.ms.designpatterns.decorator.components.Pizza;
import pl.ms.designpatterns.decorator.decorators.*;

/*
 * Created by Marcin on 2017-08-31 15:10
 */
public class DecoratorApplication {

    public static void main(String[] args) {
        Pizza chickenPizza = new ChickenPizza();
        Pizza hawaiianPizza = new HawaiianPizza();
        Pizza margheritaPizza = new MargheritaPizza();

        PizzaDecorator bbqSauce = new BBQSauce(chickenPizza);
        PizzaDecorator extraCheese = new ExtraCheese(chickenPizza);
        PizzaDecorator garlicSauce = new GarlicSauce(hawaiianPizza);
        PizzaDecorator rucola = new Rucola(margheritaPizza);

        System.out.println(bbqSauce.getDescription() + " will cost " + bbqSauce.cost());
        System.out.println(extraCheese.getDescription() + " will cost " + extraCheese.cost());
        System.out.println(garlicSauce.getDescription() + " will cost " + garlicSauce.cost());
        System.out.println(rucola.getDescription() + " will cost " + rucola.cost());
    }
}
