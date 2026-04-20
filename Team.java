import java.util.*;

class Team {
    String teamName;
    ArrayList<Player> players;

    Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<>();
    }

    void addPlayer(String name) {
        players.add(new Player(name));
    }

    Player getPlayer(String name) {
        for (Player p : players) {
            if (p.name.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    void displayScorecard() {
        System.out.println("\nTeam: " + teamName);
        System.out.println("=================================");
        int totalRuns = 0;

        for (Player p : players) {
            p.display();
            totalRuns += p.runs;
        }

        System.out.println("=================================");
        System.out.println("Total Runs: " + totalRuns);
    }
}
