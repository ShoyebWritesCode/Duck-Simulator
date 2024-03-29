public class DuckDecorator implements Quackable{
    Quackable duck;
    private int numberOfQuacks;

    public DuckDecorator(Quackable duck){
        numberOfQuacks = 0;
        this.duck = duck;
    }


    @Override
    public String quack() {
        numberOfQuacks++;
        return duck.quack();
    }

    public void getTotalQuack(){
        System.out.println(duck.getClass().getSimpleName() + " quacked " + numberOfQuacks + " times");
    }
}