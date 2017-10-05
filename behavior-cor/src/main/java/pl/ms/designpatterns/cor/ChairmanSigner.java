package pl.ms.designpatterns.cor;

/*
 * Created by Marcin on 2017-10-05 08:21
 */
public class ChairmanSigner extends AbstractSigner {

    @Override
    public void signDocument() {
        System.out.println("Chairman signed the document");
    }
}
