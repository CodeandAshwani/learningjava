import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // int num=1; //initialization
        // while (num<=10){ //condition
        //     System.out.println(num);
        //     num=num+1; //updating
        // }
        // int count = 5;
        // while (count>=1) {
        //     System.out.println(count);
        //     count= count-1;
        // }
        try (Scanner sc= new Scanner(System.in)){
        int i= 0;
while (i<5) {
    int a= sc.nextInt();
    System.out.println("Number is: " +a);
i++;
}
    }
}
}
