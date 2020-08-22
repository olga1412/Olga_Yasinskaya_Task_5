package sixth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public abstract class Car implements Movable {

    private final static DateFormat dateFormat = new SimpleDateFormat("MM.yyyy");

    protected String name;
    protected int number;
    protected Calendar calendar;
    protected String colour;
    protected CarBrand brand;
    protected String state;

    public Car(String name, int number, Calendar calendar, String colour, CarBrand brand, String state) {
        this.name = name;
        this.number = number;
        this.calendar = calendar;
        this.colour = colour;
        this.brand = brand;
        this.state = state;
    }

    protected void move(String name) {
        System.out.println("Car " + name + " is moving!");
    }

    @Override
    public void move() {

    }

    public String getCalendar() {
        return dateFormat.format(calendar.getTime());
    }

    protected void stop() {
        System.out.println("It stops");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return brand == car.brand &&
                name == name;
    }

    @Override
    public int hashCode() {

        return Objects.hash(brand, name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Car{");
        return stringBuilder.append("number=").append(number)
            .append(", colour='").append(colour)
            .append(", brand='").append(brand)
            .append(", state='").append(state)
            .append('}').toString();
    }

    public String getName() {
        return name;

    }


}
