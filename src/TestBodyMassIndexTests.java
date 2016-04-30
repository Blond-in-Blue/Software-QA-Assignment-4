/**
 * Test Cases by Srikar Devarakonda
 * Unit Test Cases for different scenario while calculating Body Mass Index
 */
//import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
//private static final double DELTA = 1e-15;

public class TestBodyMassIndexTests
{
  @Test
  public void calculate_bmi1() 
   {
       double height1 = 5.0;
       double height2 = 5.0;
       double weight = 150.0;
       BodyMassIndex mybmi = new BodyMassIndex(height1,height2, weight);
       double bmi = 25.0;
       assertEquals(bmi, mybmi.CalcBmi(), 0);
  }
  @Test
  public void calculate_feetinch() 
   {
       double height1 = 5.0;
       double height2 = 5.0;
       double weight = 150.0;
       BodyMassIndex mybmi = new BodyMassIndex(height1,height2, weight);
       double bmi = 65.0;
       assertEquals(bmi, mybmi.feettoinch(), 0);
  }
  @Test
   public void BMI_underweight()
   {
       double height1 = 7.0;
       double height2 = 1.0;
       double weight = 100.0;  
       BodyMassIndex mybmi = new BodyMassIndex(height1,height2, weight);
       assertEquals("You are Underweight.\nSuggestion : Gain Weight.", mybmi.BmiDetails(15));
   }
   @Test
   public void BMI_overweight() 
   {
       double height1 = 6.0;
       double height2 = 10.0;
       double weight = 120.0;  
       BodyMassIndex mybmi = new BodyMassIndex(height1,height2, weight);
       assertEquals("You are Overweight.\nSuggestion : Walk Daily.", mybmi.BmiDetails(28));
   }
   @Test
   public void BMI_obese ()
   {
       double height1 = 5.0;
       double height2 = 4.0;
       double weight = 140.0; 
       BodyMassIndex mybmi = new BodyMassIndex(height1,height2, weight);
       assertEquals("You are Obese.\nSuggestion : Workout Daily.", mybmi.BmiDetails(40));
   }
   @Test
   public void BMI_normal() 
   {
       double height1 = 5.0;
       double height2 = 7.0;
       double weight = 160.0;  
       BodyMassIndex mybmi = new BodyMassIndex(height1,height2, weight);
       assertEquals("Your weight is Normal.\nSuggestion : Continue your Daily Routine.", mybmi.BmiDetails(22));
   }
    @Test
    public void negativeWeightValue(){
      double height1 = 6.0;
       double height2 = 4.0;
       double weight = 105.0; 
       BodyMassIndex mybmi = new BodyMassIndex(height1,height2, weight);
       assertEquals("Invalid Input.BMI Cannot be Negetive.",mybmi.BmiDetails(-1));
    }
}
