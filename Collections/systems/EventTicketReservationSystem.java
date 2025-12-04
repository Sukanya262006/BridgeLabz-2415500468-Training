import java.util.*;

class Booking implements Comparable<Booking> {
    String userId;
    boolean vip;

    Booking(String userId, boolean vip) {
        this.userId = userId;
        this.vip = vip;
    }

    @Override
    public int compareTo(Booking o) {
        // VIPs first
        return Boolean.compare(o.vip, this.vip);
    }

    @Override
    public String toString() {
        return "Booking{" + userId + ", vip=" + vip + "}";
    }
}

public class EventTicketReservationSystem {

    public static void main(String[] args) {
        List<Booking> confirmed = new ArrayList<>();
        Set<String> registeredUsers = new HashSet<>();
        Queue<Booking> bookingQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>();

        registerUser("U1", registeredUsers);
        registerUser("U2", registeredUsers);
        registerUser("U1", registeredUsers); // duplicate

        bookingQueue.add(new Booking("U1", false));
        bookingQueue.add(new Booking("U2", true));
        vipQueue.add(new Booking("U2", true));

        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.remove();
            confirmed.add(b);
            System.out.println("VIP confirmed: " + b);
        }

        while (!bookingQueue.isEmpty()) {
            Booking b = bookingQueue.remove();
            confirmed.add(b);
            System.out.println("Normal confirmed: " + b);
        }

        System.out.println("\nAll confirmed bookings:");
        for (Booking b : confirmed) System.out.println(b);
    }

    private static void registerUser(String userId, Set<String> registeredUsers) {
        if (registeredUsers.add(userId)) {
            System.out.println("Registered user: " + userId);
        } else {
            System.out.println("Duplicate user ignored: " + userId);
        }
    }
}
