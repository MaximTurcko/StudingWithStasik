package HW8_3.Register;

import java.util.Date;

public abstract class Register implements IRegister {
    protected final int number;
    protected final Date date;

    public Register(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    public void saveTheDocument() {
    }

    ;

    public String getInfo(){

    }
}
