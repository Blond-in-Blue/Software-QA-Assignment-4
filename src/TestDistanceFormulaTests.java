import junit.framework.TestCase;

/**
 * Created by Kemp on 4/19/2016.
 * Testing framework for distance formula.
 */
public class TestDistanceFormulaTests extends TestCase {
    protected double precision = 0.1;

    public void testDistanceBetweenPointsPositiveXInputs(){
        int x1 = 1;
        int x2 = 3;
        int y1 = 0;
        int y2 = 0;
        DistanceFormula myDistanceFormula = new DistanceFormula(x1,x2,y1,y2);
        double distance = 2.0;
        assertEquals(distance,myDistanceFormula.findDistanceBetweenPoints());
    }

    public void testDistanceBetweenPointsPositiveYInputs(){
        int x1 = 0;
        int x2 = 0;
        int y1 = 1;
        int y2 = 3;
        DistanceFormula myDistanceFormula = new DistanceFormula(x1,x2,y1,y2);
        double distance = 2.0;
        assertEquals(distance,myDistanceFormula.findDistanceBetweenPoints());
    }

    public void testDistanceBetweenPointsNegativeXInputs(){
        int x1 = -1;
        int x2 = 1;
        int y1 = 0;
        int y2 = 0;
        DistanceFormula myDistanceFormula = new DistanceFormula(x1,x2,y1,y2);
        double distance = 2.0;
        assertEquals(distance,myDistanceFormula.findDistanceBetweenPoints());
    }

    public void testDistanceBetweenPointsNegativeYInputs(){
        int x1 = 0;
        int x2 = 0;
        int y1 = -1;
        int y2 = 1;
        DistanceFormula myDistanceFormula = new DistanceFormula(x1,x2,y1,y2);
        double distance = 2.0;
        assertEquals(distance,myDistanceFormula.findDistanceBetweenPoints());
    }

    public void testDistanceBetweenSamePoints(){
        int x1 = 1;
        int x2 = 1;
        int y1 = 1;
        int y2 = 1;
        DistanceFormula myDistanceFormula = new DistanceFormula(x1,x2,y1,y2);
        double distance = 0.0;
        assertEquals(distance,myDistanceFormula.findDistanceBetweenPoints());
    }

    public void testDoubleInputAgainstPrecision(){
        double x1 = 1.2;
        double x2 = 1;
        double y1 = 1;
        double y2 = 1;
        DistanceFormula myDistanceFormula = new DistanceFormula(x1,x2,y1,y2);
        double distance = 0.2;
        boolean closeInApproximation = true;
        double myDistance = myDistanceFormula.findDistanceBetweenPoints();
        if(Math.abs(Math.abs(myDistance) - Math.abs(distance)) > precision)
            closeInApproximation = false;
        assertTrue(closeInApproximation);
    }

    public void testDifferenceBetweenTwoNumbers(){
        double value1 = 1;
        double value2 = 2;
        double difference = 1;
        assertEquals(difference,DistanceFormula.findDifferenceBetweenTwoNumbers(value1,value2));
    }

    public void testSquareOfNumber(){
        double value = 2;
        double squareOfValue = 4;
        assertEquals(squareOfValue,DistanceFormula.findSquareOfNumber(value));
    }

    public void testSumOfTwoNumbers(){
        double value1 = 1;
        double value2 = 2;
        double sum = 3;
        assertEquals(sum,DistanceFormula.findSumOfTwoNumbers(value1,value2));
    }

    public void testDifferenceBetweenNumberAndZero(){
        double value1 = 5;
        double value2 = 0;
        double difference = 5;
        assertEquals(difference,DistanceFormula.findDifferenceBetweenTwoNumbers(value1,value2));
    }

    public void testSquareOfNegativeNumber(){
        double value = -2;
        double squareOfValue = 4;
        assertEquals(squareOfValue,DistanceFormula.findSquareOfNumber(value));
    }

    public void testSumOfTwoNegativeNumbers(){
        double value1 = -1;
        double value2 = -2;
        double sum = -3;
        assertEquals(sum,DistanceFormula.findSumOfTwoNumbers(value1,value2));
    }
}
