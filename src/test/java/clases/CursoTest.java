package clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {
    
    private Curso instance;  
    
    public CursoTest() {
    }
    
    @BeforeEach
    public void setUp() {
        instance = new Curso("Test Curso");  
    }
     
    public void tearDown() {
        instance = null; 
    }

    /**
     * Test
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "Test Curso";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Curso{nombre=Test Curso}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}


