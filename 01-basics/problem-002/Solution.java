    import java.util.Scanner;

    public class Solution {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            System.out.println("enter day:");
            int number=input.nextInt();
            int day;


            // Keep asking until the user enters a valid day number.
            while(number>366 || number<1){
                System.out.println("invalid day, enter again:");
                number=input.nextInt();
            }


             // The first 6 months of the Persian calendar have 31 days each.
            if(number<=6*31){
                day=number%31;

                // If the remainder is 0, the day is the last day of the month.
                if(day==0)
                    day=31;
            }

            // Months 7 through 11 have 30 days each.
            else if(number>6*31 && number<=6*31+150){
                day=(number-6*31)%30;

                // If the remainder is 0, the day is the 30th day of the month.
                if(day==0)
                    day=30;
            }

            // Any remaining valid day belongs to the 12th month.
            else{
                day=number-(6*31+150);
            }
            
            System.out.println(day);
        }
    }