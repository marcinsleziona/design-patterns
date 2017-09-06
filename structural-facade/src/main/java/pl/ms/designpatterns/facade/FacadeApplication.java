package pl.ms.designpatterns.facade;

/*
 * Created by Marcin on 2017-08-31 15:10
 */
public class FacadeApplication {

    public static void main(String[] args) {
        CoffeeMakerFacade coffeeMakerFacade = new CoffeeMakerFacade();

        CoffeeCup coffeeCup1 = coffeeMakerFacade.makeCoffee(false, false);
        CoffeeCup coffeeCup2 = coffeeMakerFacade.makeCoffee(false, true);

        System.out.println(coffeeCup1.getDescription());
        System.out.println(coffeeCup2.getDescription());
    }
}
