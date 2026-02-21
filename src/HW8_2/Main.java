package HW8_2;

public class Main {
    public static void main(String[] args) {
    Director director = new Director("director");
    Worker worker = new Worker("ultraworker");
    Accountant accountant = new Accountant("stiller!");

    director.getPosotion();
    worker.getPosotion();
    accountant.getPosotion();
    // Вопрос к Стасику! Можно ли создать задать интерфейс дочернему классу?
        // если да, то это все можно написать в одном массиве дочерних класслв!
    }
}
