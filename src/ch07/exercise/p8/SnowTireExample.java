package ch07.exercise.p8;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = new Tire();

        System.out.println(System.identityHashCode(snowTire));
        System.out.println(System.identityHashCode(tire));

        snowTire.run();
        tire.run();
    }
}
