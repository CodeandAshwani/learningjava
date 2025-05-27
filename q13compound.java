import java.util.*;
public class q13compound {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Principle:  ");
    double p= sc.nextDouble();
    System.out.print("Enter Rate:  ");
    double r= sc.nextDouble();
    System.out.print("Enter Time in months:  ");
    double t= sc.nextDouble();
double CI= p*(1+r/100)*t;
System.out.println("Compound Intrest: " +CI);


}
}