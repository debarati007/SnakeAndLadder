package main.java.model;

public class Dice {
    private Integer minValue;
    private Integer maxValue;

    public Dice(Integer minValue, Integer maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int roll() {
        return (int) ((Math.random() * (maxValue - minValue)) + minValue);
    }
}
