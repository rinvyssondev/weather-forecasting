public class TeamB extends FootballTeam {
    public TeamB(PlayStyle playStyle) {
        super(playStyle);
    }

    public void playGame() {
        System.out.println("Time B: ");
        playStyle.play();
    }
}