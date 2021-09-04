package main.java.model;

public class DicePro extends Dice {
    public DicePro(Integer minValue, Integer maxValue) {
        super(minValue, maxValue);
    }

    @Override
    public int roll() {
        return (int) ((Math.random() * (maxValue - minValue)) + minValue);
    }
}
