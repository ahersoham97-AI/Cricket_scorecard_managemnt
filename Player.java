class Player {
    String name;
    int runs;
    int balls;
    int wickets;

    Player(String name) {
        this.name = name;
        this.runs = 0;
        this.balls = 0;
        this.wickets = 0;
    }

    void addBatting(int runs, int balls) {
        this.runs += runs;
        this.balls += balls;
    }

    void addWicket(int wickets) {
        this.wickets += wickets;
    }

    double getStrikeRate() {
        if (balls == 0) return 0;
        return (runs * 100.0) / balls;
    }

    void display() {
        System.out.println(name + " | Runs: " + runs + 
                           " | Balls: " + balls + 
                           " | SR: " + String.format("%.2f", getStrikeRate()) +
                           " | Wickets: " + wickets);
    }
}