abstract class Person {
    String name;
    Person(String name) {
        this.name = name;
        System.out.println("Person Constructor Called");
    }
    abstract void getRole();
}
class Student extends Person {
    Student(String name) {
        super(name);
    }
    void getRole() {
        System.out.println(name + " is a Student");
    }
}
class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }
    void getRole() {
        System.out.println(name + " is a Teacher");
    }
}
public class Exp4 {
    public static void main(String[] args) {
        Person p1 = new Student("Nandhini");
        p1.getRole();
        Person p2 = new Teacher("Anitha");
        p2.getRole();
    }
}
