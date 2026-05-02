
import java.util.Scanner;

public class q26rightshift {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            int leftshift = a >>4;
            System.out.println("leftshift Result: " + leftshift);
        }
    }

}
