import java.io.ByteArrayOutputStream;
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

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Application myApplication = new Application();
        String askUserForChoice = "Enter choice >> ";
        while(!myApplication.exitApp){
            if(myApplication.errorInChoice) { //if error display error message
                System.out.println(myApplication.errorString);
                myApplication.errorInChoice = false; //reset error message
            }
            printMenuOptions(); //output Menu to User
            String myUserInput = getUserInput(userInput,askUserForChoice);
            myApplication.verifyUserInputIsInteger(myUserInput);  //verify input is integer
            if(!myApplication.errorInChoice)    //send input to menuOptionHandler
                myApplication.menuOptionHandler(myApplication.userChoice);
        }
    }

    //request input from user and return user's input
    public static String getUserInput(Scanner userInput, String message){
        System.out.println(message);
        return userInput.nextLine();
    }

    //verify user input can be converted into an integer
    public void verifyUserInputIsInteger(String userInput){
        if(isInteger(userInput))
            userChoice = Integer.parseInt(userInput);
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

    public static void printMenuOptions(){
        System.out.println("1. Body Mass Index");
        System.out.println("2. Distance Formula");
        System.out.println("3. Retirement");
        System.out.println("4. Email Verifier");
        System.out.println("5. Exit");
    }

    public void menuOptionHandler(int option){
        //act on option given
        switch(option){
            case 1:
                bodyMassIndexMenu();
                break;
            case 2:
                distanceFormulaMenu();
                break;
            case 3:
                retirementMenu();
                break;
            case 4:
                emailVerifierMenu();
                break;
            case 5:
                this.exitApp = true;
                break;
            default:
                this.errorInChoice = true;
        }
    }

    public static void bodyMassIndexMenu(){
        System.out.println("Welcome to Body Mass Index Menu");

    }

    /**Menu to Run distance formula*/
    public static void distanceFormulaMenu(){
        Scanner userInput = new Scanner(System.in);
        boolean errorInValue = false;
        String errorMessage = "Error in input, please retry.";
        while (true) {
            if(errorInValue) {
                System.out.println(errorMessage);
                errorInValue = false;   //reset error
            }
            System.out.println("Welcome to Distance Formula Menu");
            System.out.println("Would you like to find Distance between two points? Y/N");
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
                        myX1 = Integer.parseInt(y1);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    String x2 = getUserInput(userInput, "Enter 'x' of second coordinate >> ");
                    if (isInteger(x2)) {
                        myX1 = Integer.parseInt(x2);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    String y2 = getUserInput(userInput, "Enter 'y' of second coordinate >> ");
                    if (isInteger(y2)) {
                        myX1 = Integer.parseInt(y2);
                    } else
                        errorInValue = true;
                }
                if(!errorInValue) {
                    DistanceFormula myDistanceFormula = new DistanceFormula(myX1, myX2, myY1, myY2);
                    double myDistance = myDistanceFormula.findDistanceBetweenPoints();
                    System.out.println("Distance is: " + myDistance);
                }
            }
        }
    }

    public static void retirementMenu(){
        System.out.println("Welcome to Retirement Menu");

    }

    public static void emailVerifierMenu(){
        System.out.println("Welcome to Email Verifier Menu");

    }
}
