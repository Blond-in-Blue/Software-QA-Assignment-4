import java.util.Scanner;

/**
 * Created by Kemp on 4/19/2016.
 */
public class Retirement {

    public static void main(String[] args) {

        int currentAge;
        double annualSalary;
        double percentageSaved;
        double savingsGoal;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your current age: ");
        currentAge = input.nextInt();

        System.out.println("Enter your current annual salary: ");
        annualSalary = input.nextDouble();

        System.out.println("Enter the percentage of your annual salary that is saved for retirement: ");
        percentageSaved = input.nextDouble();
        percentageSaved = percentageSaved *2;

        System.out.println("What is your retirement savings goal? ");
        savingsGoal = input.nextDouble();

        

    }

}
