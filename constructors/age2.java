class Student {
String name;
int age;
Student(String n, int a) {
name = n;
age = a;
System.out.println("Parameterized constructor called");
} 
void display() {
System.out.println("Name: " + name + ", Age: " + age);
}
}
public class Exp2 {
public static void main(String[] args) {
Student s1 = new Student("harish", 20);
s1.display();
}
}