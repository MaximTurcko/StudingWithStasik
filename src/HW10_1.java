//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HW10_1 {
    public static void main(String[] args) {
        endWith1a2b();
    }

    public static void get2TheFirstBlocks(){
        System.out.println(getNumber().substring(0,8));
    }

    public static void getReplaceLetters(){
        System.out.println(getNumber().replaceAll("(?<=-)[a-zA-Z]{3}(?=-)", "***"));
    }

    public static String getReplaceLetters2(){
        String yLetters = getNumber().replaceAll("[^a-zA-Z]", "");
        StringBuilder result = new StringBuilder(yLetters);
        result.insert(3,'/');
        result.insert(7,'/');
        result.insert(9,'/');
        System.out.println(result);
        return result.toString();
    }

    public static void getBeginingWithLetters(){
        StringBuilder d = new StringBuilder(getReplaceLetters2());
        d.insert(0, "Letters:");
        System.out.println(d);
    }

    public static void containsAbcABC(){
        System.out.println(getNumber().matches(".*(?i)abc.*"));
    }

    public static void startWith555(){
        System.out.println(getNumber().matches("^555.*"));
    }

    public static void endWith1a2b(){
        System.out.println(getNumber().matches(".*1a2b$"));
    }

    public static String getNumber(){
        return "5551-etd-7ABC-jyf-1a2b";
    }
}