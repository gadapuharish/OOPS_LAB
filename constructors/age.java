class Student {
String name;
int age;
Student() {
name = "Harish";
age = 18;
System.out.println("Default constructor called");
}
void display() {
System.out.println("Name: " + name + ", Age: " + age);
}
}
public class Exp1 {
public static void main(String[] args) {
Student s1 = new Student();
s1.display();
}
}