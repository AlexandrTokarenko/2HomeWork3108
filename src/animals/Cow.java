package animals;

public class Cow extends Animal {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Ìó");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
