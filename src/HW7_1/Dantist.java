package HW7_1;

public class Dantist extends Doctor {
    public Dantist(String nameOfDoctor){
        super(nameOfDoctor);
        this.nameOfDoctor = nameOfDoctor;
    }

    @Override
    public void help() {
        System.out.println("лечение ДАНСТИСТА ." + nameOfDoctor);
    }
}
