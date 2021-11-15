import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CodeupCryptTests {

    @Test public void testIfVersionIsSet() {
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword() {
        String password = "Password";
        String expectedHash = "P4ssw0rd";

        String hashedPassword = CodeupCrypt.hashPassword(password);
        assertEquals(expectedHash, hashedPassword);
        assertEquals("P13", "Pie");
        assertEquals("J9n1t", "JUnit");
    }

    @Test
    public void testCheckPassword() {
        assertTrue("Password ans has are not the same.", CodeupCrypt.checkPassword("Douglas", "D09gl4s"));
    }

}
