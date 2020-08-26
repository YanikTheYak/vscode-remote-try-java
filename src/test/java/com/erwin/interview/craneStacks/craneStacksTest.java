package com.erwin.interview.craneStacks;

import org.junit.Test;
import static org.junit.Assert.*;

public class craneStacksTest {
    @Test
    public void SimpleTest() {
        int[] initArray = {3,1,2,2};
        int[] targetArray = {2,2,2,2};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void OneInEach() {
        int[] initArray = {1,0,3,0,0,1,2};
        int[] targetArray = {1,1,1,1,1,1,1};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void SomeOfEach() {
        int[] initArray = {4,2,3,4,3,2};
        int[] targetArray = {3,3,3,3,3,3};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void Offset() {
        int[] initArray = {0,2,1,0,0,1};
        int[] targetArray = {1,1,1,1,0,0};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void SoloBox() {
        int[] initArray = {0,0,0,0,0,1};
        int[] targetArray = {1,0,0,0,0,0};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void TwoOfEach() {
        int[] initArray = {2,2,2,1,3,0,4,2};
        int[] targetArray = {2,2,2,2,2,2,2,2};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void FewStacks() {
        int[] initArray = {2,3,1,2};
        int[] targetArray = {2,2,2,2};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void S101to110() {
        int[] initArray = {1,0,1};
        int[] targetArray = {1,1,0};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void S23to32() {
        int[] initArray = {2,3};
        int[] targetArray = {3,2};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }
    @Test
    public void S200005to211111() {
        int[] initArray = {2,0,0,0,0,5};
        int[] targetArray = {2,1,1,1,1,1};
        assertArrayEquals(targetArray, craneRunner.Run(0, initArray, targetArray, 200));
    }

}