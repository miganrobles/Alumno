
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // nombre del alumno
    private String nombre;
    // edad del alumno
    private int edad;
    // numero de clase
    private int numeroId;
    // asigna numero de alumno
    private static int numeroAlumno = 1;
    // nota minima para aprobar
    public static final int NOTA_MINIMA_APROBADO = 5;
    // notas del alumno
    private ArrayListInt notas;
    
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numeroId = numeroAlumno;
        numeroAlumno++;
        notas = new ArrayListInt();
    }
}