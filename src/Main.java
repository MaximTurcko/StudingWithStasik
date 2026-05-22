import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPaliandrome(13));
    }

    public static boolean isPaliandrome(int x) {
        StringBuilder str = new StringBuilder(Integer.toString(x));
        System.out.println(str);
//        if(str.reverse().toString().equals(Integer.toString(x))){
//            return true;
//        } else return false;
        String y = str.reverse().toString();
        for (int i = 0; i < str.length(); i++) {
            if(y.charAt(i) != Integer.toString(x).charAt(i)){
                return false;
            }
        }
        return true;
    }
}