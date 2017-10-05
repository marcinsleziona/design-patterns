package pl.ms.designpatterns.cor;

/*
 * Created by Marcin on 2017-10-05 08:23
 */
public class ManagerSigner extends AbstractSigner {

    @Override
    public void signDocument() {
        System.out.println("Manager signed the document");
    }
}
