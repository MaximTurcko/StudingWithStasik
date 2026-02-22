package HW8_3.Stuff;

import HW8_3.Register.Register;

import java.util.Date;

public class Stuff extends Register {
    private final String stuffsName;
    private final String dateOfEnd;

    public Stuff(int number, Date date, String stuffsName, String dateofEnd) {
        super(number, date);
        this.stuffsName = stuffsName;
        this.dateOfEnd = dateofEnd;
    }

    @Override
    public String getInfo() {
        return "Stuff!";
    }
}
