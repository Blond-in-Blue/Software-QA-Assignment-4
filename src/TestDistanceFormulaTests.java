import junit.framework.TestCase;

/**
 * Created by Kemp on 4/19/2016.
 * Testing framework for distance formula.
 */
public class TestDistanceFormulaTests extends TestCase {

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

}
