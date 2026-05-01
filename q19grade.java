import java.util.Scanner;
public class q19grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your percentage");
        float a= sc.nextFloat();
        if(a>90) {
System.out.println("You've got A grade");
        }
        else if (a>75 && a<90){
System.out.println("You've got B grade");
}
else if (a>60 && a<75){
System.out.println("You've got C grade");
}
else if (a>30 && a<75){
System.out.println("You've got D grade");
}
else {
    System.out.println("You've got E grade");
}
        }

        
    }


