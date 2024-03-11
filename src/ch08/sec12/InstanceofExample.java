package ch08.sec12;

import ch07.exercise.p12.B;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);

        ride(bus);
    }

    public static void ride(Vehicle vehicle) {

//        if (vehicle instanceof Bus) {
//            Bus bus = (Bus) vehicle;
//            bus.checkFare(); //
//        }

        if (vehicle instanceof Bus bus) {
            bus.checkFare(); //
        }

        vehicle.run();
    }
}

