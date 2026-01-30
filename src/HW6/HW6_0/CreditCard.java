package HW6.HW6_0;

public class CreditCard {
    int numberOfCard;
    static int moneyOfAccount = 10;

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
            System.out.println("You withdrew all the your money. Congratulate you! Youve became " +
                    "poor BOMJ!");
            System.out.println("Your Balance is: " + moneyOfAccount);
        }
    }

    public void depositToCard(int value){
        moneyOfAccount += value;
        System.out.println("Your Deposit was successfully");
        System.out.println("Your Balance is: " + moneyOfAccount);
    }

    public void getCardInfo() {
        System.out.println("Your Card number is: " + numberOfCard);
        System.out.println("Your Balance is: " + moneyOfAccount);
    }
}
