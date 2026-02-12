package HW7_1;

public class Main_0 {
    public static void main(String[] args) {
    Clinica test = new Clinica(
            new Hirurg("Just Pudge", 1),
            new Dantist("Bezzuby men", 2),
            new Therapevt("Vso Hernya", 3),
            new Pacient("Just Bedolaga", 2)
    );
        System.out.println(test.getHirurg().getCodeOfDoctor());
        System.out.println(test.checkAndHelp());

    }
}
