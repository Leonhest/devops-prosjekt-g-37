import org.junit.Test;
import resources.CalculatorResource;

import static org.junit.Assert.assertEquals;

public class CalculatorResourceTest{

    @Test
    public void testCalculate(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = " 100 + 300 ";
        assertEquals("400", calculatorResource.calculate(expression));

        expression = " 300 - 99 ";
        assertEquals("201", calculatorResource.calculate(expression));

        expression = " 300 * 2 ";
        assertEquals("600", calculatorResource.calculate(expression));

        expression = " 300 / 2 ";
        assertEquals("150", calculatorResource.calculate(expression));

        expression = " 1 + 1 + 1 ";
        assertEquals("3", calculatorResource.calculate(expression));

        expression = " 3 - 1 - 1";
        assertEquals("1", calculatorResource.calculate(expression));

        expression = " 2 * 2 * 2 ";
        assertEquals("8", calculatorResource.calculate(expression));

        expression = " 8 / 2 / 2 ";
        assertEquals("2", calculatorResource.calculate(expression));
    }

    @Test
    public void testSum(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "100+300";
        assertEquals(400, calculatorResource.sum(expression));

        expression = "300+99";
        assertEquals(399, calculatorResource.sum(expression));

        expression = "1+1+1";
        assertEquals(3, calculatorResource.sum(expression));
    }

    @Test
    public void testSubtraction(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "999-100";
        assertEquals(899, calculatorResource.subtraction(expression));

        expression = "20-2";
        assertEquals(18, calculatorResource.subtraction(expression));

        expression = "10-2-2";
        assertEquals(6, calculatorResource.subtraction(expression));
    }

    @Test
    public void testDivision(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "100/10";
        assertEquals(10, calculatorResource.division(expression));

        expression = "300/3";
        assertEquals(100, calculatorResource.division(expression));

        expression = "300/3/2";
        assertEquals(50, calculatorResource.division(expression));
    }

    @Test
    public void testMultiplication(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "2*2";
        assertEquals(4, calculatorResource.multiplication(expression));

        expression = "3*3";
        assertEquals(9, calculatorResource.multiplication(expression));

        expression = "3*3*3";
        assertEquals(27, calculatorResource.multiplication(expression));
    }

}
