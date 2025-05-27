import java.util.*;
public class q14temperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter degree in fahrenheit: ");
        double F= sc.nextDouble();
        double C= (F-32)*5/9;
        System.out.println("Degree in Celcius: "+C);
    }
}
