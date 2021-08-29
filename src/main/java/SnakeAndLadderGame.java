package main.java;

import main.java.model.*;

import java.util.Arrays;
import java.util.List;

public class SnakeAndLadderGame implements Observer {
    private Board board;
    private List<Player> playerlist;
    private Dice dice;
    private boolean hasPlayerWon;

    public SnakeAndLadderGame() {
        //board size
        //number of snake
        //number of ladder
        //number of player
        Notifier notifier = new Notifier(this);
        this.board = new Board(0, 100, 100, null, null,notifier);
        Player player1 = new Player("Deb");
        Player player2 = new Player("Subho");
        Player player3 = new Player("Preety");
        Player player4 = new Player("Ria");
        playerlist = Arrays.asList(player1, player2, player3, player4);
        this.dice = new Dice(1, 6);
        this.hasPlayerWon = false;

    }

    public static void main(String[] args) {
        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame();
        snakeAndLadderGame.start();

    }

    private void start() {
        int turn = 0;
        while (!hasPlayerWon) {
            playerlist.get(turn++ % 4).play(dice, board);
        }
    }

    @Override
    public void notify(Player player) {
        hasPlayerWon = true;
        System.out.println("player::"+player);
    }
}
