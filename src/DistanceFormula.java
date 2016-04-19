/**
 * Created by Kemp on 4/19/2016.
 */
public class DistanceFormula {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public DistanceFormula(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double findDistanceBetweenPoints(){
        int differenceBetweenXValues = this.x2 - this.x1;
        int differenceBetweenYValues = this.y2 - this.y1;
        int squareOfXValues = differenceBetweenXValues * differenceBetweenXValues;
        int squareOfYValues = differenceBetweenYValues * differenceBetweenYValues;
        int sumOfXYValueSquares = squareOfXValues + squareOfYValues;
        return Math.sqrt((double)sumOfXYValueSquares);
    }
}
