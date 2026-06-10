
import java.util.Scanner;
class returnfunction {
    public static void main(String[] args) {
      
        greet();
       
        int first = readnumber() ;
        int second = readnumber();

        int sum = first + second;
        System.out.print("Sum is: " + sum);
    }



    public static int readnumber(){
         Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        return number;
    }



    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }
//     public static int readnumber(){
//         int number = 2;
//         return number;
        
//     } 
}
