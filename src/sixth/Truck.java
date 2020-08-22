package sixth;

import java.util.Calendar;
import java.util.Objects;

public class Truck extends Car {
    int speed;
    int numberOfWheels;

    public Truck(int speed, int numberOfWheels, Calendar calendar) {
        super("RX 214", 333, calendar, "black", CarBrand.RENAULT, "is moving");
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
    }


    @Override
    public void move() {
        System.out.println("Truck is moving slowly(((");
    }

    @Override
    public void stop() {
        System.out.println("Truck stops hardly(((");
    }

    public void repair() {
        System.out.println("Truck requires frequent repairs(((");
    }

    public void sale() {
        System.out.println("Truck needs to be sold!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        Truck truck = (Truck) o;
        return speed == truck.speed &&
                numberOfWheels == truck.numberOfWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, numberOfWheels);
    }
}
