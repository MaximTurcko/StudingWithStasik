package HW6.HW6_0;

public class CreditCard {
    int numberOfAccaunt;
    int moneyOfAccount;

    public void withdrewMoneyFromCard(int value) {
        if (moneyOfAccount > value) {
            System.out.println("You withdrew: " + value);
            moneyOfAccount -= value;
            System.out.println("Your Balance is: " + moneyOfAccount);
        } else if (moneyOfAccount < value) {
            System.out.println("You dont have enough money");
            System.out.println("Your Balance is: " + moneyOfAccount);
        } else {
            moneyOfAccount -= value;
            System.out.println("You withdrew all the your money. Congratulate you! Ive became " +
                    "poor BOMJ!");
            System.out.println("Your Balance is: " + moneyOfAccount);
        }
    }

    public void getCardInfo() {
        System.out.println("Your Card number is: " + numberOfAccaunt);
        System.out.println("Your Balance is: " + moneyOfAccount);
    }
}
