package pl.ms.designpatterns.composite;

/*
 * Created by Marcin on 2017-08-31 15:10
 */
public class CompositeApplication {

    public static void main(String[] args) {
        TargetGroupComponent all = new TargetGroup("All");

        TargetGroupComponent kids = new TargetGroup("Kids");
        TargetGroupComponent adultsUnder30 = new TargetGroup("Adults Under 30");
        TargetGroupComponent adultsOver30 = new TargetGroup("Aduls Over 30");

        Client maleKid_1 = new Client("Kid", "Male", 5);
        Client maleKid_2 = new Client("Kid", "Male", 10);
        Client femaleKid_1 = new Client("Kid", "Female", 5);
        Client femaleKid_2 = new Client("Kid", "Female", 10);

        Client maleAdultUnder30_1 = new Client("Adult Under 30", "Male", 20);
        Client maleAdultUnder30_2 = new Client("Adult Under 30", "Male", 25);
        Client femaleAdultUnder30_1 = new Client("Adult Under 30", "Female", 20);
        Client femaleAdultUnder30_2 = new Client("Adult Under 30", "Female", 25);

        Client maleAdultOver30_1 = new Client("Adult Over 30", "Male", 40);
        Client maleAdultOver30_2 = new Client("Adult Over 30", "Male", 70);
        Client femaleAdultOver30_1 = new Client("Adult Over 30", "Female", 40);
        Client femaleAdultOver30_2 = new Client("Adult Over 30", "Female", 70);

        kids.add(maleKid_1);
        kids.add(maleKid_2);
        kids.add(femaleKid_1);
        kids.add(femaleKid_2);

        adultsUnder30.add(maleAdultUnder30_1);
        adultsUnder30.add(maleAdultUnder30_2);
        adultsUnder30.add(femaleAdultUnder30_1);
        adultsUnder30.add(femaleAdultUnder30_2);

        adultsOver30.add(maleAdultOver30_1);
        adultsOver30.add(maleAdultOver30_2);
        adultsOver30.add(femaleAdultOver30_1);
        adultsOver30.add(femaleAdultOver30_2);

        all.add(kids);
        all.add(adultsUnder30);
        all.add(adultsOver30);

        all.print();

    }
}
