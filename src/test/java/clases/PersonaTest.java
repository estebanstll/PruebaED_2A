package clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

/**
 * Clase de pruebas para la clase Persona.
 */
public class PersonaTest {

    /**
     * Constructor por defecto de PersonaTest.
     */
    public PersonaTest() {
    }

    /**
     * Prueba para el método getNif().
     * Verifica si el método getNif() devuelve el NIF esperado.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Persona instance = new Persona(12345678);
        assertEquals("12345678-Z", instance.getNif().toString());
    }

    /**
     * Prueba para el método getNombre().
     * Verifica si el método getNombre() devuelve el nombre esperado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona(12345678, "Pablo Doe", 'M', 1, 1, 1990);
        assertEquals("Pablo Doe", instance.getNombre());
    }

    /**
     * Prueba para el método getGenero().
     * Verifica si el método getGenero() devuelve el género esperado.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Persona instance = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        assertEquals('M', instance.getGenero());
    }

    /**
     * Prueba para el método getNacimiento().
     * Verifica si el método getNacimiento() devuelve la fecha de nacimiento esperada.
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        LocalDate expectedDate = LocalDate.of(1990, 1, 1);
        Persona instance = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        assertEquals(expectedDate, instance.getNacimiento());
    }

    /**
     * Prueba para el método getEdad().
     * Verifica si el método getEdad() devuelve la edad esperada.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona instance = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        assertEquals(34, instance.getEdad());
    }

    /**
     * Prueba para el método equals().
     * Verifica si el método equals() compara adecuadamente las instancias de Persona.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Persona instance1 = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        Persona instance2 = new Persona(12345678, "Jane Doe", 'F', 1, 1, 1990);
        Persona instance3 = new Persona(87654321, "Jane Doe", 'F', 1, 1, 1990);
        assertTrue(instance1.equals(instance2));
        assertFalse(instance1.equals(instance3));
    }
}
