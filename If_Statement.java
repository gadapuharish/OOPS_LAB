import java.util.Scanner;
public class If_Statement {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=scanner.nextInt();
        if(age>=70){
            System.out.print("You are a senior");
        }
        else if(age>=18){
            System.out.print("you are an adult");
        }
        else if(age>=1){
            System.out.print("You are a baby");
        }
        else{
            System.out.print("You are not born");
        }
    }
}
