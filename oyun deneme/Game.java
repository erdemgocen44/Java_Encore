public class Game {
    private Maze maze;
    private Player player;
    private boolean gameOver;

    public Game() {
        maze = new Maze();
        player = new Player();
        gameOver = false;
    }

    public void startGame() {
        maze.generateMaze();
        player.setPosition(0, 0); // start at top-left corner
    }

    public void movePlayer(String direction) {
        // implement movement logic
    }

    public boolean hasFoundTreasure() {
        // implement treasure check logic
    }

    public void playGame() {
        startGame();
        while (!gameOver) {
            System.out.println("Enter a direction (up, down, left, right): ");
            String direction = System.console().readLine();
            movePlayer(direction);
            if (hasFoundTreasure()) {
                System.out.println("Congratulations, you found the treasure!");
                gameOver = true;
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}