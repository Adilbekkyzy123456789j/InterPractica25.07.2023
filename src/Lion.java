public class Lion extends Predator{
    public Lion() {
    }

    public Lion(String eat, String walk, int age) {
        super(eat, walk, age);
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunting");


    }
}
