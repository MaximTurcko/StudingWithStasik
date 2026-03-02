package HW9_1.Register;

import HW9_1.Documents.Documents;

public interface IRegister {
    void saveTheDocument(Documents documents);

    void getInfo(String numberОfDocument);
}
