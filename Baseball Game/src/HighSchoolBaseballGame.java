public class HighSchoolBaseballGame extends BaseballGame {
    private final int innings = 7;



    public HighSchoolBaseballGame(String team1, String team2) {
        super(team1, team2);
        final int innings = 7;
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < innings; x++)
                setScores(i, x, 0);
        }
    }
    @Override
    public int getInnings(){
        return  innings;
    }




}
