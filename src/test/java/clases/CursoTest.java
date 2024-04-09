package clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para la clase Curso.
 */
public class CursoTest {

    private Curso instance;

    /**
     * Constructor por defecto de CursoTest.
     */
    public CursoTest() {
    }

    /**
     * Método ejecutado antes de cada prueba para configurar el estado inicial.
     */
    @BeforeEach
    public void setUp() {
        instance = new Curso("Test Curso");
    }

    /**
     * Método ejecutado después de cada prueba para limpiar el estado.
     */
    @AfterEach
    public void tearDown() {
        instance = null;
    }

    /**
     * Test para el método getNombre.
     * Verifica si el método getNombre devuelve el nombre esperado para el curso.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "Test Curso";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test para el método toString.
     * Verifica si el método toString devuelve la representación de cadena esperada para el curso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Curso{nombre=Test Curso}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}



