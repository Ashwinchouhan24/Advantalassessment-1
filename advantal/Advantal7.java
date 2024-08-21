package advantal;
import java.util.*;

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + ":" + age ;
    }
}

public class Advantal7 {

    public static void main(String[] args) {
        
        Comparator<Person> comp = (p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()); // Lambda expression
        
        TreeSet<Person> t = new TreeSet<>(comp);

       t.add(new Person("Alice", 30));
        t.add(new Person("Bob", 25));
        t.add(new Person("Charlie", 35));
        t.add(new Person("David", 20));

        System.out.println(t);
        
    }
}
