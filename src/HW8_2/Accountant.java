package HW8_2;

public class Accountant implements IPosition {
    private String position;

    Accountant(String position) {
        this.position = position;
    }

    @Override
    public void getPosotion() {
        System.out.println("This homosapiens is: " + position);
    }
}
