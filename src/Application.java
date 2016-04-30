import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Kemp on 4/29/2016.
 * Application to ask user for which function they want to execute.
 */
public class Application {
    public boolean errorInChoice = false;
    public String errorString = "Error in choice, please reenter choice.";
    public int userChoice;
    public boolean exitApp = false;
    public PrintStream myPrintStream;
    public Scanner userInput;

    public Application(PrintStream newStream, InputStream inputStream){
        myPrintStream = newStream;
        this.userInput = new Scanner(inputStream);
    }

    public Application(PrintStream newStream){
        this(newStream,System.in);
    }

    public Application(){
        this(System.out,System.in);
    }

    public static void main(String[] args) {
        Application myApp = new Application();
        myApp.startApp();
    }

    public void startApp(){String askUserForChoice = "Enter choice >> ";
        while(!this.exitApp){
            if(this.errorInChoice) { //if error display error message
                this.myPrintStream.println(this.errorString);
                this.errorInChoice = false; //reset error message
            }
            this.printMenuOptions(); //output Menu to User
            String myUserInput = getUserInput(userInput,askUserForChoice);
            this.verifyUserInputIsInteger(myUserInput);  //verify input is integer
            if(!this.errorInChoice)    //send input to menuOptionHandler
                this.menuOptionHandler(this.userChoice);
        }
    }

    //request input from user and return user's input
    public String getUserInput(Scanner userInput, String message){
        this.myPrintStream.println(message);
        return userInput.nextLine();
    }

    //verify user input can be converted into an integer
    public void verifyUserInputIsInteger(String userInput){
        if(isInteger(userInput))
            this.userChoice = Integer.parseInt(userInput);
        else
            this.errorInChoice = true;
    }

    public static boolean isInteger(String myString){
        try{
            int myInt = Integer.parseInt(myString);
        } catch(Exception e){
            return false;
        }
        return true;
    }

    public void printMenuOptions(){
        this.myPrintStream.println("1. Body Mass Index");
        this.myPrintStream.println("2. Distance Formula");
        this.myPrintStream.println("3. Retirement");
        this.myPrintStream.println("4. Email Verifier");
        this.myPrintStream.println("5. Exit");
    }

    public void menuOptionHandler(int option){
        //act on option given
        switch(option){
            case 1:
                this.bodyMassIndexMenu();
                break;
            case 2:
                this.distanceFormulaMenu();
                break;
            case 3:
                this.retirementMenu();
                break;
            case 4:
                this.emailVerifierMenu();
                break;
            case 5:
                this.exitApp = true;
                break;
            default:
                this.errorInChoice = true;
        }
    }
 /**Menu to Run Body Mass Index*/
    public void bodyMassIndexMenu(){
      Scanner userInput = new Scanner(System.in);
        boolean errorInValue = false;
        String errorMessage = "Error in input, please retry.";
        while (true) {
            if(errorInValue) {
                System.out.println(errorMessage);
                errorInValue = false;   //reset error
            }
        System.out.println("Welcome to Body Mass Index Menu");
        System.out.println("Would you like to find the BMI? Y/N");
            String userDecision = getUserInput(userInput,">> ");
            if(userDecision.equals("n") || userDecision.equals("N"))
                break;
            else if(userDecision.equals("y") || userDecision.equals("Y")) {
              double wgt=0.0;
              double height1=0.0;
              double height2 =0.0;
              if(!errorInValue) {
                    String wg = getUserInput(userInput, "Enter weight >> ");
                    if (isInteger(wg)) {
                        wgt = Double.parseDouble(wg);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    String h1 = getUserInput(userInput, "Enter height in feet >> ");
                    if (isInteger(h1)) {
                        height1 = Double.parseDouble(h1);
                    } else
                        errorInValue = true;
                }
                 if(!errorInValue) {
                    String h2 = getUserInput(userInput, "Enter height in inches >> ");
                    if (isInteger(h2)) {
                        height2 = Double.parseDouble(h2);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    BodyMassIndex mybmi = new BodyMassIndex(height1,height2,wgt);
                    double bmi = mybmi.CalcBmi();
                    String cat = mybmi.BmiDetails(bmi);
                    System.out.println("BMI is: " + bmi);
                    System.out.println("BMI Category is :" + cat);
                }
            }  
        }
    }

    /**Menu to Run distance formula*/
    public void distanceFormulaMenu(){
//        this.userInput = new Scanner(System.in);
        boolean errorInValue = false;
        String errorMessage = "Error in input, please retry.";
        while (true) {
            if(errorInValue) {
                this.myPrintStream.println(errorMessage);
                errorInValue = false;   //reset error
            }
            this.myPrintStream.println("Welcome to Distance Formula Menu");
            this.myPrintStream.println("Would you like to find Distance between two points? Y/N");
            String userDecision = getUserInput(userInput,">> ");
            if(userDecision.equals("n") || userDecision.equals("N"))
                break;
            else if(userDecision.equals("y") || userDecision.equals("Y")) {
                int myX1 = 0;
                int myX2 = 0;
                int myY1 = 0;
                int myY2 = 0;
                //verify all inputs can be converted to integers
                //query user for each input value if user decides to proceed
                if(!errorInValue) {
                    String x1 = getUserInput(userInput, "Enter 'x' of first coordinate >> ");
                    if (isInteger(x1)) {
                        myX1 = Integer.parseInt(x1);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    String y1 = getUserInput(userInput, "Enter 'y' of first coordinate >> ");
                    if (isInteger(y1)) {
                        myY1 = Integer.parseInt(y1);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    String x2 = getUserInput(userInput, "Enter 'x' of second coordinate >> ");
                    if (isInteger(x2)) {
                        myX2 = Integer.parseInt(x2);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    String y2 = getUserInput(userInput, "Enter 'y' of second coordinate >> ");
                    if (isInteger(y2)) {
                        myY2 = Integer.parseInt(y2);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    DistanceFormula myDistanceFormula = new DistanceFormula(myX1, myX2, myY1, myY2);
                    double myDistance = myDistanceFormula.findDistanceBetweenPoints();
                    this.myPrintStream.println("Distance is: " + myDistance);
                }
            }
        }
    }

    public void retirementMenu(){
        this.myPrintStream.println("Welcome to Retirement Menu");

    }

    public void emailVerifierMenu(){
        this.myPrintStream.println("Welcome to Email Verifier Menu");

    }
}
