package generics;
import java.util.*;

class Vehicle { String name; Vehicle(String name){ this.name=name; } }
class Truck extends Vehicle { Truck(String name){ super(name); } }
class Bike extends Vehicle { Bike(String name){ super(name); } }

class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();

    void addVehicle(T v){ fleet.add(v); }
    void showFleet(){ for(T v:fleet) System.out.println(v.name); }
}

public class Q11 {
    public static void main(String[] args){
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("Truck1"));

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("Bike1"));

        trucks.showFleet();
        bikes.showFleet();
    }
}

