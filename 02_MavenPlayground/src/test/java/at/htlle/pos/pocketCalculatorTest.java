package at.htlle.pos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pocketCalculatorTest {

    @Test
    void testadditionWithTwoPositiveNumbers() {
        //setup
        final int expected = 3;

        //exercise
        long result = pocketCalculator.addition(1,2);

        //verify
        assertEquals(3,pocketCalculator.addition(1,2));

        //teardwon

    }

    @Test
    void testadditionWithMAxINT() {
        //setup
        final long expected = 2147483648L;

        //exercise
        long result = pocketCalculator.addition(Integer.MAX_VALUE,1);

        //verify
        assertEquals(expected,result);

        //teardwon



    }

    @Test
    void testadditionWithNegativeNumb() {
        //setup
        final long expected = 1;

        //exercise
        long result = pocketCalculator.addition(-1,2);

        //verify
        assertEquals(expected,result);
    }

    @Test
    void testadditionWith0Test() {
        //setup

    }





}