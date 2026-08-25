
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter day:\n");
        int number=input.nextInt();
        int month=0;

        // Check if the entered day is valid
        // Persian year can have up to 366 days
        while(number>366 || number<1){
            System.err.println("Invalid day, enter again:\n");
            number=input.nextInt();
        }

        // First 6 months of the Persian calendar have 31 days
        if(number<=6*31){
            month=number/31;

            // If the day is not exactly at the end of a month,
            // move to the next month
            if(number%31!=0)
                month++;
        }

        // Months 7 to 11 have 30 days
        else if(number>6*31 && number<=6*31+150){
            month=6+ (number - 6*31)/30;
            if ((number - 6*31)%30 !=0)
                month++;
        }

        // Remaining days belong to month 12 (Esfand)
        else{
            month=12;
        }
        System.out.println(month);

    }
}