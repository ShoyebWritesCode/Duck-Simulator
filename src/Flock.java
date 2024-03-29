import java.util.ArrayList;

public class Flock implements Quackable{
    private final ArrayList<Quackable> ducks = new ArrayList<>();

    public void Add(Quackable duck){
        ducks.add(duck);
    }


    @Override
    public String quack() {
        String res = "";
        for(Quackable duck: ducks){
            res += duck.quack();
            res += "\n";
        }
        return res;
    }
}