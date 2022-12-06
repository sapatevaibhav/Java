/*
 * Design and develop a context for given case study and implement an
 * interface for Vehicles Consider the example of vehicles like bicycle, car and
 * bike. All Vehicles have common functionalities such as Gear Change, Speed up
 * and apply breaks. Make an interface and put all these common functionalities.
 * Bicycle, Bike, Car classes should be implemented for all these
 * functionalities in their own class in their own way.
 */

interface Vehicles {
    public void gear_change();

    public void speed_up();

    public void apply_breaks();
}

class Bicycle implements Vehicles {
    public void gear_change() {
        System.out.println("Bicycle on gear 2 of 3");
    }

    public void speed_up() {
        System.out.println("Bicycle speed at 25 kmph");
    }

    public void apply_breaks() {
        System.out.println("Breaks not applied to bicycle");
    }
}
class Car implements Vehicles {
    public void gear_change() {
        System.out.println("Car on gear 4 of 7");
    }

    public void speed_up() {
        System.out.println("Car speed at 75 kmph");
    }

    public void apply_breaks() {
        System.out.println("Breaks not applied to car");
    }
}
class Bike implements Vehicles {
    public void gear_change() {
        System.out.println("Bike on gear 0 of 5");
    }

    public void speed_up() {
        System.out.println("Bike speed at 0 kmph");
    }

    public void apply_breaks() {
        System.out.println("Breaks applied to bike");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bicycle bicycle = new Bicycle();
        Car car = new Car();

        bicycle.gear_change();
        bicycle.speed_up();
        bicycle.apply_breaks();

        car.gear_change();
        car.speed_up();
        car.apply_breaks();

        bike.gear_change();
        bike.speed_up();
        bike.apply_breaks();
    }
}