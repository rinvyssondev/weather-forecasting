public class TeamA extends FootballTeam {
    public TeamA(PlayStyle playStyle) {
        super(playStyle);
    }

    public void playGame() {
        System.out.println("Time A: ");
        playStyle.play();
    }
}