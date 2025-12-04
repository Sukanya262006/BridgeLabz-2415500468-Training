import java.time.LocalDate;
import java.util.*;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate,
                  String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        int cmp = this.expiryDate.compareTo(other.expiryDate);
        if (cmp != 0) return cmp;
        return this.policyNumber.compareTo(other.policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + ''' +
                ", name='" + policyholderName + ''' +
                ", expiry=" + expiryDate +
                ", coverage='" + coverageType + ''' +
                ", premium=" + premiumAmount +
                '}';
    }
}

public class InsurancePolicyManagement {

    public static void main(String[] args) {
        // HashSet for quick lookups (unique by policyNumber)
        Set<Policy> hashSet = new HashSet<>();

        // LinkedHashSet to preserve insertion order
        Set<Policy> linkedHashSet = new LinkedHashSet<>();

        // TreeSet sorted by expiry date
        Set<Policy> treeSet = new TreeSet<>();

        List<Policy> allPolicies = Arrays.asList(
                new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000),
                new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 3000),
                new Policy("P003", "Charlie", LocalDate.now().plusDays(5), "Home", 4500),
                new Policy("P001", "Alice Dup", LocalDate.now().plusDays(15), "Health", 5000) // duplicate number
        );

        for (Policy p : allPolicies) {
            hashSet.add(p);
            linkedHashSet.add(p);
            treeSet.add(p);
        }

        System.out.println("All unique policies (HashSet):");
        for (Policy p : hashSet) System.out.println(p);

        System.out.println("\nPolicies in insertion order (LinkedHashSet):");
        for (Policy p : linkedHashSet) System.out.println(p);

        System.out.println("\nPolicies sorted by expiry (TreeSet):");
        for (Policy p : treeSet) System.out.println(p);

        System.out.println("\nPolicies expiring within 30 days:");
        LocalDate now = LocalDate.now();
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isAfter(now.plusDays(30))) {
                System.out.println(p);
            }
        }

        System.out.println("\nPolicies with coverage type 'Health':");
        for (Policy p : hashSet) {
            if ("Health".equalsIgnoreCase(p.getCoverageType())) {
                System.out.println(p);
            }
        }

        System.out.println("\nDuplicate policies based on policy number:");
        Set<String> seenNumbers = new HashSet<>();
        for (Policy p : allPolicies) {
            if (!seenNumbers.add(p.getPolicyNumber())) {
                System.out.println(p);
            }
        }
    }
}
