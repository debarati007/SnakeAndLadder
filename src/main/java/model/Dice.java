package main.java.model;

public abstract class Dice {
    Integer minValue;
    Integer maxValue;

    public Dice(Integer minValue, Integer maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int roll() {
        return (int) ((Math.random() * (maxValue - minValue)) + minValue);
    }
}
