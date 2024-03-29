public class DaisyDuck extends Observable implements Quackable{

    @Override
    public String quack() {
        notifyObservers();
        return "Daisy Duck: quack!";
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}