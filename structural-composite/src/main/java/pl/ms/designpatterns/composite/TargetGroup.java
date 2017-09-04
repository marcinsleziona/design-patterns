package pl.ms.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by Marcin on 2017-09-04 10:48
 */
public class TargetGroup extends TargetGroupComponent {

    private String name;
    private List<TargetGroupComponent> list = new ArrayList<>();

    public TargetGroup(String name) {
        this.name = name;
    }

    @Override
    public void add(TargetGroupComponent component) {
        list.add(component);
    }

    @Override
    public void remove(TargetGroupComponent component) {
        list.remove(component);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(String.format("TargetGroup: %s", name));
        list.forEach(TargetGroupComponent::print);
    }
}
