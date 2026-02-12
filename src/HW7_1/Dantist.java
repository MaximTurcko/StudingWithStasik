package HW7_1;

public class Dantist extends Doctor {
    public Dantist(String nameOfDoctor,  int codeOfDoctor) {
        super(nameOfDoctor, codeOfDoctor);
    }

    public int getCodeOfDoctor(){
    return codeOfDoctor.getCodeOfHelp();
    }
    @Override
    public String help() {
        return "Лечение ДАНСТИСТА. " + nameOfDoctor;
    }

    @Override
    public String toString(){
        return "Name of Dantist is: " + nameOfDoctor;
    }
}
