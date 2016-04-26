import java.util.regex.Pattern;

/**
 * Created by Kemp on 4/19/2016.
 * Modified by Austin
 * Class to verify String as a valid email
 *
 * "Input a string, determine if it is a valid email address (i.e., some_string1 ‘@’ 
 * some_string2 ‘.’ some_string3 that’s 3 letters or less) ­ can assume some_string1 and some_string2 are 
 * made up of any alphanumeric character or symbol ­ some_string3 must be less than 3 letters."
 */

public class EmailVerifier {
    private String email;

    public EmailVerifier(String email){
        this.email = email;
    }

    public Boolean verifyEmailString(){
        if(email.isEmpty())
        {return false;}                                                //Empty String

        Boolean verified = false;
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.', atIndex);
        Pattern alphabetic = Pattern.compile("[^a-zA-Z]");              //Special char regex pattern
        String domain = email.substring(dotIndex+1,email.length());

        if(email.substring(atIndex+1,email.length()).contains("@"))       //Has an '@' after the first '@'
            {verified = false;}
        else if(atIndex == 0)                                           //Lacking chars before '@'
            {verified = false;}
        else if(atIndex + 1 == dotIndex)                                //No site String between '@' and '.'
            {verified = false;}
        else if(domain.length() > 3 || domain.length() == 0)            //Domain following the '.' is more than 3 chars or
            {verified = false;}
        else if(alphabetic.matcher(domain).find())                      //Domain contains special characters
            {verified = false;}
        else
            {verified = true;}
        return verified;
    }
}
