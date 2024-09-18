public class Game {
    private Maze maze;
    private Player player;

    public Game() {
        maze = new Maze();
        player = new Player();
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

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
        // game loop
    }
}