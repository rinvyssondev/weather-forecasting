public class Bridge {
    public static void main(String[] args) {

        FootballTeam teamAOffensive = new TeamA(new OffensiveStyle());
        FootballTeam teamADefensive = new TeamA(new DefensiveStyle());
        FootballTeam teamBOffensive = new TeamB(new OffensiveStyle());
        FootballTeam teamBDefensive = new TeamB(new DefensiveStyle());

        teamAOffensive.playGame();
        teamADefensive.playGame();
        teamBOffensive.playGame();
        teamBDefensive.playGame();

    }
}