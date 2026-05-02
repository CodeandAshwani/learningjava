import java.util.Scanner;
class q20agegroup {
    public static void main(String[] args) {
           try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter your age");
        int a= sc.nextInt();
        if(a>0 && a<13) {
            System.out.println("You are a child");
        }
        else if (a>12 && a<20){
            System.out.println("You are a teenager");
        }
        else if (a>19 && a<60){
            System.out.println("You are an adult");
        }
        else if (a>59 && a<120){
            System.out.println("You are a senior citizen");
        }
        else {
            System.out.println("Invalid age");
        }
    }
}
}
