package pl.ms.designpatterns.observer;

/*
 * Created by Marcin on 2017-10-05 08:23
 */
public class ObserverClient {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        observable.addObserver(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());

        ONewsAgency oobservable = new ONewsAgency();
        ONewsChannel oobserver = new ONewsChannel();
        oobservable.addObserver(oobserver);
        oobservable.setNews("news");
        System.out.println(oobserver.getNews());
    }
}
