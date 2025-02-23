import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
        public static void main(String[] args) {
            List<String> stringList = List.of("Jack", "John", "Sam", "Jack");
            List<Person> peopleList = List.of(
                    new Person("Jack", 10),
                    new Person("Sam", 21),
                    new Person("Margo", 14),
                    new Person("Slava", 19),
                    new Person("Jack", 10)
            );
            printList(stringList);
            printList(peopleList);
        }
        private static <T> void printList(List<T> list) {
            System.out.println("List: " + list);
            if (hasDuplicate(list)) {
                System.out.println("The list contains duplicate elements.");
            } else {
                System.out.println("The list does not contain duplicate elements.");
            }
            System.out.println();
        }
        private static <T> boolean hasDuplicate(List<T> list) {
            Set<T> set = new HashSet<>();
            for (T item : list)
                if (!set.add(item)) {
                    return true;
                }
            return false;
        }
    }



