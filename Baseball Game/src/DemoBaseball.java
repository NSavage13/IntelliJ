import java.util.Scanner;

public class DemoBaseball {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter (1) for High school \nEnter (2) for Little League");
        System.out.print(">>> ");
        int gameType = input.nextInt();
        input.nextLine();

        System.out.println("Enter Team 1:");
        System.out.print(">>> ");
        String teamOne = input.nextLine();

        System.out.println("Enter Team 2:");
        System.out.print(">>> ");
        String teamTwo = input.nextLine();

        BaseballGame game;
        if (gameType == 1){
           game = new HighSchoolBaseballGame(teamOne, teamTwo);
        } else if (gameType == 2){
            game = new LittleLeagueBaseballGame(teamOne, teamTwo);
        } else {
            game = new BaseballGame(teamOne, teamTwo);
        }


        for (int i = 0; i < game.getInnings(); i++) {
            System.out.println("Enter runs for each team in inning " + (i + 1));
            for (int t = 0; t < 2; t++) {
                System.out.println(game.getTeam(t) + " score:");
                int teamScore = input.nextInt();
                game.setScores(t, teamScore, i);
                int total = game.getScores(t,i);
            }

            System.out.println(game.getTeam1() + " score: " + game.getScores(0, i));
            System.out.println(game.getTeam2() + " score:" + game.getScores(1, i));
        }

        int totalteam1 = 0;
        for (int i = 0; i < game.getInnings(); i++) {
            totalteam1 += game.getScores();
        }
        System.out.println("Nico");









    }
}
