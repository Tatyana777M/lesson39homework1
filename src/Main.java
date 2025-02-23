
public class Main {
    public static <T> void main(String[] args) {

        List<String> list = List.of("Jack", "John", "Sam", "Jack");
        List<Person> people = List.of(
                new Person("Jack", 10),
                new Person("Sam", 21),
                new Person("Margo", 14),
                new Person("Slava", 19),
                new Person("Jack", 10));
    }
}