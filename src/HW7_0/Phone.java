package HW7_0;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        //Вызвать из конструктора с тремя параметрами конструктор с двумя.
        //Не сработал!?
        //Phone one = new Phone(number,model);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getFullInfo() {
        return "Number: " + number + ".\n" +
                "Model: " + model + ".\n" +
                "Weight: " + weight;
    }

    public String receiveCall() {
        String nameOfCall = "Продукт";
        System.out.println("*********************");
        return "Звонит: " + nameOfCall + ".\n" +
                "Его номер: " + getNumber();
    }

    public String receiveCall(String nameOfCall, int numberOfCall){
        return "Звонит: " + nameOfCall + ". \n" +
                "Его номер: " + numberOfCall;
    }

    public void sendMassage(String... phoneNumbers){
        for (int i = 0; i < phoneNumbers.length; i++) {
            System.out.println(phoneNumbers[i]);
        }
    }

    public int getNumber(){
        return number;
    }
}


