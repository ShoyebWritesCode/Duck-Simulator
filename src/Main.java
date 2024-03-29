public class Main {
    public static void main(String[] args){
        DuckFactory normalDuckFactory = new DuckCreator();
        DuckFactory countingDuckFactory = new CountingDuckFactory();

        //normal ducks
        Quackable donaldDuck = normalDuckFactory.createDuck("Donald Duck");
        Quackable daisyDuck = normalDuckFactory.createDuck("Daisy Duck");
        Quackable goose = normalDuckFactory.createDuck("Goose");

        //normal quacking
        System.out.println(donaldDuck.quack());
        System.out.println(daisyDuck.quack());
        System.out.println(goose.quack());

        System.out.println("\n");

        //counting ducks
        Quackable countingdonaldDuck = countingDuckFactory.createDuck("Counting Donald Duck");
        Quackable countingdaisyDuck = countingDuckFactory.createDuck("Counting Daisy Duck");

        //quack counting
        System.out.println(countingdonaldDuck.quack());
        System.out.println(countingdonaldDuck.quack());
        System.out.println(countingdaisyDuck.quack());

        ((DuckDecorator) countingdonaldDuck).getTotalQuack();
        ((DuckDecorator) countingdaisyDuck).getTotalQuack();

        System.out.println("\n");

        //Creating flocks
        Flock duckFlock = new Flock();
        duckFlock.Add(donaldDuck);
        duckFlock.Add(daisyDuck);
        duckFlock.Add(goose);

        Flock duckFlock1 = new Flock();
        duckFlock1.Add(countingdonaldDuck);
        duckFlock1.Add(countingdaisyDuck);

        duckFlock.Add(duckFlock1);

        System.out.println(duckFlock.quack());

        System.out.println("\n");

        //Creating observers
        Observer observer1 = new QuackingObserver("Shoyeb");
        Observer observer2 = new QuackingObserver("Mushfiq");

        ((Observable) donaldDuck).addObserver(observer1);
        ((Observable) daisyDuck).addObserver(observer1);
        donaldDuck.quack();
        daisyDuck.quack();

        ((Observable) donaldDuck).addObserver(observer2);
        ((Observable) goose).addObserver(observer2);
        donaldDuck.quack();
    }
}