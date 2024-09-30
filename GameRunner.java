public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Dodge Ball", 5);
        System.out.println("Game name: " + game.gName());
        System.out.println("Players: " + game.pl());
        System.out.println("Score: " + game.sc());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("----- UPDATING STATE OF GAME -----");
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(8);
        game.increaseScore(3);
        System.out.println("Game name: " + game.gName());
        System.out.println("Players: " + game.pl());
        System.out.println("Score: " + game.sc());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());
        System.out.println("Is game over? " + game.isGameOver());
    }
}