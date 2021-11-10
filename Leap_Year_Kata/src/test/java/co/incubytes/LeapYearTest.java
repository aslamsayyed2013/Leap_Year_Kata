package co.incubytes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {
    @Test
    void leapYear1(){
        assertEquals("Leap Year 2000",LeapYear.check("2000"));
        // assertEquals(0,Calculator.add(""));
    }
    @Test
    void leapYear2(){
        assertEquals("Not Leap Year 1700,1800,1900",LeapYear.check("1700,1800,1900"));
        // assertEquals(0,Calculator.add(""));
    }
    @Test
    void leapYear3(){
        assertEquals("Leap Year 2008,2012,2016",LeapYear.check("2008,2012,2016"));
        // assertEquals(0,Calculator.add(""));
    }
    @Test
    void leapYear4(){
        assertEquals("Not Leap Year 2017,2018,2019",LeapYear.check("2017,2018,2019"));
        // assertEquals(0,Calculator.add(""));
    }


/*
    @Test
        void leapYear(){
        assertEquals(1,LeapYear.check(2000));
       // assertEquals(0,Calculator.add(""));
    }
    @Test
    void nonLeapYear(){
        assertEquals(0,LeapYear.check(1700));
    }

    @Test
    void leapYearBy4NotBy100(){
        assertEquals(1,LeapYear.check(2008));
    }
    @Test
    void nonLeapYearBy4(){
        assertEquals(0,LeapYear.check(2017));
    }
 */
}
