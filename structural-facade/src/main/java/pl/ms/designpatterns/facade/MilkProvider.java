package pl.ms.designpatterns.facade;

/*
 * Created by Marcin on 2017-09-05 12:09
 */
public class MilkProvider {

    public Milk provide() {
        return new Milk();
    }

}
