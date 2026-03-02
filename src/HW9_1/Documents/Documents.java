package HW9_1.Documents;

import HW9_1.Exceptions.AbcException;

import java.util.Date;

public abstract class Documents {
    protected String number;
    protected Date date =  new Date();
    //Почему при создании пустого конструктора я
    // не могу инициализоировать final поля?


    public Documents(String number) {
        this.number = number;
    }

    public Documents(){}

    public String getNumber(){
        return number;
    }
    public abstract String toString();

}
