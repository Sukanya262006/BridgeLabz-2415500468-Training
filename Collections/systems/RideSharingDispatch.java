import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    String id;
    int urgency; // higher -> more urgent

    RideRequest(String id, int urgency) {
        this.id = id;
        this.urgency = urgency;
    }

    @Override
    public int compareTo(RideRequest o) {
        return Integer.compare(o.urgency, this.urgency);
    }

    @Override
    public String toString() {
        return "RideRequest{" + id + ", urgency=" + urgency + "}";
    }
}

class Driver {
    String id;

    Driver(String id) { this.id = id; }

    @Override
    public String toString() {
        return "Driver{" + id + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return Objects.equals(id, d.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Ride {
    RideRequest request;
    Driver driver;

    Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Ride{" + request + ", " + driver + "}";
    }
}

public class RideSharingDispatch {

    public static void main(String[] args) {
        Queue<RideRequest> normalQueue = new LinkedList<>();
        PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();

        normalQueue.add(new RideRequest("R1", 1));
        normalQueue.add(new RideRequest("R2", 3));
        priorityQueue.add(new RideRequest("R3", 5)); // urgent

        Set<Driver> availableDrivers = new HashSet<>();
        availableDrivers.add(new Driver("D1"));
        availableDrivers.add(new Driver("D2"));

        List<Ride> completedRides = new ArrayList<>();

        // handle high priority first
        while (!priorityQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest req = priorityQueue.remove();
            Driver d = availableDrivers.iterator().next();
            availableDrivers.remove(d);
            Ride ride = new Ride(req, d);
            completedRides.add(ride);
            System.out.println("Assigned urgent ride: " + ride);
        }

        // then normal
        while (!normalQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest req = normalQueue.remove();
            Driver d = availableDrivers.iterator().next();
            availableDrivers.remove(d);
            Ride ride = new Ride(req, d);
            completedRides.add(ride);
            System.out.println("Assigned normal ride: " + ride);
        }

        System.out.println("\nCompleted rides history:");
        for (Ride r : completedRides) System.out.println(r);
    }
}
