
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

    /**
     * Permite introducir una nota entera del alumno.
     */
    public void addNota(int nota)
    {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        }
        else {
            System.out.println("El valor de la nota no es válido [entre 0-10]");
        }
    }

    /**
     * Permite conocer la nota media (en decimal) del alumno en este momento.
     */
    public float notaMedia()
    {
        float notaMediaAlumno = 0;
        int numeroNotas = notas.size();
        if (numeroNotas > 0) {
            for (int index = 0; index < numeroNotas; index++) {
                notaMediaAlumno += notas.get(index);
            }
            notaMediaAlumno /= numeroNotas;
        }
        return notaMediaAlumno;
    }
    
    /**
     * Indica si el alumno esta aprobado o no en función de su nota media actual.
     */
    public boolean aprobado()
    {
        return notaMedia() >= NOTA_MINIMA_APROBADO;
    }
}