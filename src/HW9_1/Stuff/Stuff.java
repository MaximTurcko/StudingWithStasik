package HW9_1.Stuff;

import HW9_1.Documents.Documents;

public class Stuff extends Documents {
    private String stuffsName;
    private String dateOfEnd;

    public Stuff(String number, String stuffsName, String dateofEnd) {
        super(number);
        this.stuffsName = stuffsName;
        this.dateOfEnd = dateofEnd;
    }
    public Stuff(){}

    @Override
    public String toString() {
        return "*******************************" + "\n" +
                "Number is: " + number + "\n" +
                "Date is: " + date + "\n" +
                "Stuffs Name is: " + stuffsName + "\n" +
                "Date of end is: " + dateOfEnd + "\n" +
                "*******************************";
    }
}
