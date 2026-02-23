package HW8_3.Goods;

import HW8_3.Documents.Documents;
import HW8_3.Register.IRegister;

import java.util.Date;

public class Goods extends Documents  {
    private String tipe;
    private int quantity;

    public Goods(int number, String tipe, int quantity) {
        super(number);
        this.tipe = tipe;
        this.quantity = quantity;
    }
    public Goods(){}

    @Override
    public String toString() {
        return "*******************************" + "\n" +
                "Number is: " + number + "\n" +
                "Date is: " + date + "\n" +
                "Tipe is: " + tipe + "\n" +
                "Quantity is: " + quantity + "\n" +
                "*******************************";
    }


    public String getInfo() {
        return tipe + " " + quantity + " " + date + " " + number;
    }
}
