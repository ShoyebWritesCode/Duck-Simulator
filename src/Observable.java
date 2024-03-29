import java.util.ArrayList;

public abstract class Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObservers();
}