public class DonaldDuck extends Observable implements Quackable{

    @Override
    public String quack() {
        notifyObservers();
        return "Donald Duck: quack!";
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}