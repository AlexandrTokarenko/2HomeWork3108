package animals;

public class AngryDog extends Dog {
    public AngryDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void voice() {
        System.out.println("ֳאג נננ");
    }

    @Override
    public String toString() {
        return "AngryDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
