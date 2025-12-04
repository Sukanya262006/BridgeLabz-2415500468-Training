import java.util.*;

class Parcel implements Comparable<Parcel> {
    String id;
    int priority;

    Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    @Override
    public int compareTo(Parcel o) {
        return Integer.compare(o.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Parcel{" + id + ", priority=" + priority + "}";
    }
}

public class CourierDeliveryRoutingSystem {

    public static void main(String[] args) {
        PriorityQueue<Parcel> priorityDeliveries = new PriorityQueue<>();
        Queue<Parcel> normalDeliveries = new LinkedList<>();
        Set<String> assignedIds = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        addParcel(new Parcel("C1", 5), priorityDeliveries, normalDeliveries, assignedIds);
        addParcel(new Parcel("C2", 1), priorityDeliveries, normalDeliveries, assignedIds);
        addParcel(new Parcel("C1", 4), priorityDeliveries, normalDeliveries, assignedIds); // duplicate

        while (!priorityDeliveries.isEmpty()) {
            Parcel p = priorityDeliveries.remove();
            completed.add(p);
            System.out.println("Delivered high-priority: " + p);
        }

        while (!normalDeliveries.isEmpty()) {
            Parcel p = normalDeliveries.remove();
            completed.add(p);
            System.out.println("Delivered normal: " + p);
        }

        System.out.println("\nCompleted deliveries:");
        for (Parcel p : completed) System.out.println(p);
    }

    private static void addParcel(Parcel p, PriorityQueue<Parcel> priorityQueue,
                                  Queue<Parcel> normalQueue, Set<String> ids) {
        if (!ids.add(p.id)) {
            System.out.println("Duplicate delivery ID ignored: " + p.id);
            return;
        }
        if (p.priority >= 3) priorityQueue.add(p);
        else normalQueue.add(p);
    }
}
