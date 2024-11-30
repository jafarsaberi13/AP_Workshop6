public class Mammal extends Animal {
    private int speed;
    private String specialTrait;

    public Mammal(String name, int age, int speed, String specialTrait) {
        super(name, age);
        this.speed = speed;
        this.specialTrait = specialTrait;
    }

    @Override
    public void show() {
        System.out.printf("name: %s, age: %d, speed: %d, \"%s\"%n", name, age, speed, specialTrait);
    }
}
