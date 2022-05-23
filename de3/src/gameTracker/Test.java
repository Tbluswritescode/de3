package gameTracker;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Set<Game> games = new HashSet<Game>();
        games = buildTestGames(20);
        Tracker track = new Tracker(games);

        System.out.println(track);
        System.out.println(track.toStringSummaryByGame());

    }

    public static Set<Game> buildTestGames(int count) {
        /* builds some randomly generated games under three titles for testing */
        Random rand = new Random();
        int max = 20;
        Set<Game> returnSet = new HashSet<Game>();
        for (int i = 0; i < count; i++) {
            returnSet.add(new Game(rand.nextInt(max), rand.nextInt(max), rand.nextInt(max), "Apex Legends"));
            returnSet.add(new Game(rand.nextInt(max), rand.nextInt(max), rand.nextInt(max), "League of Legends"));
            returnSet.add(new Game(rand.nextInt(max), rand.nextInt(max), rand.nextInt(max), "Battlefield 2042"));
        }
        return returnSet;
    }
}
