package pl.ms.designpatterns.facade;

/*
 * Created by Marcin on 2017-09-05 12:07
 */
public class CoffeeMakerFacade {

    private CoffeeProvider coffeeProvider = new CoffeeProvider();
    private MilkProvider milkProvider = new MilkProvider();
    private WaterProvider waterProvider = new WaterProvider();
    private CoffeeCupProvider coffeeCupProvider = new CoffeeCupProvider();
    private SugarProvider sugarProvider = new SugarProvider();

    public CoffeeCup makeCoffee(boolean addMilk, boolean addSugar) {
        CoffeeCup coffeeCup = coffeeCupProvider.provide();

        coffeeCup.addCoffee(coffeeProvider.provide());
        coffeeCup.addWater(waterProvider.provide());
        if (addSugar) {
            coffeeCup.addSugar(sugarProvider.provide());
        }
        if (addMilk) {
            coffeeCup.addMilk(milkProvider.provide());
        }

        return coffeeCup;
    }
}
