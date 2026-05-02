
import java.util.Scanner;

class q27bitwiseevenodd
{public static void main(String[] args) {
    try (Scanner sc= new Scanner(System.in)){
        System.out.println("Enter a number for even or odd");
        int a= sc.nextInt();
        if ((a&1)==1) {
            System.out.println("The number is odd");
        }
        else {
            System.out.println("the number is even");
        }
    }

}}