import java.util.Random;

public class Person implements Comparable<Person> {
    private String name;
    private int rank;
    private int age;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int rank) {
        this.name = name;
        this.rank = rank;
        age = (new Random()).nextInt(80) + 20;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return getName() + " (rank:" + rank + ", age:" + age + ")";
    }

    @Override
    public int compareTo(Person otherPerson) {
        return name.compareTo(otherPerson.getName());
        //return age - otherPerson.getAge();
    }
}
