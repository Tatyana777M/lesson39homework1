
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return age == person.age;
//                    && Object.equals (name, person.name);

    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

