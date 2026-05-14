package HW9_1.FinancialInvoice;

import HW9_1.Documents.Documents;

public class FinancialInvoice extends Documents {
    private int monthluTotal;
    private int departmentsCode;

    public FinancialInvoice(String number, int monthluTotal, int departmentsCode) {
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
