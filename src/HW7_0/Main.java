package HW7_0;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        getPhones();
    }

    public static void getPhones(){
        Phone iPhone = new Phone(11,"iPhone",103);
        Phone maxPhone = new Phone(12,"maxPhone",104);
        Phone bulbaPhone = new Phone(13,"bulbaPhone",105);
        System.out.println(iPhone.getFullInfo());
        System.out.println("*********************");
        System.out.println(maxPhone.getFullInfo());
        System.out.println("*********************");
        System.out.println(bulbaPhone.getFullInfo());
        System.out.println("**********************");
        System.out.println(iPhone.receiveCall());
        System.out.println(maxPhone.receiveCall());
        System.out.println(bulbaPhone.receiveCall());
        System.out.println("*********************");
        System.out.println(iPhone.receiveCall("max",228));
        iPhone.sendMassage("палим номер1","палим номер2");

    }
}