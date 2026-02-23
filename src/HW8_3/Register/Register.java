package HW8_3.Register;

import HW8_3.Documents.Documents;

public class Register implements IRegister {
    private Documents[] documents = new Documents[10];
    private int counter = 0;

    public Register(){}

    public void saveTheDocument(Documents document) {
        if(counter < documents.length) {
                documents[counter] = document;
                counter++;
            System.out.println("The document number " + counter + " created! ");
        } else System.out.println("Error! Array is full!");
    }

    public void getInfo(int numberОfDocument){
        for (int i = 0; i < counter; i++) {
            if (documents[i].getNumber() == numberОfDocument) {
                System.out.println("You chose this document: " + "\n" +
                        documents[i]);
                return;
            }
        }
        System.out.println("Error! This document isn't created!");
    }
}
