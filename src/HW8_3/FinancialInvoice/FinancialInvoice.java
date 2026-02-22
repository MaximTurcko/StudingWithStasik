package HW8_3.FinancialInvoice;

import HW8_3.Documents.Documents;

import java.util.Date;

public class FinancialInvoice extends Documents {
    private final int monthluTotal;
    private final int departmentsCode;

    public FinancialInvoice(int number, Date date, int monthluTotal, String dateofEnd, int departmentsCode) {
        super(number, date);
        this.monthluTotal = monthluTotal;
        this.departmentsCode = departmentsCode;
    }
    public FinancialInvoice(){}

    public String getInfo() {
        return "FinancialInvoice!";
    }
}
