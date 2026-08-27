import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the amount of money from the user
        System.out.println("Enter value:");
        int money = input.nextInt();

        // Calculate the number of 50-value bills
        int count50 = money / 50;
        money %= 50; 

        // Calculate the number of 10-value bills
        int count10 = money / 10;
        money %= 10; 

        // Calculate the number of 5-value bills
        int count5 = money / 5;
        money %= 5; 

        // The remaining money is represented by 1-value bills
        int count1 = money;

        
        System.out.println(
            "We have " + count50 + " of 50, " +
            count10 + " of 10, " +
            count5 + " of 5, and " +
            count1 + " of 1."
        );

        
    }
}