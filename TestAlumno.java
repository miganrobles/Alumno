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
        while (index < nombres.size()) {
            alumnos.add(new Alumno(nombres.remove(aleatorio.nextInt(nombres.size())),aleatorio.nextInt(40) + 18));
        }
        for (Alumno alumno : alumnos) {
            for (index = 0; index < 6; index++) {
                alumno.addNota(aleatorio.nextInt(11));
            }
        }
        for (Alumno alumno : alumnos) {
            alumno.muestraDatos();
        }        
    }
}
