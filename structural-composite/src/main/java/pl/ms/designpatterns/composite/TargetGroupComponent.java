package pl.ms.designpatterns.composite;

/*
 * Created by Marcin on 2017-09-04 10:42
 */
public abstract class TargetGroupComponent {

    public void add(TargetGroupComponent component) {
        throw new UnsupportedOperationException("Can't add to target group.");
    }

    public void remove(TargetGroupComponent component) {
        throw new UnsupportedOperationException("Can't remove from target group.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Can't return name.");
    }

    public void print() {
        throw new UnsupportedOperationException("Can't print details.");
    }

}
