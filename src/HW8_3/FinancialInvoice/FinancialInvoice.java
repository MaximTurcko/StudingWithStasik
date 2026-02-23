package HW8_3.FinancialInvoice;

import HW8_3.Documents.Documents;

import java.util.Date;

public class FinancialInvoice extends Documents {
    private int monthluTotal;
    private int departmentsCode;

    public FinancialInvoice(int number, int monthluTotal, int departmentsCode) {
        super(number);
        this.monthluTotal = monthluTotal;
        this.departmentsCode = departmentsCode;
    }
    public FinancialInvoice(){}

    @Override
    public String toString() {
        return "*******************************" + "\n" +
                "Number is: " + number + "\n" +
                "Date is: " + date + "\n" +
                "Monthly total is: " + monthluTotal + "\n" +
                "Departaments code is: " + departmentsCode + "\n" +
                "*******************************";
    }


    public String getInfo() {
        return "FinancialInvoice!";
    }
}
