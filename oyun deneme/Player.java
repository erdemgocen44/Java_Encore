public class Player {
    private Position position;
    private Position treasurePosition;

    public Player() {
        position = new Position(0, 0);
        treasurePosition = new Position(0, 0);
    }

    public void setPosition(int x, int y) {
        position.setX(x);
        position.setY(y);
    }

    public void move(String direction) {
        // implement movement logic
    }

    public boolean hasFoundTreasure() {
        // implement treasure check logic
    }
}