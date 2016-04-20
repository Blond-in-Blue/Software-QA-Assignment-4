import java.util.regex.Pattern;

/**
 * Created by Kemp on 4/19/2016.
 * Modified by Austin
 */
public class EmailVerifier {
    private String email;

    public EmailVerifier(String email){
        this.email = email;
    }

    public Boolean verifyEmailString(){
        if(email.isEmpty()) return false;                               //Empty String
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.', atIndex);
        Pattern alphabetic = Pattern.compile("[^a-zA-Z]");              //Special char regex pattern
        String domain = email.substring(dotIndex+1,email.length());

        if(email.substring(atIndex+1,email.length()).contains("@"))       //Has an '@' after the first '@'
            {return false;}
        else if(atIndex == 0)                                           //Lacking chars before '@'
            {return false;}
        else if(domain.length() > 3 || domain.length() == 0)            //Domain following the '.' is more than 3 chars or
            {return false;}
        else if(alphabetic.matcher(domain).find())                      //Domain contains special characters
            {return false;}
        else if((atIndex + 1) == dotIndex)                              //No site String between '@' and '.'
            {return false;}
        else
            {return true;}
    }
}
