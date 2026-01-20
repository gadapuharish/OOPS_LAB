import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        int mark;
        double gpa;
        boolean istrue;
        System.out.print("Enter a name:");
        name= scanner.nextLine();
        System.out.print("Enter a mark:");
        mark=scanner.nextInt();
        System.out.print("Enter a gpa:");
        gpa=scanner.nextDouble();
        System.out.print("is true or false:");
        istrue=scanner.nextBoolean();
        if (istrue){
            System.out.print("True");
        }else{
            System.out.print("False");
        
        }
        scanner.close();
    }
    
}