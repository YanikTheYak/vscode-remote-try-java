package com.erwin.interview.palindrome;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    
    @Test
    public void testNegative() {
        assertFalse(PalindromeChecker.isPalindrome("abc"));
    }
    
    @Test
    public void testNegativeWithSpaces() {
        assertFalse(PalindromeChecker.isPalindrome("abc def ghi"));
    }
    
    @Test
    public void testNegativeWithSpacesAndMultipleCases() {
        assertFalse(PalindromeChecker.isPalindrome("able was i never Dave"));
    }
    
    @Test
    public void testEmpty() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }
    
    @Test
    public void testPositiveEven() {
        assertTrue(PalindromeChecker.isPalindrome("abccba"));
    }
    
    @Test
    public void testPositiveOdd() {
        assertTrue(PalindromeChecker.isPalindrome("abcdcba"));
    }
    
    @Test
    public void testPositiveWithSpaces() {
        assertTrue(PalindromeChecker.isPalindrome("never odd or even"));
    }
    
    @Test
    public void testPositiveWithSpacesAndMultipleCases() {
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
    }
    
    @Test
    public void testPositiveNumericEven() {
        assertTrue(PalindromeChecker.isPalindrome("123321"));
    }
    
    @Test
    public void testPositiveNumericOdd() {
        assertTrue(PalindromeChecker.isPalindrome("12321"));
    }
}
