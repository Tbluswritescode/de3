package gameTracker;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class Tracker {
    private Map<String, Set<Game>> tracker;

    Tracker() {
        tracker = new HashMap<String, Set<Game>>();
    }

    Tracker(Collection<Game> games) {
        /* allows for adding a series of games at instantitation, mostly for testing */
        tracker = new HashMap<String, Set<Game>>();
        addGames(games);
    }

    Tracker(Game game) {
        /* allows for adding single game at instantiation */
        tracker = new HashMap<String, Set<Game>>();
        addGame(game);
    }

    public void addGame(Game game) {
        /* adds a single game to the tracker */
        if (tracker.containsKey(game.getGameTitle())) {
            tracker.get(game.getGameTitle()).add(game);
        } else {
            Set<Game> s = new HashSet<Game>();
            s.add(game);
            tracker.put(game.getGameTitle(), s);
        }
    }

    public void addGames(Collection<Game> games) {
        /* adds a collection of games to the tracker, mostly for testing */
        for (Game g : games) {
            addGame(g);
        }
    }

    public String getByGame(String title) {
        /* gets a string representing all games played for a given title */
        return tracker.get(title).toString();
    }

    public Collection<String> getAllGames() {
        /* returns all of the titles of games played */
        return new HashSet<String>(tracker.keySet());
    }

    public Map<String, Set<Game>> getTracker() {
        /* returns a copy of the entire tracker */
        return new HashMap<String, Set<Game>>(tracker);
    }

    public String toString() {
        String rs = "";
        for (Map.Entry<String, Set<Game>> e : tracker.entrySet()) {
            for (Game g : e.getValue()) {
                rs += g.getGame() + "\n";
            }
        }
        return rs;
    }

    public String toStringSummaryByGame() {
        /*
         * finds statistical averages and returns a string containing the average
         * stats on each game title you have played
         */
        String rs = "";
        for (Map.Entry<String, Set<Game>> e : tracker.entrySet()) {
            int kills = 0;
            int deaths = 0;
            int assists = 0;
            int count = 0;

            for (Game g : e.getValue()) {
                kills += g.getKills();
                deaths += g.getDeaths();
                assists += g.getAssists();
                count += 1;
            }

            rs += "\n_______\n" + e.getKey() + "\nKills Average: " + kills / count + "\nDeaths Average: "
                    + deaths / count + "\nAssists Average: " + assists / count;

        }
        return rs;

    }
}
