package sixth;

import java.util.Calendar;
import java.util.Date;

public class Sportcar extends Car{
    int speed;
    int numberOfDoors;

    public Sportcar(int speed, int numberOfDoors, Calendar calendar){
        super("M6 Gran Coupe", 555, calendar,"white", CarBrand.BMW, "is moving");
        this.speed = speed;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println("Sportcar is moving quickly!!!");
    }

    @Override
    public void stop() {
        System.out.println("Sportcar stops easy.");
    }

    public void winner(){
        System.out.println("Sportcar always wins!!!");
    }

    public void price(){
        System.out.println("Sportcar costs a lot of many(((");
    }
}
