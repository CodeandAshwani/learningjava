import java.util.Scanner;

public class a1_mood25 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How do you Describe your mood today");
        System.out.println("1. Happy  2. Sad  3. Romantic  4. Bored");
        System.out.print("Pick a number that matches your mood: ");
        
        int mood = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("\nHere's something you might like:");
        switch (mood) 
        {
            case 1 -> System.out.println("- PK\n- 3 Idiots\n- Golmal");
            case 2 -> System.out.println("- Sanam Teri Kasam\n- Ae Dil hai Mushkil\n- Devdas");
            case 3 -> System.out.println("- Jab we met\n- Kal ho na ho\n- Yeh Jawaani hai Deewani");
            case 4 -> System.out.println("- Masti\n- Tees Maar Khan\n- Kathal");
            default -> System.out.println("Wrong choice. Try again (1/2/3/4!");
        }

        System.out.println("\nThanks for using the Under25 movie bot");
        System.out.println("Created by-  e/ashwani2");
            
    }
}