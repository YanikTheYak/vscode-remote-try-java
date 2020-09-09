package com.erwin.interview.craneStacks;

/***********************************************************************/
// Goal - Rearrange the boxes to form stacks of equal height
// Rules - A Factory has a robotic arm with a claw to move boxes around.
// The claw can pick up a box from a stack, and place it on another stack.
// The claw can move left or right.
// There are a variable amount of stacks between 2 and 8
// The number of boxes on each stack is provided in an array 'stacks'
// e.g. {3,1,2,2}  would mean :
//   stack 1 has 3 boxes
//   stack 2 has 1 box
//   stack 3 has 2 boxes
//   stack 4 has 2 boxes
// boxInClaw is set to 'true' if there is a box in the claw, or 'false'
// if the claw is empty
// clawPos tells you which stack the claw is positioned above
// lastDirection tells you which direction the crane last moved in
//
// The claw will call the 'calculate' method at the start, and then each
// time you tell it to do something.
// You return a String from the method 'calculate' to tell the claw what to do:
// The requests are:  
//   LEFT    to move left
//   RIGHT   to move right
//   PICK    to pick up a box
//   PLACE   to place a box
//
// The aim is to make all the stacks have an equal number of boxes.
// If this is not possible, the excess boxes should be stored towards the left.
// e.g. 3 stacks with 4 boxes, would leave the stacks as {2,1,1}
//
// You have a maximum of 200 moves (but you do not to make an optimal method)
// You also fail if you tell the claw to do something it can't do
//
// To run the tests you can open the 'craneStacksTest.java' file and click
// 'Run Test' button above the class declaration
// Or use the Terminal and run:
// mvn clean test
// NB: The terminal command will run ALL tests for ALL challenges
/***********************************************************************/

public class craneStacks {
    public static String calculate(int clawPos, int[] stacks, boolean boxInClaw, String lastDirection) {
        // Write your code here

        // Sample debug code       
        System.out.printf("clawPos=%d, stack1=%d, stack2=%d, boxInClaw=%b, lastDirection=%s\n", clawPos, stacks[0], stacks[1], boxInClaw, lastDirection);

        // Sample return, nb: Returning nothing will cause an error
        return "";
    }
}

