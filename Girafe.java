public class Girafe extends Bird implements Prey {
    public Girafe(String name, int age, int heightOfFly, String specialTrait) {
        super(name, age, heightOfFly, specialTrait);
    }

    @Override
    public String getName() {
        return name;
    }
}
