package pl.ms.designpatterns.composite;

/*
 * Created by Marcin on 2017-09-04 10:46
 */
public class Client extends TargetGroupComponent {

    private String name;
    private String sex;
    private int age;

    public Client(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void print() {
        System.out.println(String.format("Client name: %s, sex: %s, age: %s", name, sex, age));
    }
}
