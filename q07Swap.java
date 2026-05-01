import java.util.*;
public class q7Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A  ");
        int a= sc.nextInt();
        System.out.print("Enter value of B  " );
        int b= sc.nextInt();
        //System.out.println("a=" +b);
        //System.out.println("b=" +a);
    int c=a;
    a = b;
    b= c;
    System.out.println("\n\nSwapping done...");
    System.out.println("Value of A = " +a);
    System.out.println("Value of B = " +b);
    }
    

}
