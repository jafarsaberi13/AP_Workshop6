public class Eagle extends Bird implements Hunter {
    public Eagle(String name, int age, int heightOfFly, String specialTrait) {
        super(name, age, heightOfFly, specialTrait);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(name + " hunted " + prey.getName());
    }
}
