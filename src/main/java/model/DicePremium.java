package main.java.model;

public class DicePremium extends Dice {
    public DicePremium(Integer minValue, Integer maxValue) {
        super(minValue, maxValue);
    }

    @Override
    public int roll() {
        return (int) ((Math.random() * (maxValue - minValue)) + minValue);
    }

}
