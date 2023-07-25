public class Bear extends  Predator{
    public Bear() {
    }

    public Bear(String eat, String walk, int age) {
        super(eat, walk, age);
    }

    @Override
    public void hunt() {
        System.out.println("Bear hunting ");

    }
}
