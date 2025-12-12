import java.util.ArrayList;
import java.util.Scanner;

public class CT5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<>(); // this prompts a data array for temp/day 
        ArrayList<Double> temps = new ArrayList<>();

        // Add the days of the week
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // collect temperatures from the user, then move on to the next day
        for (int i = 0; i < days.size(); i++)
            
            {
            System.out.print("Enter average temperature for " + days.get(i) + ": ");
            double temp = input.nextDouble(); 
            temps.add(temp);
        }

        // ask user what they want to see
        System.out.println("\nType a day name to display the temperature for that day.");
        System.out.println("Or type 'week' to display all temperatures and the weekly average.");

        System.out.print("Enter choice: ");
        input.nextLine(); 

        String userChoice = input.nextLine();

        if (userChoice.equalsIgnoreCase("week")) {

            double sum = 0;

            System.out.println("\nTemperatures for the whole week:");

            for (int i = 0; i < days.size(); i++) 
                
                {
                System.out.println(days.get(i) + ": " + temps.get(i));
                sum += temps.get(i);
            }

            double average = sum / days.size();
            
            System.out.println("Weekly Average Temperature: " + average);

        } else {
            boolean found = false;

            for (int i = 0; i < days.size(); i++) {
                if (userChoice.equalsIgnoreCase(days.get(i))) {
                    System.out.println("Temperature for " + days.get(i) + ": " + temps.get(i));
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Invalid day entered.");
            }
        }

        input.close();
    }
}
