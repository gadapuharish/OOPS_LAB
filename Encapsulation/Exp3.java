class Employee {
    private final int id;
    private String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
public class Exp3 {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Nandhini");
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
    }
}