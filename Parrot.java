public class Parrot extends Bird implements Prey {
    public Parrot(String name, int age, int heightOfFly, String specialTrait) {
        super(name, age, heightOfFly, specialTrait);
    }

    @Override
    public String getName() {
        return name;
    }
}
