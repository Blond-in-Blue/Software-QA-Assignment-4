/**
 * Test Cases by Srikar Devarakonda
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
       assertEquals("You are Underweight.\nSuggestion : Gain Weight.", BodyMassIndex.BmiDetails(16));
   }
   @Test
   public void BMI_overweight() 
   {
       assertEquals("You are Overweight.\nSuggestion : Walk Daily.", BodyMassIndex.BmiDetails(28));
   }
   @Test
   public void BMI_obesel ()
   {
       assertEquals("You are Obese.\nSuggestion : Workout Daily.", BodyMassIndex.BmiDetails(40));
   }
   @Test
   public void BMI_optimal () 
   {
       assertEquals("Your weight is Normal.\nSuggestion : Continue your Daily Routine.", BodyMassIndex.BmiDetails(20));
   }
   
}
