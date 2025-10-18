/**
 * SmartHomeLighting.java
 * Scenario: Smart lights with different triggers (motion, time of day, voice).
 * Task: Use lambdas to define light activation behaviors dynamically.
 *
 * Sample Output (example):
 * Trigger: motion in Living Room -> Lights ON (bright white for 5 min)
 * Trigger: night in Bedroom -> Lights ON (warm dim)
 * Trigger: voice: "party" in Hall -> Lights ON (color cycle)
 * Trigger: away-mode in Whole House -> Lights OFF
 */
import java.util.*;
public class SmartHomeLighting {

    @FunctionalInterface
    interface LightBehavior {
        void execute(String location);
    }

    public static void main(String[] args) {
        Map<String, LightBehavior> behaviors = new HashMap<>();

        behaviors.put("motion", loc ->
            System.out.println("Trigger: motion in " + loc + " -> Lights ON (bright white for 5 min)"));

        behaviors.put("night", loc ->
            System.out.println("Trigger: night in " + loc + " -> Lights ON (warm dim)"));

        behaviors.put("voice:party", loc ->
            System.out.println("Trigger: voice: \"party\" in " + loc + " -> Lights ON (color cycle)"));

        behaviors.put("away-mode", loc ->
            System.out.println("Trigger: away-mode in " + loc + " -> Lights OFF"));

        // Simulate triggers
        run(behaviors, "motion", "Living Room");
        run(behaviors, "night", "Bedroom");
        run(behaviors, "voice:party", "Hall");
        run(behaviors, "away-mode", "Whole House");
    }

    private static void run(Map<String, LightBehavior> behaviors, String trigger, String location) {
        LightBehavior b = behaviors.get(trigger);
        if (b != null) b.execute(location);
        else System.out.println("No behavior configured for trigger: " + trigger);
    }
}
