/**
 * Created by Kemp on 4/19/2016.
 * Code by Srikar Devarakonda
 * Body Mass Index: Input height in feet and inches.Input weight in pounds.
   Return BMI value andcategory:
   Underweight = <18.5;
   Normal weight = 18.5–24.9; 
   Overweight = 25–29.9; Obesity = BMI of 30 or greater
 */
import java.io.*;
import java.util.Scanner; 
public class BodyMassIndex {
    public static void main (String [] args) 
    {
        double bmi; 
        double weight;
        double height2;
        double height1;
        double height;
        String bmi_desc;
        Scanner input = new Scanner (System.in); 
        System.out.print("Please Enter Your Weight in Pounds: ");
        weight = input.nextDouble();
        System.out.print("Please Enter Your Height in Feet: ");
        height1 = input.nextDouble();
        height1= height1*12;
        System.out.print("Please Enter Your Height in Inches: ");
        height2 = input.nextDouble();
        height= height1+height2;
        bmi= CalcBmi(weight,height);        
        System.out.print("\n");
        System.out.printf("Your Body Mass Index (BMI) based on the given inputs is %g.\n\n", bmi);
        bmi_desc = BmiDetails(bmi);
        System.out.println(bmi_desc);
        System.out.print("\n");
        System.out.println ("BMI  GUIDENCE CHART.");
        System.out.println ("Underweight: If your Body Mass Index is less than 18.5.");
        System.out.println ("Normal     : If your Body Mass Index falls between 18.5 and 24.9.");
        System.out.println ("Overweight : If your Body Mass Index falls between 25 and 29.9.");
        System.out.println ("Obese      : If your Body Mass Index is 30 or greater.");
    }
    static double CalcBmi(double weight,double height)
    {
      double bmi1 = (weight * 703) / (height * height);
      return Math.round(bmi1*10)/10;
    }
    static String BmiDetails(double bmi)
    {
      if (bmi <= 18.5) 
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
      re
      turn null;
    }
}
