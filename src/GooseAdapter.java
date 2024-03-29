public class GooseAdapter extends Observable implements Quackable{
  Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public String quack() {
        notifyObservers();
        return goose.honk();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}