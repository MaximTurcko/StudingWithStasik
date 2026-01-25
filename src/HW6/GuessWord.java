package HW6;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
    startGame();
    }

    public static void startGame(){
        getIntrductoryMsg();
        if (playGame()){
            System.out.println("LETS PLAY GAME!");
            getInstructions();
            String hiddenWord = getRandomWord(words());
            System.out.println(hiddenWord);
        } else {
            System.out.println("\nYou said NO. GOOODBYEEE!".toUpperCase());
        }

    }

    public static boolean playGame(){
        System.out.println("Would you want to play? Press 'y' to continue");
        return input().nextLine().equalsIgnoreCase("y");


    }
    public static void getIntrductoryMsg(){
        System.out.println("*********************************************");
        System.out.println("Welcome to Guess Word Game. the PC randomly selects words and higes it.");
        System.out.println("You should guess the word. If you are successful - YOU WIN.");
        System.out.println("*********************************************");

    }

    public static void getInstructions(){
        System.out.println("*********************************************");
        System.out.println("The AI have created a set of hidden words. Its stored these words in an array.");
        System.out.println("The random number has been generated to randomly select a word from the array.");
        System.out.println("You should guess the word either by a LETTER or a FULL WORD.");
        System.out.println("*********************************************");
    }

    public static String[] words(){
        return new String[]{
                "Aplle", "House", "Car", "Stone", "Dragon",
                "Vehicle", "Pineapple", "Watermelon", "Globe", "Tree",
                "Java", "Python", "Banana", "Building", "Butter",
                "Computer", "Notebook", "Bag", "Trousers", "Wardrobe", "Indah"
        };
    }

    public static String getRandomWord(String[] hiddenWord){
        return hiddenWord[new Random().nextInt(0, hiddenWord.length)];
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
}
