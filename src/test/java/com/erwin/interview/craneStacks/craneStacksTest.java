package com.erwin.interview.craneStacks;

import org.junit.Test;
import static org.junit.Assert.*;

public class craneStacksTest {
    @Test
    public void SimpleTest() {
        int[] initArray = {3,1,2,2};
        int[] targetArray = {2,2,2,2};
        System.out.println("Start SimpleTest");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void OneInEach() {
        int[] initArray = {1,0,3,0,0,1,2};
        int[] targetArray = {1,1,1,1,1,1,1};
        System.out.println("Start OneInEach");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void SomeOfEach() {
        int[] initArray = {4,2,3,4,3,2};
        int[] targetArray = {3,3,3,3,3,3};
        System.out.println("Start SomeOfEach");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void Offset() {
        int[] initArray = {0,2,1,0,0,1};
        int[] targetArray = {1,1,1,1,0,0};
        System.out.println("Start Offset");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void SoloBox() {
        int[] initArray = {0,0,0,0,0,1};
        int[] targetArray = {1,0,0,0,0,0};
        System.out.println("Start SoloBox");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void TwoOfEach() {
        int[] initArray = {2,2,2,1,3,0,4,2};
        int[] targetArray = {2,2,2,2,2,2,2,2};
        System.out.println("Start TwoOfEach");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void FewStacks() {
        int[] initArray = {2,3,1,2};
        int[] targetArray = {2,2,2,2};
        System.out.println("Start FewStacks");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void S101to110() {
        int[] initArray = {1,0,1};
        int[] targetArray = {1,1,0};
        System.out.println("Start S101to110");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void S23to32() {
        int[] initArray = {2,3};
        int[] targetArray = {3,2};
        System.out.println("Start S23to32");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void S200005to211111() {
        int[] initArray = {2,0,0,0,0,5};
        int[] targetArray = {2,1,1,1,1,1};
        System.out.println("Start S200005to211111");
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }

}