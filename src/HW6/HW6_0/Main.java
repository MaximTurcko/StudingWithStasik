package HW6.HW6_0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        selectCard();
    }

    public static void selectCard(){
        System.out.println("Which card do you would like to choose?");
        System.out.println("You can choose the following number of card: 1, 2, 3" );
        int input = input().nextInt();
        switch (input){
            case 1: withdrawMoneyFromCard1();
            return;
            case 2: withdrawMoneyFromCard2();
            return;
            case 3: withdrawMoneyFromCard3();
            return;
            default:
                System.out.println("You chose nothing!");
        }
    }

    public static void withdrawMoneyFromCard1(){
        CreditCard card1 = new CreditCard();
        card1.numberOfAccaunt = 1;
        card1.moneyOfAccount = 100500;
        System.out.println("******************************");
        card1.getCardInfo();
        do {
            System.out.println("******************************");
            System.out.print("Write how many do you would like to withdraw: ");
            int input = input().nextInt();
            card1.withdrewMoneyFromCard(input);
            System.out.println("******************************");
            card1.getCardInfo();
            System.out.println("******************************");
        } while (card1.moneyOfAccount > 0);
    }
    public static void withdrawMoneyFromCard2(){
        CreditCard card2 = new CreditCard();
        card2.numberOfAccaunt = 2;
        card2.moneyOfAccount = 100;
        System.out.println("******************************");
        card2.getCardInfo();
        do {
            System.out.println("******************************");
            System.out.print("Write how many do you would like to withdraw: ");
            int input = input().nextInt();
            card2.withdrewMoneyFromCard(input);
            System.out.println("******************************");
            card2.getCardInfo();
            System.out.println("******************************");
        } while (card2.moneyOfAccount > 0);
    }
    public static void withdrawMoneyFromCard3(){
        CreditCard card3 = new CreditCard();
        card3.numberOfAccaunt = 3;
        card3.moneyOfAccount = 500;
        System.out.println("******************************");
        card3.getCardInfo();
        do {
            System.out.println("******************************");
            System.out.print("Write how many do you would like to withdraw: ");
            int input = input().nextInt();
            card3.withdrewMoneyFromCard(input);
            System.out.println("******************************");
            card3.getCardInfo();
            System.out.println("******************************");
        } while (card3.moneyOfAccount > 0);
    }
    public static Scanner input(){
        return new Scanner(System.in);
    }
}
