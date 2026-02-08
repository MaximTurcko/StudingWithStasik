package HW7_1;

public class Therapevt extends Doctor{

    public Therapevt(String nameOfDoctor){
        super(nameOfDoctor);
        this.nameOfDoctor = nameOfDoctor;
    }

    @Override
    public void help() {
        System.out.println("Лечение ТЕРАПЕВТА " + nameOfDoctor);
    }

}
