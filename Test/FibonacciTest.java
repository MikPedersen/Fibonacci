import junit.framework.TestCase;

public class FibonacciTest extends TestCase {
    public void testFibonacci(){
        long resultat;
        /*Test 1
        input = 5
        forventet input == 15
         */
        resultat = Fibonacci.udregning(5);
        assertEquals(15,resultat);

        /*Test 2
        input = -8
        forventet input == -36*/
        resultat = Fibonacci.udregning(-8);
        assertEquals(-35,resultat);

        /*Test 3
        input = 120
        forventet input == 15*/
        resultat = Fibonacci.udregning(120);
        assertEquals(7260,resultat);
        /* Test 4
        input = 0
        forventet input == 0*/
        resultat = Fibonacci.udregning(0);
        assertEquals(0,resultat);
    }
}