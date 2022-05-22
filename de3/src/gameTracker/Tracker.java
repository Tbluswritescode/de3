package gameTracker;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class Tracker {
    private Map<String, Set<Game>> tracker;
    private Set<String> titles;

    Tracker() {
        tracker = new HashMap<String, Set<Game>>();
        titles = new HashSet<String>();
    }

    Tracker(Collection<Game> games) {
        tracker = new HashMap<String, Set<Game>>();
        titles = new HashSet<String>();
        addGames(games);
    }

    Tracker(Game game) {
        tracker = new HashMap<String, Set<Game>>();
        titles = new HashSet<String>();
        addGame(game);
    }

    public void addGame(Game game) {
        if (tracker.containsKey(game.getGameTitle())) {
            tracker.get(game.getGameTitle()).add(game);
        } else {
            Set<Game> s = new HashSet<Game>();
            s.add(game);
            tracker.put(game.getGameTitle(), s);
        }
        titles.add(game.getGameTitle());
    }

    public void addGames(Collection<Game> games) {
        for (Game g : games) {
            addGame(g);
        }
    }

    public String getByGame(String title) {
        return tracker.get(title).toString();
    }

    public Collection<String> getAllGames() {
        return new HashSet<String>(titles);
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
