package HW8_3.Goods;

import HW8_3.Register.Register;

import java.util.Date;

public class Goods extends Register {
    private String tipe;
    private int quantity;

    public Goods(int number, Date date, String tipe, int quantity) {
        super(number, date);
        this.tipe = tipe;
        this.quantity = quantity;
    }

    @Override
    public String getInfo() {
        return tipe + " " + quantity + " " + date + " " + number;
    }
}
