public class Bird extends Animal {
    private int heightOfFly;
    private String specialTrait;

    public Bird(String name, int age, int heightOfFly, String specialTrait) {
        super(name, age);
        this.heightOfFly = heightOfFly;
        this.specialTrait = specialTrait;
    }

    @Override
    public void show() {
        System.out.printf("name: %s, age: %d, height of fly: %d, \"%s\"%n", name, age, heightOfFly, specialTrait);
    }
}
