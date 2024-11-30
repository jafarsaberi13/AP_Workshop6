public class Cheetah extends Mammal implements Hunter {
    public Cheetah(String name, int age, int speed, String specialTrait) {
        super(name, age, speed, specialTrait);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(name + " hunted " + prey.getName());
    }
}
