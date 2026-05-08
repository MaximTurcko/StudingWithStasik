package HW6.HW6_1;

public class Computer {
    int cost;
    String model;
    HDD hdd;
    RAM ram;

    public Computer(int cost, String model) {
        System.out.println("Computer selected!");
        System.out.println("Cost is: " + cost +
                " Model is: " + model);
        this.hdd = new HDD();
        this.ram = new RAM();
    }

    public Computer(int cost, String model, String hddName, int hddValue, String hddTip, String ramName, int ramValue){
        System.out.println("Computer selected!");
        System.out.println("Cost is: " + cost +
                " Model is: " + model);
        this.hdd = new HDD(hddName, hddValue, hddTip);
        this.ram = new RAM(ramName, ramValue);
        //System.out.println(ram.getValue());
    }

    public void getInfo(){
        System.out.println("This computer contains: \n" +
                        "Cost: " + this.cost + "\n" +
                        "Model: " + this.model + "\n" +
                "HDD: " + this.hdd + "\n" +
                "RAM: " + this.ram);
        System.out.println("**********************");
        hdd.getInfo();
        System.out.println("**********************");
        ram.getInfo();

    }
}
