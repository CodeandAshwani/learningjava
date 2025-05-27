import java.util.*;
public class q12SimpleIntrest {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Principle:  ");
    double p= sc.nextDouble();
    System.out.print("Enter Rate:  ");
    double r= sc.nextDouble();
    System.out.print("Enter Time in months:  ");
    double t= sc.nextDouble();
double SI= (p*r*t)/100;
System.out.println("Simple Intrest: " +SI);


}
}