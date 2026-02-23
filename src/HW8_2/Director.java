package HW8_2;

public class Director implements IPosition {
    private String position;

    Director(String position) {
        this.position = position;
    }

    @Override
    public void getPosotion() {
        System.out.println("This homosapiens is: " + position);
    }
}
