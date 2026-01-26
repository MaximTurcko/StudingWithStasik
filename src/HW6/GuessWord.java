package HW6;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        getIntrductoryMsg();
        if (playGame()) {
            System.out.println("LETS PLAY GAME!");
            getInstructions();
            char[] hiddenWord = getRandomWord(words()).toCharArray();
            System.out.println(hiddenWord);
            System.out.print("Write the Letter or WORD: ");
            String input = input().nextLine();
            char[] guessWord = new char[hiddenWord.length];
            for (int i = 0; i < guessWord.length; i++) {
                guessWord[i] = hiddenWord[i];
            }
            while (input.length() == 0) {
                System.out.println("You Wrote nothing. Please, try again");
                input = input().nextLine();
            }
            if (input.length() == 1) {
                char  inputChar = input.charAt(0);
                for (int i = 0; i < hiddenWord.length; i++) {
                    if(hiddenWord[i] == inputChar){
                        guessWord[i] = inputChar;
                    } else guessWord[i] ='*';
                }
                printGuessWord();

            } else if (input.length() > 1) {
                if (String.valueOf(hiddenWord).equalsIgnoreCase(input)) {
                    System.out.println("YOU HAVE WON!");
                    return;
                } else System.out.println("You NOT to guess the WORD");
            }

        } else {
            System.out.println("\nYou said NO. GOOODBYEEE!".toUpperCase());
        }

    }

    public static boolean playGame() {
        System.out.println("Would you want to play? Press 'y' to continue");
        return input().nextLine().equalsIgnoreCase("y");


    }

    public static void getIntrductoryMsg() {
        System.out.println("*********************************************");
        System.out.println("Welcome to Guess Word Game. the PC randomly selects words and higes it.");
        System.out.println("You should guess the word. If you are successful - YOU WIN.");
        System.out.println("*********************************************");

    }

    public static void getInstructions() {
        System.out.println("*********************************************");
        System.out.println("The AI have created a set of hidden words. Its stored these words in an array.");
        System.out.println("The random number has been generated to randomly select a word from the array.");
        System.out.println("You should guess the word either by a LETTER or a FULL WORD.");
        System.out.println("*********************************************");
    }

    public static String[] words() {
        return new String[]{
                "Aplle", "House", "Car", "Stone", "Dragon",
                "Vehicle", "Pineapple", "Watermelon", "Globe", "Tree",
                "Java", "Python", "Banana", "Building", "Butter",
                "Computer", "Notebook", "Bag", "Trousers", "Wardrobe", "Indah"
        };
    }

    public static String getRandomWord(String[] hiddenWord) {
        return hiddenWord[new Random().nextInt(0, hiddenWord.length)];
    }

    public static void printGuessWord(){
        for (int el : guessWord){
            System.out.print(el + "\t");
        }
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }
}
