package main.java.model;

public class Notifier {
    Observer observer;

    public Notifier(Observer observer) {
        this.observer = observer;
    }

    public void brodcast(Player player) {
        observer.notify(player);
    }
}
