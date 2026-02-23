package HW8_3.Main;

import HW8_3.Documents.Documents;
import HW8_3.FinancialInvoice.FinancialInvoice;
import HW8_3.Goods.Goods;
import HW8_3.Register.Register;
import HW8_3.Stuff.Stuff;


import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Register goods1 = new Register();
        goods1.saveTheDocument(new Goods(1,
                "sasd", 1));
        goods1.saveTheDocument(new Stuff(2,
                "Vasia","11.11.2011"));
        goods1.saveTheDocument(new Stuff(3,
                "Vos","11.11.2011"));
        goods1.saveTheDocument(new FinancialInvoice(4,
                1003, 2043));
        goods1.saveTheDocument(new FinancialInvoice(5,
                1003, 2043));
        goods1.saveTheDocument(new FinancialInvoice(6,
                1003, 2043));
        goods1.saveTheDocument(new FinancialInvoice(7,
                1003, 2043));
        goods1.saveTheDocument(new FinancialInvoice(8,
                1003, 2043));
        goods1.saveTheDocument(new FinancialInvoice(9,
                1003, 2043));
        goods1.saveTheDocument(new FinancialInvoice(10,
                1003, 2043));
        goods1.saveTheDocument(new FinancialInvoice(11,
                1003, 2043));
        goods1.getInfo(5);
        goods1.getInfo(11);
    }
}