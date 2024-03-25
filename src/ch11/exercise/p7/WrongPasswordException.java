package ch11.exercise.p7;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

//    @Override
//    public String getMessage() {
//        return "패드워드가 틀립니다.";
//    }
}
