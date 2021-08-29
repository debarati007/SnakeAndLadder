package main.java;

import main.java.model.*;

import java.util.Arrays;
import java.util.List;

public class SnakeAndLadderGame implements Observer {
    private Board board;
    private List<Player> playerlist;
    private Dice dice;
    private int rank = 1;

    public SnakeAndLadderGame() {
        //board size
        //number of snake
        //number of ladder
        //number of player
        Notifier notifier = new Notifier(this);
        this.board = new Board(0, 100, 100, null, null, notifier);
        Player player1 = new Player("Deb");
        Player player2 = new Player("Subho");
        Player player3 = new Player("Preety");
        Player player4 = new Player("Ria");
        playerlist = Arrays.asList(player1, player2, player3, player4);
        this.dice = new Dice(1, 6);
    }

    public static void main(String[] args) {
        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame();
        snakeAndLadderGame.start();

    }

    private void start() {
        int turn = 0;
        int size = playerlist.size();

        while (rank <= size) {
            Integer playerTurn = turn++ % 4;

            if (!playerlist.get(playerTurn).hasWon()) {
                playerlist.get(playerTurn).play(dice, board);
            }
        }
        System.out.println(playerlist);
    }

    @Override
    public void notify(Player player) {
        player.assignRank(rank);
        rank++;
    }
}
