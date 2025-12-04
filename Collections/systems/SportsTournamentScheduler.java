import java.util.*;

class Team implements Comparable<Team> {
    String name;
    int points;

    Team(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Team o) {
        int cmp = Integer.compare(o.points, this.points); // descending
        if (cmp != 0) return cmp;
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Team{" + name + ", points=" + points + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team t = (Team) o;
        return Objects.equals(name, t.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class MatchSchedule {
    Team home;
    Team away;

    MatchSchedule(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    @Override
    public String toString() {
        return home.name + " vs " + away.name;
    }
}

class ResultEntry {
    MatchSchedule match;
    String score;

    ResultEntry(MatchSchedule match, String score) {
        this.match = match;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Result{" + match + ", score='" + score + "'}";
    }
}

public class SportsTournamentScheduler {

    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Team t1 = new Team("A");
        Team t2 = new Team("B");
        Team t3 = new Team("C");
        teams.add(t1);
        teams.add(t2);
        teams.add(t3);

        Queue<MatchSchedule> matches = new LinkedList<>();
        matches.add(new MatchSchedule(t1, t2));
        matches.add(new MatchSchedule(t2, t3));

        List<ResultEntry> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        while (!matches.isEmpty()) {
            MatchSchedule m = matches.remove();
            // simple rule: home always wins, +3 points
            m.home.points += 3;
            results.add(new ResultEntry(m, "1-0"));
        }

        leaderboard.addAll(teams);

        System.out.println("Results:");
        for (ResultEntry r : results) System.out.println(r);

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) System.out.println(t);
    }
}
