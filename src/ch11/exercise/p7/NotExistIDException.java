package ch11.exercise.p7;

public class NotExistIDException extends Exception {
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }

//    @Override
//    public String getMessage() {
//        return "아이디가 존재하지 않습니다.";
//    }
}
