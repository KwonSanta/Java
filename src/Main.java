import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = -100;
        t.setHour(21);
        System.out.println(t.getHour());
    }
}

class Time {
    private int hour;  // 0 ~ 23 사이의 값을 가져야함.
    private int minute;
    private int second;

//    public void setHour(int hour) {
//        if (hour < 0 || hour > 23) {
//            return;
//        }
//        this.hour = hour;
//    }
//
//    public int getHour() {
//        return hour;
//    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }
}