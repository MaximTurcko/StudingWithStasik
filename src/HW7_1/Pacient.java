package HW7_1;

public class Pacient {

    private String nameOfPacient;
    private PlanOfHelp codeOfHelp;

    public Pacient(String nameOfPacient, int  codeOfHelp) {
        this.nameOfPacient = nameOfPacient;
        this.codeOfHelp = new PlanOfHelp(codeOfHelp);
    }

    public int getNameCodeOfPacient() {
        return this.codeOfHelp.getCodeOfHelp();
    }

    @Override
    public String toString(){
        return "This pacients name is: " + nameOfPacient +  "\n" +
                "And his code of help is: " + codeOfHelp;
    }
}
