import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Kemp on 4/19/2016.
 */
public class Launcher {
    public static void main(String[] args) {
        System.out.println("------------------------");

        Result resultBodyMassIndex = JUnitCore.runClasses(TestBodyMassIndexTests.class);
        for(Failure failure : resultBodyMassIndex.getFailures())
            System.out.println(failure.toString());
        System.out.println("BodyMassIndexTests: "+resultBodyMassIndex.wasSuccessful());

        System.out.println("------------------------");

        Result resultDistanceFormula = JUnitCore.runClasses(TestDistanceFormulaTests.class);
        for(Failure failure : resultDistanceFormula.getFailures())
            System.out.println(failure.toString());
        System.out.println("DistanceFormulaTests: "+resultDistanceFormula.wasSuccessful());

        System.out.println("------------------------");

        Result resultEmailVerifier = JUnitCore.runClasses(TestEmailVerifierTests.class);
        for(Failure failure : resultEmailVerifier.getFailures())
            System.out.println(failure.toString());
        System.out.println("EmailVerifierTests: "+resultEmailVerifier.wasSuccessful());

        System.out.println("------------------------");

        Result resultRetirement = JUnitCore.runClasses(TestRetirementTests.class);
        for(Failure failure : resultRetirement.getFailures())
            System.out.println(failure.toString());
        System.out.println("RetirementTests: "+resultRetirement.wasSuccessful());

        System.out.println("------------------------");
    }
}
