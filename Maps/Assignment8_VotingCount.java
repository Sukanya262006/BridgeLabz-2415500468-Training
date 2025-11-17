
import java.util.*;

public class Assignment8_VotingCount {
    public static void main(String[] args) {
        Map<String,Integer> votes = new HashMap<>();
        String[] cast = {"A","B","A","C","B","A","C","A","B","A"};

        for (String c : cast)
            votes.put(c, votes.getOrDefault(c,0)+1);

        System.out.println(votes);
    }
}
