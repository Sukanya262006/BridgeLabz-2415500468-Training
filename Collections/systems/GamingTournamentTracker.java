import java.util.*;

class Player implements Comparable<Player> {
    String id;
    int score;

    Player(String id) { this.id = id; }

    @Override
    public String toString() {
        return "Player{" + id + ", score=" + score + "}";
    }

    @Override
    public int compareTo(Player o) {
        int cmp = Integer.compare(o.score, this.score); // descending
        if (cmp != 0) return cmp;
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return Objects.equals(id, p.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Match {
    Player p1;
    Player p2;

    Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Match{" + p1.id + " vs " + p2.id + "}";
    }
}

class Result {
    Match match;
    Player winner;

    Result(Match match, Player winner) {
        this.match = match;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "Result{" + match + ", winner=" + winner.id + "}";
    }
}

public class GamingTournamentTracker {

    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        Player a = new Player("A");
        Player b = new Player("B");
        Player c = new Player("C");
        players.add(a);
        players.add(b);
        players.add(c);

        Queue<Match> matches = new LinkedList<>();
        matches.add(new Match(a, b));
        matches.add(new Match(b, c));

        List<Result> results = new ArrayList<>();
        TreeSet<Player> leaderboard = new TreeSet<>();

        while (!matches.isEmpty()) {
            Match m = matches.remove();
            // simple winner: p1 always
            Player winner = m.p1;
            winner.score += 3;
            results.add(new Result(m, winner));
        }

        leaderboard.addAll(players);

        System.out.println("Results:");
        for (Result r : results) System.out.println(r);

        System.out.println("\nLeaderboard:");
        for (Player p : leaderboard) System.out.println(p);
    }
}
