import java.util.*;

public class CustomerFeedbackAnalysis {

    public static void main(String[] args) {
        List<String> allFeedback = new ArrayList<>();
        Set<String> uniqueFeedback = new LinkedHashSet<>();
        Queue<String> processingQueue = new LinkedList<>();
        Stack<String> recentStack = new Stack<>();

        addFeedback("Great service", allFeedback, uniqueFeedback, processingQueue);
        addFeedback("Poor packaging", allFeedback, uniqueFeedback, processingQueue);
        addFeedback("Great service", allFeedback, uniqueFeedback, processingQueue); // duplicate

        System.out.println("Processing feedback:");
        while (!processingQueue.isEmpty()) {
            String fb = processingQueue.remove();
            System.out.println("Processing: " + fb);
            recentStack.push(fb);
        }

        System.out.println("\nLast few feedbacks:");
        int count = Math.min(3, recentStack.size());
        for (int i = 0; i < count; i++) {
            System.out.println(recentStack.get(recentStack.size() - 1 - i));
        }
    }

    private static void addFeedback(String fb, List<String> all,
                                    Set<String> unique, Queue<String> queue) {
        all.add(fb);
        if (unique.add(fb)) {
            queue.add(fb);
        }
    }
}
