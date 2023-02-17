public class BaseballGame {
    private static final int innings = 9;
    private String team1;
    private String team2;
    private int[][] scores;


    public BaseballGame(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
        this.scores = new int[2][innings];
        for (int i = 0; i < 2; i++){
            for (int x = 0;x < innings; x++)
                scores[i][x] = -1;
        }
    }


    public int getInnings(){
        return innings;
    }
    public int getScores(int team, int inn) {
        return scores[team][inn];
    }

    public void setScores(int team, int runs, int inn) {
        scores[team][inn] = runs;
    }


    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    public String getTeam(int index) {
        if (index == 0) {
            return team1;
        } else if (index == 1) {
            return team2;
        }else {
            return null;
        }
    }
}
