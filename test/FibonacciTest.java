import junit.framework.TestCase;

public class FibonacciTest extends TestCase {

    public void testCalculateResult(){
    long resultat;

        //Test med helt tal
        resultat = Fibonacci.calculateResult(5);
        assertEquals(15, resultat);

        //Test med negativt tal
        resultat = Fibonacci.calculateResult(-5);
        assertEquals(-15, resultat);

        //Test med ugyldigt tal (-1 betyder fejl i programmet)
        resultat = Fibonacci.calculateResult(2.5);
        assertEquals(-1, resultat);

        //Test med 0
        resultat = Fibonacci.calculateResult(0);
        assertEquals(0, resultat);

        //Test med stort tal
        resultat = Fibonacci.calculateResult(92);
        assertEquals(7540113804746346429l, resultat);

    }
}