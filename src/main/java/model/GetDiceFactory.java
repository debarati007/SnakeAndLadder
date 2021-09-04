package main.java.model;

public class GetDiceFactory {
    //all properties will be static
    //constructor should be private
    //there should not be any method to set the properties
    //there should be a method that returns only one instance of the object of singleton class

    //each time a new dice is getting created
    //instead only one dice for each type should be created
    private static GetDiceFactory getDiceFactory = new GetDiceFactory();
    private DiceDefault diceDefault = new DiceDefault(1, 6);
    private DicePro dicePro = new DicePro(1, 6);
    private DicePremium dicePremium = new DicePremium(1, 6);

    private GetDiceFactory() {
    }

    public static GetDiceFactory getInstance() {
        return getDiceFactory;
    }

    public Dice getDice(String diceType) {
        if (diceType == null)
            return null;
        if (diceType.equalsIgnoreCase("DiceDefault")) {
            return diceDefault;
        }
        if (diceType.equalsIgnoreCase("DicePro")) {
            return dicePro;
        }
        if (diceType.equalsIgnoreCase("DicePremium")) {
            return dicePremium;
        }
        return null;
    }
}
