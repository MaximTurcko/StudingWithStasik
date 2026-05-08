package HW6.HW6_0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //selectCard();
        depositToAccountCard4();
        depositToAccountCard5();
        withdrawFromAccount();

    }

    public static void depositToAccountCard4(){
        CreditCard card4 = new CreditCard();
        System.out.print("Please, enter Your deposit: ");
        card4.numberOfCard = 4;
        card4.depositToCard(input().nextInt());
    }
    public static void depositToAccountCard5(){
        CreditCard card5 = new CreditCard();
        System.out.print("Please, enter Your deposit: ");
        card5.numberOfCard = 5;
        card5.depositToCard(input().nextInt());
    }
    public static void withdrawFromAccount(){
        CreditCard card5 = new CreditCard();
        System.out.print("Please, enter Your value to withdraw: ");
        card5.numberOfCard = 6;
        card5.withdrewMoneyFromCard(input().nextInt());
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
        card1.numberOfCard = 1;
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
        card2.numberOfCard = 2;
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
        card3.numberOfCard = 3;
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
