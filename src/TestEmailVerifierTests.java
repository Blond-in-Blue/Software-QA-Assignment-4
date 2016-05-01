import junit.framework.TestCase;

/**
 * Created by Austin on 4/19/2016.
 * Tests EmailVerifier
 */
public class TestEmailVerifierTests extends TestCase {

    public void testValidEmail() {
        String email = "awg@gmail.com";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = true;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testMoreThan1AtSymbol() {
        String email = "awg@gm@il.com";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = false;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testSubDomainSpecialChars() {
        String email = "awg@gmail.c.m";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = false;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testDomainTooLong() {
        String email = "awg@gmail.comp";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = false;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testNoDomain() {
        String email = "awg@gmail.";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = false;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testNoCharsBeforeAt() {
        String email = "@gmail.com";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = false;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testNoCharBetweenAtAndPeriod() {
        String email = "awg@.com";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = false;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testSymbolsInSite() {
        String email = "awg@gma!l.com";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = true;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testDotBeforeAt(){
        String email = "a.wg@gmal.com";
        EmailVerifier myEmailVerifier = new EmailVerifier(email);
        Boolean verified = true;
        assertEquals(verified, myEmailVerifier.verifyEmailString());
    }

    public void testURL(){
        String url = "http://cse.msstate.edu";
        EmailVerifier myEmailVerifier = new EmailVerifier(url);
        assertFalse(myEmailVerifier.verifyEmailString());
    }

    public void testBlankString(){
        String url = "";
        EmailVerifier myEmailVerifier = new EmailVerifier(url);
        assertFalse(myEmailVerifier.verifyEmailString());
    }

    public void testSingleLetterString(){
        String url = "A";
        EmailVerifier myEmailVerifier = new EmailVerifier(url);
        assertFalse(myEmailVerifier.verifyEmailString());
    }

}
