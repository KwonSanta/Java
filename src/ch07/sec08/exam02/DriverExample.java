package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);
        driver.drive(new Bus());

        Taxi taxi = new Taxi();
        driver.drive(taxi);
        driver.drive(new Taxi());
    }
}
