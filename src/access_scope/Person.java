package access_scope;

public class Person {
    private int age;
    private int wisdom;
    private int fitness;

    private Person(int inputAge) {
        this.age = inputAge;
        this.wisdom = inputAge * 5;
        this.fitness = 100 - inputAge;
    }

    private void setAge(int newAge) {
        this.age += newAge;
    }

    private void setWisdom(int newWisdom) {
        this.wisdom += newWisdom;
    }

    private void setFitness(int newFitness) {
        this.fitness -= newFitness;
    }

    private void hasBirthday() {
        this.setAge(1);
        this.setWisdom(5);
        this.setFitness(3);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", wisdom=" + wisdom +
                ", fitness=" + fitness +
                '}';
    }

    public static void main(String[] args) {
        Person husein = new Person(15);
        System.out.println(husein.toString());
        husein.hasBirthday();
        System.out.println(husein.toString());
    }
}
