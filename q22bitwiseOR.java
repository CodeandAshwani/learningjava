import java.util.Scanner;

class q22bitwiseOR {
    public static void main(String[] args) {
           try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        System.out.print("Enter another number: " );
        int b= sc.nextInt();
        int orresult= a | b;
        System.out.println("OR Result: " +orresult);
    }
}
}