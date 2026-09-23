package HW7_1;

public class Therapevt extends Doctor {
    public Therapevt(String nameOfDoctor, int codeOfDoctor) {
        super(nameOfDoctor, codeOfDoctor);
    }

    @Override
    public int getCodeOfDoctor() {
        return codeOfDoctor.getCodeOfHelp();
    }

    @Override
    public String help() {
        return "Лечение ТЕРАПЕВТА " + nameOfDoctor;
    }

    @Override
    public String toString(){
        return "Name of Therapevt is: " + nameOfDoctor;
    }
}
