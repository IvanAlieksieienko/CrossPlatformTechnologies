import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
	public CalculatorTest() { }
    /**
     * Test of DynamicSignalDiapason method, of class Calculator.
     */
    @Test
    public void testDynamicSignalDiapason() {
        System.out.print("\nDynamicSignalDiapason - \t");
        byte[] signalCounts = new byte[]{30, 127};
        Byte[] signals = new Byte[signalCounts.length];
        for (int i = 0; i < signalCounts.length; i++) {
            signals[i] = Byte.valueOf(signalCounts[i]);
        }
        Calculator instance = new Calculator(signals);
        int expResult = 97;
        int result = instance.DynamicSignalDiapason();
        assertEquals(expResult, result);
        System.out.print("successful");
    }
    /**
     * Test of energy method, of class Calculator.
     */
    @Test
    public void testEnergy() {
        System.out.print("\nEnergy - \t\t\t");
        byte[] signalCounts = new byte[]{100, 20};
        Byte[] signals = new Byte[signalCounts.length];
        for (int i = 0; i < signalCounts.length; i++) {
            signals[i] = Byte.valueOf(signalCounts[i]);
        }
        Calculator instance = new Calculator(signals);
        double expResult = 10400.00;
        double result = instance.Energy();
        assertEquals(expResult, result, 0.0);
        System.out.print("successful");
    }
    /**
     * Test of AverageSignalPower method, of class Calculator.
     */
    @Test
    public void testAveragePower() {
        System.out.print("\nAverageSignalPower - \t\t");
        byte[] signalCounts = new byte[]{100, 20};
        Byte[] signals = new Byte[signalCounts.length];
        for (int i = 0; i < signalCounts.length; i++) {
            signals[i] = Byte.valueOf(signalCounts[i]);
        }
        Double energy = 10400.00;
        Calculator instance = new Calculator(signals);
        Double expResult = 5200.00;
        Double result = (instance.AverageSignalPower.apply(Double.valueOf(energy))).doubleValue();
        assertEquals(expResult, result, 0.0);
        System.out.print("successful");
    }
    /**
     * Test of AverageSignalResponses method, of class Calculator.
     */
    @Test
    public void testAverageSignalResponses() {
        System.out.print("\nAverageSignalResponses - \t");
        byte[] signalCounts = new byte[]{100, 20};
        Byte[] signals = new Byte[signalCounts.length];
        for (int i = 0; i < signalCounts.length; i++) {
            signals[i] = Byte.valueOf(signalCounts[i]);
        }
        Calculator instance = new Calculator(signals);
        double expResult = 60;
        double result = instance.AverageSignalResponses();
        assertEquals(expResult, result, 0.0);
        System.out.print("successful");
    }
    /**
     * Test of ResponsesValueDispersion method, of class Calculator.
     */
    @Test
    public void testResponsesValueDispersion() {
        System.out.print("\nResponsesValueDispersion - \t");
        byte[] signalCounts = new byte[]{100, 20};
        Byte[] signals = new Byte[signalCounts.length];
        for (int i = 0; i < signalCounts.length; i++) {
            signals[i] = Byte.valueOf(signalCounts[i]);
        }
        double averageSignalCountValue = 60;
        Calculator instance = new Calculator(signals);
        double expResult = 1600;
        double result = instance.ResponsesValueDispersion(averageSignalCountValue);
        assertEquals(expResult, result, 0.0);
        System.out.print("successful");
    }
}