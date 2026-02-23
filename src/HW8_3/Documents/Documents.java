package HW8_3.Documents;

import java.util.Date;

public abstract class Documents {
    protected int number;
    protected Date date =  new Date();
    //Почему при создании пустого конструктора я
    // не могу инициализоировать final поля?


    public Documents(int number) {
        this.number = number;
    }

    public Documents(){}

    public int getNumber(){
        return number;
    }
    public abstract String toString();
}
