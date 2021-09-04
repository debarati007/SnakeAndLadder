package main.java.model;

import java.util.List;

public class Board {
    public Board(Integer start, Integer end, Integer size, List<Snake> snakes, List<Ladder> ladders, Notifier notifier) {
        this.start = start;
        this.end = end;
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
        this.notifier = notifier;
    }

    private Integer start;
    private Integer end;
    private Integer size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Notifier notifier;

    public Integer getNewPosition(int diceValue, Integer position, Player player) {
        //snake and ladder logic
        Integer newPosition = diceValue + position;
        if (newPosition == 100) {
            notifier.brodcast(player);
        }
        if (newPosition > 100) {
            return position;
        }
        return diceValue + position;
    }
}
