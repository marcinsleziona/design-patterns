package pl.ms.designpatterns.cor;

/*
 * Created by Marcin on 2017-10-05 08:20
 */
public abstract class AbstractSigner {

    private AbstractSigner nextAbstractSigner;

    public void setNextAbstractSigner(AbstractSigner nextAbstractSigner) {
        this.nextAbstractSigner = nextAbstractSigner;
    }

    public AbstractSigner getNextAbstractSigner() {
        return nextAbstractSigner;
    }

    abstract void signDocument();

    public void processDocument() {
        signDocument();
        if (getNextAbstractSigner() != null) {
            getNextAbstractSigner().processDocument();
        }
    }
}
