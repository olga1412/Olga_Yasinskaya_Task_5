package sixth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, Calendar.JANUARY, 1);

        Car car = new Sportcar(300, 4, calendar);
        System.out.println(car.getCalendar());

        Car car1 = new Truck();
        car.move();
        car.move("X3");
        car.stop();
        System.out.println("-----------");

        Truck truck = new Truck();
        truck.move();
        truck.stop();
        truck.repair();
        truck.sale();
        System.out.println("-------------");

        car = new Sportcar(300, 5, calendar);
        car.move();
        car.stop();
        System.out.println("-----------");

        Sportcar sportcar = new Sportcar(300, 5,calendar);
        sportcar.move();
        sportcar.stop();
        sportcar.winner();
        sportcar.price();
        System.out.println("-----------");

        Movable movable = new Scooter();
        movable.move();
        System.out.println("-----------");

        Truck truck1 = new Truck(100, 4);
        Truck truck2 = new Truck(100, 6);
        System.out.println(truck1.equals(truck2));
        System.out.println(truck1.hashCode());
        System.out.println(truck2.hashCode());
        System.out.println("-----------");

        StringBuilder strBuilder = new StringBuilder("Car");
        strBuilder = strBuilder.append(" X3, 334, white, 12.2013, BMW, is moving.");
        System.out.println(strBuilder.toString());
        System.out.println("-----------");



        System.out.println(CarBrand.BMW);
        System.out.println(CarBrand.MERCEDEZ);


    }
}
