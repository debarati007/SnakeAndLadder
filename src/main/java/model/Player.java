package main.java.model;

public class Player {
    private String name;
    private Integer position = 0;
    private Integer rank;

    public Player(String name) {
        this.name = name;
    }

    public void play(Dice dice, Board board) {
        int diceValue = dice.roll();
        position = board.getNewPosition(diceValue, position, this);

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + " rank=" + rank +
                '}';
    }

    public void assignRank(Integer rank) {
        this.rank = rank;
    }

    public boolean hasWon() {
        return rank != null;
    }
}
