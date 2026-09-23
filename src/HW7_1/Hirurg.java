package HW7_1;

public class Hirurg extends Doctor{
    public Hirurg(String nameOfDoctor, int codeOfDoctor){
        super(nameOfDoctor, codeOfDoctor);
    }

    @Override
    public int getCodeOfDoctor() {
        return codeOfDoctor.getCodeOfHelp();
    }

    @Override
    public String help() {
        return "лечение Хирурга " + nameOfDoctor;
    }

    @Override
    public String toString(){
        return "Name of Hirurg is: " + nameOfDoctor;
    }
}
