package clases;

import java.util.TreeSet;

/**
 * Clase que representa un curso.
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Constructor para crear un curso con un nombre.
     * @param nombre El nombre del curso.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Método para obtener el nombre del curso.
     * @return El nombre del curso.
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Método para añadir un alumno al curso.
     * @param p El alumno a añadir.
     */
    public void añadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }

    /**
     * Método para obtener una representación en cadena del curso.
     * @return Una representación en cadena del curso, incluyendo los alumnos matriculados.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
}

