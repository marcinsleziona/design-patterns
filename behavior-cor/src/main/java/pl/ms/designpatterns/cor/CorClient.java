package pl.ms.designpatterns.cor;

/*
 * Created by Marcin on 2017-10-05 08:23
 */
public class CorClient {

    public static void main(String[] args) {
        AbstractSigner chairmanSigner = new ChairmanSigner();

        AbstractSigner presidentSigner = new PresidentSigner();
        presidentSigner.setNextAbstractSigner(chairmanSigner);

        AbstractSigner managerSigner = new ManagerSigner();
        managerSigner.setNextAbstractSigner(presidentSigner);

        managerSigner.processDocument();

    }
}
