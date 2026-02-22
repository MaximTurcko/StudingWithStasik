package HW8_3.Goods;

import HW8_3.Documents.Documents;
import HW8_3.Register.IRegister;

import java.util.Date;

public class Goods extends Documents  {
    private String tipe;
    private int quantity;

    public Goods(int number, Date date, String tipe, int quantity) {
        super(number, date);
        this.tipe = tipe;
        this.quantity = quantity;
    }
    public Goods(){}

    public String getInfo() {
        return tipe + " " + quantity + " " + date + " " + number;
    }
}
