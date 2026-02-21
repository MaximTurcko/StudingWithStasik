package HW7_1;

public class Clinica {
    private Doctor[] doctors;

    public Clinica(Doctor... doctors) {
        this.doctors = doctors;
    }

    public String checkAndHelp(Pacient pacient) {
        int codeOfPacient;
        if (pacient.getNameCodeOfPacient() != 1 && pacient.getNameCodeOfPacient() != 2){
            codeOfPacient = 3;
        } else {
            codeOfPacient = pacient.getNameCodeOfPacient();
        }
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i].getCodeOfDoctor() == codeOfPacient) {
                return doctors[i].help();
            }
        }
        return "Hernya";
    }
}
