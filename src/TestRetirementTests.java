import junit.framework.TestCase;
import org.hamcrest.core.Is;
import org.junit.Assert;

public class TestRetirementTests extends TestCase
{
    public void testNoCurrentAge()
    {
        int noAge = 0;
        Retirement myRetirement = new Retirement();
        myRetirement.currentAge = noAge;
        assertEquals(false, myRetirement.getAge());
    }

    public void testUnderAge()
    {
        int underAge = 10;
        Retirement myRetirement = new Retirement();
        myRetirement.currentAge = underAge;
        assertEquals(false, myRetirement.getAge());
    }

    public void testOverAge()
    {
        int overAge = 150;
        Retirement myRetirement = new Retirement();
        myRetirement.currentAge = overAge;
        assertEquals(false, myRetirement.getAge());
    }

    public void testProperAge()
    {
        int properAge = 21;
        Retirement myRetirement = new Retirement();
        myRetirement.currentAge = properAge;
        assertEquals(true, myRetirement.getAge());
    }

    public void testNoAnnualSalary()
    {
        int noSalary = 0;
        Retirement myRetirement = new Retirement();
        myRetirement.annualSalary = noSalary;
        assertEquals(false, myRetirement.getAnnualSalary());
    }

    public void testSmallAnnualSalary()
    {
        int smallSalary = 18000;
        Retirement myRetirement = new Retirement();
        myRetirement.annualSalary = smallSalary;
        assertEquals(false, myRetirement.getAnnualSalary());
    }

    public void testProperAnnualSalary()
    {
        int expectedSalary = 40000;
        Retirement myRetirement = new Retirement();
        myRetirement.annualSalary = expectedSalary;
        assertEquals(false, myRetirement.getAnnualSalary());
    }

    public void testNoPercentageSaved()
    {
        double noPercentage = 0.0;
        Retirement myRetirement = new Retirement();
        myRetirement.percentageSaved = noPercentage;
        assertEquals(false, myRetirement.getPercentageSaved());
    }

    public void testConvertedPercentageSaved()
    {
        double convertedPercentage = 13;
        Retirement myRetirement = new Retirement();
        myRetirement.percentageSaved = convertedPercentage;
        assertEquals(true, myRetirement.getPercentageSaved());
    }

    public void testProperPercentageSaved()
    {
        double properPercentage = 0.03;
        Retirement myRetirement = new Retirement();
        myRetirement.percentageSaved = properPercentage;
        assertEquals(true, myRetirement.getPercentageSaved());
    }

    public void testNoSavingsGoal()
    {
        double noSavings = 0.0;
        Retirement myRetirement = new Retirement();
        myRetirement.savingsGoal = noSavings;
        assertEquals(false, myRetirement.getSavingsGoal());
    }

    public void testProperSavingsGoal()
    {
        double Savings = 100000.0;
        Retirement myRetirement = new Retirement();
        myRetirement.savingsGoal = Savings;
        assertEquals(true, myRetirement.getSavingsGoal());
    }

    public void testRetiremntGoalReached()
    {
        Retirement myRetirement = new Retirement();
        myRetirement.currentAge = 21;
        myRetirement.annualSalary = 59000;
        myRetirement.percentageSaved = 0.06;
        myRetirement.savingsGoal = 100000;

        myRetirement.doRetirement();
        assertTrue(myRetirement.ageGoalMet < 100);
    }

    public void testRetirementGoalNotReached()
    {
        Retirement myRetirement = new Retirement();
        myRetirement.currentAge = 21;
        myRetirement.annualSalary = 59000;
        myRetirement.percentageSaved = 0.01;
        myRetirement.savingsGoal = 1000000;

        myRetirement.doRetirement();
        assertEquals(myRetirement.ageGoalMet , -1);
    }

}
