public class Game {
    private String gameName;
    private int players;
    private int score;

    public Game(String gameName, int players){
        this.gameName=gameName;
        this.players=players;
        score=0;
    }

    public String gName(){
        return gameName;
    }
    public int pl(){
        return players;
    }
    public int sc(){
        return score;
    }

    public void addPlayer(){
        players++;
    }
    public void increaseScore(int increase){
        score+=increase;
    }
    double averageScorePerPlayer(){
        return (double)score/players;
    }
    boolean isGameOver(){
        if (score>9){
            return true;
        }
        else{
            return false;
        }
    }
}
