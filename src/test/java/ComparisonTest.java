import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class ComparisonTest{



    @AfterAll
    public static void testEnding(){
        System.out.println("Test is ending ");
    }

    @Test
    public void comparisonTest(){
        int excpected =95;

        Assertions.assertEquals(excpected,Main.comparison(20,5,40,30));
    }


    static Calculator calculator = new Calculator();

    @Test
    public void divide(){
        int a = 100, b = 20;
     int result = calculator.div(a,b);
     int excpected = 5;

     Assertions.assertEquals(excpected,result);
    }

    @Test
    public void recursion(){

        int excpected = 9025;
        int result = Main.recursion(2,95);

        Assertions.assertEquals(excpected,result);

    }

}