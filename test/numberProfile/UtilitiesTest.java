package numberProfile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilitiesTest {
    Utilities utils;

    @BeforeEach
    public void setUp(){
        utils = new Utilities();
    }

    @Test
    public void testNumberIsEven(){
        assertTrue(utils.isEven(6));
    }

    @Test
    public void testNumberIsOdd(){
        assertTrue(utils.isOdd(5));
    }

    @Test
    public void testForPrimeNumbers(){
        assertTrue(utils.isPrime(7));
    }

    @Test
    public void testToGetFactorsOfANumber(){
        System.out.println(utils.getFactors(6));
    }

    @Test
    public void testForPerfectNumber(){
        assertTrue(utils.isPerfect(6));
    }
    @Test
    public void testForPerfectSquare(){
        assertTrue(utils.isPerfectSquare(16));
    }

    @Test
    public void testForPalindrome(){
        assertTrue(utils.isPalindrome(1114111));
    }

    @Test
    public void testForArmstrong(){
        assertTrue(utils.isArmstrong(153));
    }

    @Test
    public void testToGetFactorial(){
        assertEquals(120, utils.getFactorial(5));
    }

    @Test
    public void testForStrong(){
        assertTrue(utils.isStrong(145));
        assertTrue(utils.isStrong(40585));
    }

    @Test
    public void testForNiven(){
        assertTrue(utils.isNiven(18));
        assertTrue(utils.isNiven(126));
    }

    @Test
    public void testForPerfectCube(){
        assertTrue(utils.isPerfectCube(8));
        assertTrue(utils.isPerfectCube(64));
    }

    @Test
    public void testForBinary(){
        assertEquals("1111", utils.toBinary(15));
        assertEquals("11111111", utils.toBinary(255));
        assertEquals("1010", utils.toBinary(10));
    }

    @Test
    public void testForOctal(){
        assertEquals("12", utils.toOctal(10));
        assertEquals("31", utils.toOctal(25));
    }
}
