import java.util.*;

class PackageItem {
    String id;
    String address;

    PackageItem(String id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Package{" + id + ", address='" + address + "'}";
    }
}

public class WarehouseDeliveryTracking {

    public static void main(String[] args) {
        Queue<PackageItem> pending = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();

        addPackage(new PackageItem("P1", "Addr1"), pending, packageIds);
        addPackage(new PackageItem("P2", "Addr2"), pending, packageIds);
        addPackage(new PackageItem("P1", "Addr1-dup"), pending, packageIds); // duplicate

        while (!pending.isEmpty()) {
            PackageItem p = pending.remove();
            if (p.id.equals("P2")) {
                System.out.println("Package returned: " + p);
                returned.push(p);
            } else {
                delivered.add(p);
                System.out.println("Package delivered: " + p);
            }
        }

        System.out.println("\nDelivered:");
        for (PackageItem p : delivered) System.out.println(p);
        System.out.println("\nReturned:");
        while (!returned.isEmpty()) System.out.println(returned.pop());
    }

    private static void addPackage(PackageItem p, Queue<PackageItem> pending, Set<String> ids) {
        if (ids.add(p.id)) {
            pending.add(p);
        } else {
            System.out.println("Duplicate package ID ignored: " + p.id);
        }
    }
}
