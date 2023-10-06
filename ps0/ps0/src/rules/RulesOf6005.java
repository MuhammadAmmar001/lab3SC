/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

/**
 * RulesOf6005 represents the collaboration policy of 6.005 as described by the
 * general information on Stellar.
 */
public class RulesOf6005 {
     
    /**
     * Judge whether a given piece of code may be used in an assignment (problem
     * set or team project) or not, according to the 6.005 collaboration policy.
     * 
     * @param writtenByYourself true if the code in question was written by
     *        yourself or, in the case of a team project, your teammates,
     *        otherwise false.
     * @param availableToOthers if not writtenByYourself, whether or not the
     *        code in question is available to all other students in the class.
     *        Otherwise ignored.
     * @param writtenAsCourseWork if not writtenByYourself, whether or not the
     *        code in question was written specifically as part of a solution to
     *        a 6.005 assignment, in the current or past semesters. Otherwise
     *        ignored.
     * @param citingYourSource if not writtenByYourself, whether or not you
     *        properly cite your source. Otherwise ignored.
     * @param implementationRequired whether the assignment specifically asks
     *        you to implement the feature in question.
     * @return Whether or not, based on the information provided in the
     *         arguments, you are likely to be allowed to use the code in
     *         question in your assignment, according to the 6.005 collaboration
     *         policy for the current semester.
     */
	public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
	        boolean availableToOthers, boolean writtenAsCourseWork,
	        boolean citingYourSource, boolean implementationRequired) {

	    // If you wrote the code yourself, you can use it.
	    if (writtenByYourself) {
	        return true;
	    }
	    
	    // If it's not written by yourself but is available to others, you can't use it.
	    if (availableToOthers) {
	        return false;
	    }
	    
	    // If it's not written by yourself but is written as course work for 6.005,
	    // and you properly cite your source, you can use it.
	    if (writtenAsCourseWork && citingYourSource) {
	        return true;
	    }
	    
	    // If it's not written by yourself but is required for implementation,
	    // you can use it.
	    if (implementationRequired) {
	        return true;
	    }
	    
	    // In all other cases, you can't use it.
	    return false;
	}

    
    /**
     * Main method of the class.
     * 
     * Runs the mayUseCodeInAssignment method.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("The output of the function call is: " +
            RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
    }
}
