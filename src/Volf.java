public class Volf extends Predator{
    @Override
    public void hunt() {
        System.out.println("Volf hunting");
    }

    public Volf() {
    }

    public Volf(String eat, String walk, int age) {
        super(eat, walk, age);
    }
}
