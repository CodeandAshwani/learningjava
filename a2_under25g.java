

import java.util.Scanner;

public class a2_under25g 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter boarding city: ");
        String from = sc.nextLine();
        
        System.out.print("Enter destination city: ");
        String to = sc.nextLine();
        
        System.out.print("Enter date of travel (DD/MM/YYYY): ");
        String date = sc.nextLine();
        
        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();
        sc.nextLine();  
        
        System.out.println("\nAvailable Options to choose from:");
        System.out.println("1. IndiGo - 10:00 AM -- ₹18000");
        System.out.println("2. Emirates - 2:00 PM -- ₹18000");
        System.out.println("3. Air India - 6:00 PM -- ₹18000");
        System.out.print("Choose from the options (1/2/3) :");
        int options = sc.nextInt();
        sc.nextLine(); 
        
        String flight;
        switch (options) {
            case 1: flight = "IndiGo - 10:00 AM -- ₹18000"; 
            break;
            case 2: flight = "Emirates - 2:00 PM -- ₹18000"; 
            break;
            case 3: flight = "Air India - 6:00 PM -- ₹18000"; 
            break;
            default: flight = "Invalid Selection"; 
        }
        
        if (!flight.equals("Invalid Selection")) 
        {
            int price = 18000;
            int totalCost = tickets * price;

            System.out.println("\nConfirmation For Your Flight--");
            System.out.println("Passenger Name  : " + name);
            System.out.println("Flight Route    : " + from + " to " + to);
            System.out.println("Travel Date     : " + date);
            System.out.println("Selected Flight : " + flight);
            System.out.println("No. of Tickets  : " + tickets);
            System.out.println("Total Price     : ₹" + totalCost);
            System.out.println("Username      : e/ashwani2");
        } 
        else {
            System.out.println("\nInvalid flight choice, Please choose between 1, 2 or 3");
        }

    }
}
