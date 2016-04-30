/**
 * Code by Srikar Devarakonda
 * Body Mass Index: Input height in feet and inches.Input weight in pounds.
   Return BMI value andcategory:
   Underweight = <18.5;
   Normal weight = 18.5–24.9; 
   Overweight = 25–29.9; Obesity = BMI of 30 or greater
 */
import java.io.*;
public class BodyMassIndex
{
    private double height1;
    private double height2;
    private double weight;
    public BodyMassIndex(double height1,double height2, double weight)
    {
        this.height1=height1;
        this.height2= height2;
        this.weight=weight;
    }
    public double feettoinch()
    {
        double heightt = height1 * 12;
        height2 = heightt + height2;
        return height2;
    }
    public double CalcBmi()
    {
        double height = feettoinch();
        double bmi = (weight * 703) / (height * height);
        return Math.round(bmi*10)/10;
    }
    static String BmiDetails(double bmi)
    {
        if (bmi <= 18.5 && bmi >=0)
        {
            return "You are Underweight.\nSuggestion : Gain Weight.";
        }
        else if (bmi >=18.5 && bmi<=24.9)
        {
            return "Your weight is Normal.\nSuggestion : Continue your Daily Routine.";
        }
        else if(bmi >= 25 && bmi <=29.9)
        {
            return "You are Overweight.\nSuggestion : Walk Daily.";
        }
        else if(bmi > 30)
        {
            return "You are Obese.\nSuggestion : Workout Daily.";
        }
        else
        {
            return "Invalid Input.BMI Cannot be Negetive.";
        }
    }
}
