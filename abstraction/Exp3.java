abstract class University {
    static void rules() {
        System.out.println("Follow university rules");
    }
    abstract void courses();
}
class Engineering extends University {
    void courses() {
        System.out.println("Engineering Courses");
    }
}
class Medical extends University {
    void courses() {
        System.out.println("Medical Courses");
    }
}
public class Exp3 {
    public static void main(String[] args) {
        University.rules();
        University u1 = new Engineering();
        u1.courses();
        University u2 = new Medical();
        u2.courses();
    }
}