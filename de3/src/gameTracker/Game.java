package gameTracker;

public class Game {
    private int kills = 0;
    private int deaths = 0;
    private int assists = 0;
    private String title = "";

    Game(int k, int d, int a, String t) {
        kills = k;
        deaths = d;
        assists = a;
        title = t;
    }

    public String getGame() {
        /* returns the string format of this game */
        return this.toString();
    }

    public String toString() {
        return title + ": " + kills + "/" + deaths + "/" + assists;
    }

    public int getKills() {
        /* getter for int kills */
        return kills;
    }

    public int getDeaths() {
        /* getter for int deaths */
        return deaths;
    }

    public int getAssists() {
        /* getter for int assists */
        return assists;
    }

    public String getGameTitle() {
        /* getter for String game title */
        return title;
    }
}
