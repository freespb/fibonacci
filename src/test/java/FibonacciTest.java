import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {


    @org.junit.jupiter.api.Test
    void Test1() {
        Fibonacci f= new Fibonacci();
        // Voy a probar los casos de uso al dar un numero menor que 1
        assertEquals(-1,f.compute(0));

    }
    @Test
    void Test2() {
        Fibonacci f= new Fibonacci();
        // Voy a probar los casos de uso para los elementos 1
        assertEquals(0,f.compute(1));

    }
    @Test
    void Test4() {
        Fibonacci f= new Fibonacci();
        // Voy a probar los casos de uso para los elementos 2
        assertEquals(1,f.compute(2));

    }
    @Test
    void Test5() {
        Fibonacci f= new Fibonacci();
        // Voy a probar los casos de uso para los elementos 3
        assertEquals(1,f.compute(3));

    }
    @Test
    void Test6() {
        Fibonacci f= new Fibonacci();
        // Voy a probar los casos de uso para los elementos 4
        assertEquals(2,f.compute(4));

    }
    @Test
    void Test7() {
        Fibonacci f= new Fibonacci();
        // Voy a probar los casos de uso para los elementos 5
        assertEquals(3,f.compute(5));

    }
    @Test
    void Test8() {
        Fibonacci f= new Fibonacci();
        // Voy a probar los casos de uso para los elementos 6

        assertEquals(5,f.compute(6));
    }
}