package main.java.model;

public class GetDiceFactory {
    //all properties will be static
    //constructor should be private
    //there should not be any method to set the properties
    //there should be a method that returns only one instance of the object of singleton class
    private static GetDiceFactory getDiceFactory = new GetDiceFactory();

    private GetDiceFactory() {
    }

    public static GetDiceFactory getInstance() {
        return getDiceFactory;
    }

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
