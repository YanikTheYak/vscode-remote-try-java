package com.erwin.interview.craneStacks;

import java.util.Arrays;

public class craneRunner {
      /* Ignore and do not change the code below */
    public static int[] Run(int startPos, int stacks[], int targetStacks[], int maxSteps) {
        // game loop
        int looping = 1;
        int clawPos = startPos;
        String lastDirection = "";
        boolean boxInClaw = false;

        while (looping <= maxSteps) {

            String action = craneStacks.calculate(clawPos, stacks, boxInClaw, lastDirection);
            switch (action) {
                case "LEFT": {
                    lastDirection = action;
                    if (clawPos == 0)
                        throw new UnsupportedOperationException("CAN'T GO LEFT");
                    clawPos--;
                    break;
                }
                case "RIGHT": {
                    lastDirection = action;
                    if (clawPos == stacks.length - 1)
                        throw new UnsupportedOperationException("CAN'T GO RIGHT");
                    clawPos++;
                    break;
                }
                case "PICK": {
                    if (boxInClaw)
                        throw new UnsupportedOperationException("CLAW ALREADY FULL");
                    if (stacks[clawPos] == 0)
                        throw new UnsupportedOperationException("NO BOX TO PICK");
                    stacks[clawPos]--;
                    boxInClaw = true;
                    break;
                }
                case "PLACE": {
                    if (!boxInClaw)
                        throw new UnsupportedOperationException("CLAW IS EMPTY");
                    stacks[clawPos]++;
                    boxInClaw = false;
                    break;
                }
                default: {
                    throw new UnsupportedOperationException("INVALID COMMAND");
                }
            }

            if (Arrays.equals(stacks, targetStacks))
                break;
            
            looping++;
        }
        if (looping >= 200)
            throw new UnsupportedOperationException("TOO MANY STEPS TAKEN");
        return stacks;
    }
}