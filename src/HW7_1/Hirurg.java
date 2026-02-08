package HW7_1;

public class Hirurg extends Doctor {
    public Hirurg(String nameOfDoctor){
        super(nameOfDoctor);
        this.nameOfDoctor = nameOfDoctor;
    }

    @Override
    public void help() {
        System.out.println("лечение Хирурга "  + nameOfDoctor);
    }
}
