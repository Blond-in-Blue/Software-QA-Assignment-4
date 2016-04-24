/**
 * Test Cases by Srikar Devarakonda
 * Unit Test Cases for different scenario while calculating Body Mass Index
 */
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class TestBodyMassIndexTests 
{
   BodyMassIndex bmi;
   public void setUp()
   {
    bmi = new BodyMassIndex();
   }
   @Test 
   public void SampleTestcase()
   {
    assertTrue(true);
   }
   @Test
   public void calculate_bmi() 
   {
       assertTrue(BodyMassIndex.CalcBmi(150.0,65.0)==25.0);
   }
   @Test
   public void BMI_underweight()
   {
       assertEquals("You are Underweight.\nSuggestion : Gain Weight.", BodyMassIndex.BmiDetails(15));
   }
   @Test
   public void BMI_overweight() 
   {
       assertEquals("You are Overweight.\nSuggestion : Walk Daily.", BodyMassIndex.BmiDetails(28));
   }
   @Test
   public void BMI_obese ()
   {
       assertEquals("You are Obese.\nSuggestion : Workout Daily.", BodyMassIndex.BmiDetails(40));
   }
   @Test
   public void BMI_normal() 
   {
       assertEquals("Your weight is Normal.\nSuggestion : Continue your Daily Routine.", BodyMassIndex.BmiDetails(22));
   }
    @Test
    public void negativeWeightValue(){
        assertEquals("Invalid Input.BMI Cannot be Negative.",BodyMassIndex.BmiDetails(-1));
    }
   
}
