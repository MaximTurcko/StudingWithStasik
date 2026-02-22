package HW8_3.Documents;

import java.util.Date;

public abstract class Documents {
    protected int number;
    protected Date date;
    //Почему при создании пустого конструктора я
    // не могу инициализоировать final поля?


    public Documents(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    public Documents(){}
}
