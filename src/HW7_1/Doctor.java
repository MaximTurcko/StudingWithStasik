package HW7_1;

public abstract class Doctor {
    protected String nameOfDoctor;
    protected PlanOfHelp codeOfDoctor;

    public Doctor(String nameOfDoctor, int codeOfDoctor) {
        this.nameOfDoctor  = nameOfDoctor;
        this.codeOfDoctor = new PlanOfHelp(codeOfDoctor);
    }

    public abstract int getCodeOfDoctor();

    public abstract String help();
}
