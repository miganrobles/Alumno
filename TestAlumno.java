import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class TestArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAlumno
{
    /**
     * Constructor for objects of class TestArrayListInt
     */
    public TestAlumno()
    {   
        Random aleatorio = new Random();
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Luis González");
        nombres.add("Roberto Merino");
        nombres.add("José Fernández");
        nombres.add("Antonio Gutiérrez");
        nombres.add("Ana Alonso");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        int index = 0;
        final int NUMERO_DE_NOTAS = 6;
        final int NOTA_MAXIMA = 11; // Al coger un valor aleatorio la nota maxima queda en 10
        final int EDAD_MINIMA = 18;
        final int EDAD_MAXIMA = 43; // Mas la EDAD_MINIMA lo que quedará una edad máxima de 60 como edad máxima
        while (index < nombres.size()) {
            alumnos.add(new Alumno(nombres.remove(aleatorio.nextInt(nombres.size())),aleatorio.nextInt(EDAD_MAXIMA) + EDAD_MINIMA));
        }
        for (Alumno alumno : alumnos) {
            for (index = 0; index < NUMERO_DE_NOTAS; index++) {
                alumno.addNota(aleatorio.nextInt(NOTA_MAXIMA));
            }
        }
        for (Alumno alumno : alumnos) {
            alumno.muestraDatos();
            System.out.println("===========================================");
            System.out.println("===========================================");
            System.out.println();
            System.out.println();
        }        
    }
}
