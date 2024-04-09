package clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NifTest {

    public NifTest() {
    }

    /**
     * Test para calcularLetra
     */
    @Test
    public void testCalcularLetra() {
        System.out.println("calcularLetra");
        assertEquals('S', Nif.calcularLetra(16666666));
        assertEquals('Q', Nif.calcularLetra(16666667));
//        assertEquals('W', Nif.calcularLetra(11111111));
    }

    /**
     * Test para el metodo toString
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Nif instance = new Nif(16666666);
        assertEquals("16666666-S", instance.toString());
    }

    /**
     * Test para e metodo equals
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Nif instance1 = new Nif(12345678);
        Nif instance2 = new Nif(12345678);
        Nif instance3 = new Nif(87654321);
        assertTrue(instance1.equals(instance2));
        assertFalse(instance1.equals(instance3));
    }
}

