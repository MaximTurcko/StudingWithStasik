package HW7_1;

public class PlanOfHelp {

    private final int codeOfHelp;

    public PlanOfHelp(int codeOfHelp) {
        this.codeOfHelp = codeOfHelp;
    }

    public int getCodeOfHelp() {
        return codeOfHelp;
    }

    @Override
    public String toString() {
        return String.format("%d", getCodeOfHelp());
    }
}
