public  abstract class Predator implements HuntAble {

    private String eat;
    private String walk;
    private int age;

    public Predator() {
    }

    public Predator(String eat, String walk, int age) {
        this.eat = eat;
        this.walk = walk;
        this.age = age;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Predator{" +
                "eat='" + eat + '\'' +
                ", walk='" + walk + '\'' +
                ", age=" + age +
                '}';
    }
}
