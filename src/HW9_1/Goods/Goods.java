package HW9_1.Goods;

import HW9_1.Documents.Documents;

public class Goods extends Documents  {
    private String tipe;
    private int quantity;

    public Goods(String number, String tipe, int quantity) {
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
}
