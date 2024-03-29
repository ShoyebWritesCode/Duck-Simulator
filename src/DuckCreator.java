public class DuckCreator implements DuckFactory {
    @Override
    public Quackable createDuck(String type) {
        switch (type) {
            case "Donald Duck":
                return new DonaldDuck();
            case "Daisy Duck":
                return new DaisyDuck();
            case "Goose":
                return new GooseAdapter(new Goose());
            default:
                System.out.println("Duck type not available: " + type);
                return null;
        }
    }
}
