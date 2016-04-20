/**
 * Created by Kemp on 4/19/2016.
 * Distance Formula Calculation.
 */
public class DistanceFormula {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public DistanceFormula(int x1, int x2, int y1, int y2) {
        this((double) x1,(double) x2,(double) y1,(double) y2);
    }

    public DistanceFormula(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**Find the distance between two (x,y) points*/
    public double findDistanceBetweenPoints(){
        double differenceBetweenXValues = findDifferenceBetweenTwoNumbers(this.x2,this.x1);
        double differenceBetweenYValues = findDifferenceBetweenTwoNumbers(this.y2,this.y1);
        double squareOfXValues = findSquareOfNumber(differenceBetweenXValues);
        double squareOfYValues = findSquareOfNumber(differenceBetweenYValues);
        double sumOfXYValueSquares = findSumOfTwoNumbers(squareOfXValues,squareOfYValues);
        return Math.sqrt(sumOfXYValueSquares);
    }

    /**Subtract two numbers and return difference between them*/
    public static double findDifferenceBetweenTwoNumbers(double value1, double value2){
        return Math.abs(value1 - value2);
    }

    /**Square a number and return the result*/
    public static double findSquareOfNumber(double value){
        return value * value;
    }

    /**Add two numbers and return the result*/
    public static double findSumOfTwoNumbers(double value1, double value2){
        return value1 + value2;
    }
}
