import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW10_2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]+");
        Matcher matcher = p.matcher(" community edition idea");
        int minLenght = 9999;
        String matchWordMin = "";
        while (matcher.find()){
            if(minLenght > matcher.end() - matcher.start()){
                minLenght =  matcher.end() - matcher.start();
                matchWordMin = matcher.group();
            }
//            System.out.println(matcher.start() + "-" + matcher.end());
        }
        System.out.println(minLenght + " " + matchWordMin);
        Matcher matcherMax = p.matcher("   edition editior idea rommunity community");
        int maxLenght = 0;
        String matchWordMax = "";
        while (matcherMax.find()) {
            if (maxLenght < matcherMax.end() - matcherMax.start() ||
                    maxLenght == matcherMax.end() - matcherMax.start()) {
                maxLenght = matcherMax.end() - matcherMax.start();
                matchWordMax = matcherMax.group();
            }
        }
        System.out.println(maxLenght + " " + matchWordMax);
    }
}
