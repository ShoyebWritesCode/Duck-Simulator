public class QuackingObserver implements Observer{
    String name;
    public QuackingObserver(String name){
        this.name = name;
    }
    @Override
    public void update(Quackable duck) {
        System.out.println(name + " is observing");
        System.out.println(duck.getClass().getSimpleName()  + " is quacking");
    }
}