public class HW10_5 {
    public static void main(String[] args) {
        String line = "IDEA Community Edition";
        StringBuffer u = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
        String c = ""; // текущий символ в строке
        for (int i = 0; i < line.length(); i++) { // обход строки
            c = String.valueOf(line.charAt(i)); // получить текущий символ
                u.append(c);
                u.append(c); // добавляем
        }
        System.out.println(u);
    }
}
