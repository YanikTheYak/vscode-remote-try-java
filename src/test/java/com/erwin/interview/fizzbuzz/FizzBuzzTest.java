package com.erwin.interview.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    
    @Test
    public void test1() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }
    
    @Test
    public void test3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }
    
    @Test
    public void test5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }
    
    @Test
    public void test8() {
        assertEquals("8", FizzBuzz.fizzBuzz(8));
    }
    
    @Test
    public void test9() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }
    
    @Test
    public void test10() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }
    
    @Test
    public void test15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
    
    @Test
    public void test17() {
        assertEquals("17", FizzBuzz.fizzBuzz(17));
    }
    
    @Test
    public void test90() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(90));
    }
    
    @Test
    public void tes98() {
        assertEquals("98", FizzBuzz.fizzBuzz(98));
    }
    
    @Test
    public void test99() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(99));
    }
    
    @Test
    public void test100() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(100));
    }
}
