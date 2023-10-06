/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
        assertTrue("Test Case 1: You wrote the code yourself, it's not available to others, and it's not for implementation",
                RulesOf6005.mayUseCodeInAssignment(true, false, false, false, false));

            assertFalse("Test Case 2: You didn't write the code yourself, it's available to others, and it's not for implementation",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));

            assertTrue("Test Case 3: You didn't write the code yourself, it's available to others, but you properly cite your source",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, true, false));

            assertTrue("Test Case 4: You didn't write the code yourself, it's required for implementation",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, false, true));
    }
}
