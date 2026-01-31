package HW6.HW6_1;

public class HDD {
    public String name;
    public int value;
    public String tip;

    public HDD(){

    }

    public HDD(String name, int value, String tip) {
        this.name = name;
        this.value = value;
        this.tip = tip;
        System.out.println("Name HDD is : " + name +
                ", Value HDD is: " + value +
                ", Tip HDD is: " + tip);
    }
}
