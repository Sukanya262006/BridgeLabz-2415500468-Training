import java.util.*;

class Movie {
    String title;
    String genre;

    Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" + title + ", genre=" + genre + "}";
    }
}

public class StreamingWatchHistory {

    public static void main(String[] args) {
        Stack<Movie> watchHistory = new Stack<>();
        List<Movie> allMovies = new ArrayList<>();
        Set<String> watchedGenres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        allMovies.add(new Movie("Movie1", "Action"));
        allMovies.add(new Movie("Movie2", "Comedy"));
        allMovies.add(new Movie("Movie3", "Action"));

        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(1));

        while (!upNext.isEmpty()) {
            Movie current = upNext.remove();
            System.out.println("Now playing: " + current);
            watchHistory.push(current);
            watchedGenres.add(current.genre);
        }

        System.out.println("\nWatch history stack: " + watchHistory);
        System.out.println("Unique genres watched: " + watchedGenres);

        System.out.println("\nRecommendations (same genres):");
        for (Movie m : allMovies) {
            if (watchedGenres.contains(m.genre) && !watchHistory.contains(m)) {
                System.out.println(m);
            }
        }
    }
}
