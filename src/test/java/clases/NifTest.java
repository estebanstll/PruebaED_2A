package clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para la clase Nif.
 */
public class NifTest {

    /**
     * Constructor por defecto de NifTest.
     */
    public NifTest() {
    }

    /**
     * Test para el método calcularLetra.
     * Verifica si el método calcularLetra devuelve la letra esperada para un NIF dado.
     */
    @Test
    public void testCalcularLetra() {
        System.out.println("calcularLetra");
        assertEquals('S', Nif.calcularLetra(16666666));
        assertEquals('Q', Nif.calcularLetra(16666667)); // El resultado esperado debe ser 'Q'
        //assertEquals('W', Nif.calcularLetra(11111111)); // Puedes descomentar esta línea si deseas probar más casos
    }

    /**
     * Test para el método toString.
     * Verifica si el método toString devuelve la representación de cadena esperada para un objeto Nif.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Nif instance = new Nif(16666666);
        assertEquals("16666666-S", instance.toString());
    }

    /**
     * Test para el método equals.
     * Verifica si el método equals compara adecuadamente las instancias de Nif.
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


