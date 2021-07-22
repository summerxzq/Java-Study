import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("zhansan",12);
        Person P2 = new Person("lisi",13);
        Person P3 = new Person("wangwu",18);
        list.add(p1);
        list.add(P2);
        list.add(P3);
        System.out.println(list.contains(new Person("zhansan",12)));
        System.out.println("hello git");
        System.out.println("hello git3");
        System.out.println("hello git4");
        System.out.println("master");
        System.out.println("hot-fix");
    }
    }


class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Person) {
            Person p = (Person) o;
            return this.name.equals(p.name)&&this.age==p.age;
        }
        return false;
    }
}