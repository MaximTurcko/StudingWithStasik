package HW9_1.Register;

import HW9_1.Documents.Documents;
import HW9_1.Exceptions.AbcException;
import HW9_1.Exceptions.EndWith1a2bException;
import HW9_1.Exceptions.StartWith555Exception;

import java.util.Objects;

public class Register implements IRegister {
    private Documents[] documents = new Documents[10];
    private int counter = 0;

    public Register(){}

    public void saveTheDocument(Documents document) {
        if(counter < documents.length) {
                documents[counter] = document;
            System.out.println("The document number " + counter + " created! ");
        } else System.out.println("Error! Array is full!");
    }

    public void getInfo(String numberОfDocument){
        for (int i = 0; i < counter; i++) {
            if (Objects.equals(documents[i].getNumber(), numberОfDocument)) {
                System.out.println("You chose this document: " + "\n" +
                        documents[i]);
                return;
            }
        }
        System.out.println("Error! This document isn't created!");
    }

    public void checkException() throws AbcException, StartWith555Exception {
        if(documents[counter].getNumber().contains("abc")){
            throw new AbcException("Ошибка  Abc");
            //Куда отправляются эти данные?
        } else System.out.println("You entered: " + documents[counter].getNumber() +
                ". This number doesn't has 'abc'");

        if(documents[counter].getNumber().startsWith("555")){
            throw new StartWith555Exception("Ошибка  '555'");
            //Куда отправляются эти данные?
        } else System.out.println("You entered: " + documents[counter].getNumber() +
                ". This number doesn't begin with '555'");

        if(documents[counter].getNumber().endsWith("1a2b")){
            throw new EndWith1a2bException("Ошибка '1a2b'");
            //Куда отправляются эти данные?
        } else System.out.println("You entered: " + documents[counter].getNumber() +
                ". This number doesn't end with '1a2b'");
    }
}
