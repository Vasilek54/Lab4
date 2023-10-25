import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithSimpleWord() {
        assertTrue(PalindromeChecker.isPalindrome("Racecar"));
    }

    @Test
    public void testIsPalindromeWithNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("Hello"));
    }

    @Test
    public void testIsPalindromeWithSentence() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testIsPalindromeWithSpaces() {
        assertTrue(PalindromeChecker.isPalindrome("race car"));
    }
}
