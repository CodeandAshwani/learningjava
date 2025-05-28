import java.util.*;
public class a7Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a= sc.nextDouble();
        System.out.print("Enter the operation (+,-,*,/):  ");
        char op = sc.next().charAt(0);
        System.out.print("Enter another number: ");
        double b= sc.nextDouble();
        double r;
        if (op == '+'){
            r=a+b;
        }else if (op == '-') {
            r=a-b;
            
        } else if (op == '*') {
            r=a*b;
        }else if (op == '/' && b!=0) {
            r=a/b;
        }else {
            System.out.println("enter valid");
            return;
        }
        System.out.println(a+" " +op+ "" +b+ " = " +r);


    }
    
}
