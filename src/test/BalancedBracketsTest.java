package test;

import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketStringTrue() {
        assertTrue((BalancedBrackets.hasBalancedBrackets("[]LaunchCode")));
    }
    @Test
    public void stringInBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void stringBracketStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void openBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void loneBracketRight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void loneBracketLeft() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void backwardsBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void oopsAllBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }
    @Test
    public void bracketBoysAreBackInTown() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[BRACKET BOYYYYS]]]"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


}
