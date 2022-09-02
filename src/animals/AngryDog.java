package animals;

public class AngryDog extends Animal{

    private VoiceDogs dog;
    public AngryDog(String name, int age) {
        super(name,age);
        dog = new VoiceDogs("��� ���");
    }

    @Override
    public void voice() {
        dog.voice();
    }


    public String toString() {
        return "AngryDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
