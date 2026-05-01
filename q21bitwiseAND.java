
import java.util.Scanner;

class q21bitwiseAND {
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        System.out.print("Enter another number: " );
        int b= sc.nextInt();
        int andresult= a & b;
    
      
        System.out.println("AND Result: " +andresult); 
        }
    }
}

