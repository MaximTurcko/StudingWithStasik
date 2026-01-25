package HW6;

public class GuessWord {
    public static void main(String[] args) {

    }

    public static void startGame(){
        getIntrductoryMsg();


    }

    public static boolean playGame(){
        System.out.println("would you want to play? Press 'y' to continue");

    }
    public static void getIntrductoryMsg(){
        System.out.println("Welcome to Guess Word Game. the PC randomly selects words and higes it.");
        System.out.println("You should guess the word. If you are successful - YOU WIN.");
    }


}
