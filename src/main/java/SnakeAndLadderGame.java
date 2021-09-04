package main.java;

import main.java.model.*;

import java.util.Arrays;
import java.util.List;

public class SnakeAndLadderGame implements Observer {
    private Board board;
    private List<Player> playerlist;
    private int rank = 1;

//TODO : there are 3 kind of dice with 3 rolling style //type 1,type 2-select max value and min value,type 3
//TODO : user can select a dice and rolling style. hence rollDice will be different for each dice
//apply design pattern
//dice interface
//roll dice()
//3 dice classes extending dice and implementing this dice method
//chess pacman

    public SnakeAndLadderGame() {
        //board size
        //number of snake
        //number of ladder
        //number of player
        Notifier notifier = new Notifier(this);
        this.board = new Board(0, 100, 100, null, null, notifier);
        GetDiceFactory diceFactory = GetDiceFactory.getInstance();
        Dice dicePro = diceFactory.getDice("DicePro");
        Dice dicePremium = diceFactory.getDice("DicePremium");
        Player player1 = new Player("Deb", dicePro);
        Player player2 = new Player("Subho");
        Player player3 = new Player("Preety", dicePremium);
        Player player4 = new Player("Ria", dicePro);
        playerlist = Arrays.asList(player1, player2, player3, player4);
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
                playerlist.get(playerTurn).play(board);
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
