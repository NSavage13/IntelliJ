public class LittleLeagueBaseballGame extends BaseballGame {
    private final int innings = 6;
    public LittleLeagueBaseballGame(String team1, String team2) {
        super(team1, team2);

        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < innings; x++)
                setScores(i, x, 0);
        }
    }
    @Override
    public int getInnings(){
        return innings;
    }
}
