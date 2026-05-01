 import java.util.Scanner;

class q24bitwisecompliment {
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
          int compliment= ~a;
        System.out.println("compliment Result: " +compliment);
    }
}
}