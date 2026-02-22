package HW8_3.Stuff;

import HW8_3.Documents.Documents;
import HW8_3.Register.Register;

import java.util.Date;

public class Stuff extends Documents {
    private String stuffsName;
    private String dateOfEnd;

    public Stuff(int number, Date date, String stuffsName, String dateofEnd) {
        super(number, date);
        this.stuffsName = stuffsName;
        this.dateOfEnd = dateofEnd;
    }
    public Stuff(){}

    public String getInfo() {
        return "Stuff!";
    }
}
