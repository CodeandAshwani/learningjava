
import java.util.Scanner;

public class q28table {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number for the multiplication table: `");
    int n= sc.nextInt();
    int i = 1;
    while (i<=10){
      int a=n*i;
      System.out.println(+n + "*" +i+ "="  +a);
      i++;
    }

  }  
}
