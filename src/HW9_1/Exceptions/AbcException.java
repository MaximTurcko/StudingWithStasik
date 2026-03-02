package HW9_1.Exceptions;

public class AbcException extends Exception{
    private String massage;

    public AbcException(String massage) {
        super(massage);
        this.massage = massage;
    }
}
