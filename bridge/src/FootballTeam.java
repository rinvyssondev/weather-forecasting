abstract public class FootballTeam {

    protected PlayStyle playStyle;

    protected FootballTeam(PlayStyle playStyle) {
        this.playStyle = playStyle;
    }

    abstract public void playGame();
}
