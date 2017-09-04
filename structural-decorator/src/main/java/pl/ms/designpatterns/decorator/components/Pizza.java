package pl.ms.designpatterns.decorator.components;

/*
 * Created by Marcin on 2017-09-04 15:00
 */
public abstract class Pizza {
    private String name;

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public double cost();
}
