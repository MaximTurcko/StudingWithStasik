package HW9_2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Register.checkExceptions("aaaa",
                    "rr8","rr8"));
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
