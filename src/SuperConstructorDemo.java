class Person {
    Person() {
        System.out.println("Person class");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("Student class");
    }
}

public class Main {
    public static void main(String[] args) {
        new Student();
    }
}
