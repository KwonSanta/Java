package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NOMAL;
        sa.fly();
        sa.land();

        System.out.println();
        Airplane ap1 = new SupersonicAirplane();
        ap1.fly();
        ap1.takeOff();
        ap1.land();


    }
}
