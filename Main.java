import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Team team = new Team("India");

        while (true) {
            System.out.println("\n--- Cricket Scorecard System ---");
            System.out.println("1. Add Player");
            System.out.println("2. Add Batting Score");
            System.out.println("3. Add Wicket");
            System.out.println("4. Display Scorecard");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();
                    team.addPlayer(name);
                    break;

                case 2:
                    System.out.print("Enter player name: ");
                    String pname = sc.nextLine();
                    Player p = team.getPlayer(pname);

                    if (p != null) {
                        System.out.print("Enter runs: ");
                        int runs = sc.nextInt();

                        System.out.print("Enter balls: ");
                        int balls = sc.nextInt();
                        sc.nextLine();

                        p.addBatting(runs, balls);
                    } else {
                        System.out.println("Player not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter player name: ");
                    String bowler = sc.nextLine();
                    Player b = team.getPlayer(bowler);

                    if (b != null) {
                        System.out.print("Enter wickets: ");
                        int wickets = sc.nextInt();
                        sc.nextLine();

                        b.addWicket(wickets);
                    } else {
                        System.out.println("Player not found!");
                    }
                    break;

                case 4:
                    team.displayScorecard();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}