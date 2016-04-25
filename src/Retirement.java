import java.util.Scanner;
import java.util.jar.Pack200;

public class Retirement {
    public int currentAge;
    public double annualSalary;
    public double percentageSaved;
    public double savingsGoal;
    public int yearGoalMet = -1;
    public int ageGoalMet = -1;
    public boolean properAge = false;
    public boolean properAnnualSalary = false;
    public boolean properPercentageSaved = false;
    public boolean properSavingsGoal = false;
    public boolean properRetirementPlan = false;

    Scanner input = new Scanner(System.in);

    public boolean getAge()
    {

        if(currentAge <= 18 || currentAge >= 100)
        {
            properAge = false;
        }
        else
        {
            properAge = true;
        }

        return properAge;
    }

    public boolean getAnnualSalary()
    {

        if(annualSalary <= 20000)
        {
            properAnnualSalary = false;
        }
        else
        {
            properAnnualSalary = true;
        }

        return properAnnualSalary;
    }

    public boolean getPercentageSaved()
    {
        percentageSaved = percentageSaved *2;

        if(percentageSaved > 1)
        {
            percentageSaved = percentageSaved / 100;
        }

        if(percentageSaved == 0)
        {
            properPercentageSaved = false;
        }
        else  if(percentageSaved > 0 && percentageSaved < 1)
        {
            properPercentageSaved = true;
        }

        return properPercentageSaved;
    }

    public boolean getSavingsGoal() {

        if (savingsGoal == 0)
        {
            properSavingsGoal = false;
        }
        else
        {
            properSavingsGoal = true;
        }

        return properSavingsGoal;

    }

    public int doRetirement()
    {
        for(int i = 0; i < 100; i++)
        {
            if((annualSalary * percentageSaved * i) >= savingsGoal)
            {
                yearGoalMet = i+1;
                break;
            }
        }

        if(yearGoalMet != -1)
        {
            ageGoalMet = yearGoalMet + currentAge;
        }
        else
        {
            System.out.println("you will not live long enough to acquire your goal");
        }

          return ageGoalMet;

    }

}
