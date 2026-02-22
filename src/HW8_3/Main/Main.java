package HW8_3.Main;

import HW8_3.Goods.Goods;
import HW8_3.Register.Register;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Register goods1 = new Goods(1,new Date(),"Шмот",100500);
        System.out.println(goods1.getInfo());
    }
}