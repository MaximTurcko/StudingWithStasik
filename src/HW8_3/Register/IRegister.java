package HW8_3.Register;

import HW8_3.Documents.Documents;

public interface IRegister {
    void saveTheDocument(Documents... documents);

    String getInfo();
}
