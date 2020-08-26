package pl.ms.designpatterns.observer;

import lombok.Getter;
import lombok.Setter;

/*
 * Created on 2020-08-26 08:48
 */
@Getter
@Setter
public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
}
