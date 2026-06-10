
import java.util.Scanner;

public class q29summOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        int a= 0;
for (int i=1; i<= n; i=i+2){
a= i+a;

}
    System.out.print(a);

}
    
}
