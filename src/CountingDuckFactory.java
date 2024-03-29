public class CountingDuckFactory implements DuckFactory {
    @Override
    public Quackable createDuck(String type) {
        switch (type) {
            case "Counting Donald Duck":
                return new DuckDecorator(new DonaldDuck());
            case "Counting Daisy Duck":
                return new DuckDecorator(new DaisyDuck());
            case "Counting Goose":
                return new DuckDecorator(new GooseAdapter(new Goose()));
            default:
                System.out.println("Duck type not available: " + type);
                return null;
        }
    }
}
