package HW7_1;

public class Clinica {
    private Hirurg hirurg;
    private Dantist dantist;
    private Therapevt therapevt;
    private Pacient pacient;

    public Clinica(Hirurg hirurg, Dantist dantist, Therapevt therapevt,
                   Pacient pacient) {
        this.hirurg = hirurg;
        this.dantist = dantist;
        this.therapevt = therapevt;
        this.pacient = pacient;
    }

    @Override
    public String toString() {
        return "My Clinica consist from: \n" +
                "\t" + this.hirurg + "\n" +
                "\t" + this.dantist + "\n" +
                "\t" + this.therapevt + "\n" +
                "\t" + this.pacient;
    }

    public Hirurg getHirurg(){
        return hirurg;
    }
    public String checkAndHelp(){
        if(hirurg.getCodeOfDoctor() == pacient.getNameCodeOfPacient()){
            return hirurg.help();
        } else if(dantist.getCodeOfDoctor() == pacient.getNameCodeOfPacient()){
            return dantist.help();
        } else return therapevt.help();
    }
}
