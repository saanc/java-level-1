package oops;

public class Bicycle {
    private int speed;
    private int gear;

    public Bicycle() {
        this(0, 1);
    }

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed:" + speed + " gear:" + gear);
    }

    public static void main(String[] args) {
        Bicycle cycle1 = new Bicycle();
        Bicycle cycle2 = new Bicycle();
        cycle1.changeGear(3);
        cycle2.speedUp(30);
        cycle1.printStates();
        cycle2.printStates();
    }
}
