package HW9_2;

public class Register {
    private String login;
    private String password;
    private String confirmPassword;

    public static String checkExceptions(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Ошибка логина");
        }
        if (!password.equals(confirmPassword) || !checkInt(password) || password.length() > 20
                || password.contains(" ")) {
            throw new WrongPasswordException("Ошибка пароля");
        }
        return "Все верно";
    }

    public static boolean checkInt(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}

