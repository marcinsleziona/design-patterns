package pl.ms.designpatterns.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

/*
 * Created on 2020-08-26 08:53
 */
@Getter
@Setter
public class ONewsChannel implements Observer {

    private String news;

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
    }
}
