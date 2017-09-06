package pl.ms.designpatterns.facade;

/*
 * Created by Marcin on 2017-09-05 11:48
 */
public class CoffeeCup {

    private String name;
    private int size;

    private String description;

    private CoffeeCup(Builder builder) {
        name = builder.name;
        size = builder.size;
        description = "Size: "+builder.name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addMilk(Milk milk) {
        description += " +Milk";
    }

    public void addSugar(Sugar sugar) {
        description += " +Sugar";
    }

    public void addWater(Water water) {
        description += " +Water";
    }

    public void addCoffee(Coffee coffee) {
        description += " +Coffee";
    }


    public static final class Builder {
        private String name;
        private int size;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder size(int val) {
            size = val;
            return this;
        }

        public CoffeeCup build() {
            return new CoffeeCup(this);
        }
    }
}
