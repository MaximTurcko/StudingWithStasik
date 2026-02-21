package HW8_2;

public class Worker implements IPosition {
    private String position;

    Worker(String position){
        this.position = position;
    }

    @Override
    public void getPosotion() {
        System.out.println("This homosapiens is: " + position);
    }
}
