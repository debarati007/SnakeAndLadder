package main.java.model;

public class GetDiceFactory {
    public Dice getDice(String diceType) {
        if (diceType == null)
            return null;
        if (diceType.equalsIgnoreCase("DiceDefault")) {
            return new DiceDefault(1, 6);
        }
        if (diceType.equalsIgnoreCase("DicePro")) {
            return new DicePro(1, 6);
        }
        if (diceType.equalsIgnoreCase("DicePremium")) {
            return new DicePremium(1, 6);
        }
        return null;
    }
}
