package pl.ms.designpatterns.observer;

import java.util.Observable;

/*
 * Created on 2020-08-26 08:52
 */
public class ONewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
