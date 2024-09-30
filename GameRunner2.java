public class GameRunner2 {
    public static void main(String[] args) {
        Game game = new Game("Basketball", 5);
        System.out.println("Game name: " + game.gName());
        System.out.println("Players: " + game.pl());
        System.out.println("Score: " + game.sc());
        System.out.println("Is game over? " + game.isGameOver());

        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(22);
        System.out.println("Game name: " + game.gName());
        System.out.println("Players: " + game.pl());
        System.out.println("Score: " + game.sc());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());
        System.out.println("Is game over? " + game.isGameOver());
    }
}