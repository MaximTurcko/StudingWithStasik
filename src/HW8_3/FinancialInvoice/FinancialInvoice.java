package HW8_3.FinancialInvoice;

import HW8_3.Register.Register;

import java.util.Date;

public class FinancialInvoice extends Register {
    private final int monthluTotal;
    private final int departmentsCode;

    public FinancialInvoice(int number, Date date, int monthluTotal, String dateofEnd, int departmentsCode) {
        super(number, date);
        this.monthluTotal = monthluTotal;
        this.departmentsCode = departmentsCode;
    }

    @Override
    public String getInfo() {
        return "FinancialInvoice!";
    }
}
