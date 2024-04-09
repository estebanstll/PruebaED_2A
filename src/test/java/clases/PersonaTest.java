package clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class PersonaTest {

    public PersonaTest() {
    }

    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Persona instance = new Persona(12345678);
        assertEquals("12345678-T", instance.getNif().toString());
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        assertEquals("John Doe", instance.getNombre());
    }

    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Persona instance = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        assertEquals('M', instance.getGenero());
    }

    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        LocalDate expectedDate = LocalDate.of(1990, 1, 1);
        Persona instance = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        assertEquals(expectedDate, instance.getNacimiento());
    }

    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona instance = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        assertEquals(34, instance.getEdad());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Persona instance = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        String expectedString = "12345678-T\tJohn\tDoe\t\t34";
        assertEquals(expectedString, instance.toString());
    }

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

