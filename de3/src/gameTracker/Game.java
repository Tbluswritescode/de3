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
        return this.toString();
    }

    public String toString() {
        return title + ": " + kills + "/" + deaths + "/" + assists;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssists() {
        return assists;
    }

    public String getGameTitle() {
        return title;
    }
}
