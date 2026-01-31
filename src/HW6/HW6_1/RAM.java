package HW6.HW6_1;

public class RAM {

    String name;
    int value;

    public RAM(){
        System.out.println("RAM name is: " + name + " Ram value is: " + value);
    }
    public RAM(String ramName, int ramValue){
        this.name = ramName;
        this.value = ramValue;
        System.out.println("Name RAM is: " + name +
                ", Value RAM is: " + value);
    }

}
