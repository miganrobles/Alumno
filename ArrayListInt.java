
/**
 * 
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Guarda los elementos de nuestra clase ArrayListInt
    private int[] numeros;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        // initialise instance variables
        numeros = new int[0];
    }

    /**
     * Añade un elemento a la colección al final de la misma.
     */
    public void add(int elemento)
    {
        int numeros2[] = numeros;
        numeros = new int[numeros.length + 1];
        for (int index = 0; index < numeros2.length; index++) {
            numeros[index] = numeros2[index];
        }
        numeros[numeros.length - 1] = elemento;
    }

    /**
     * Añade un elemento a la colección en la posición especificada por el parámetro index. 
     * Si el valor de index no es válido, entonces no hace nada. Los elementos a continuación del añadido se desplazan una posición.
     */
    public void add(int index, int elemento)
    {
        if (index >= 0 && index <= numeros.length) {
            int numeros2[] = numeros;
            numeros = new int[numeros.length + 1];
            int indice1 = 0;
            numeros[index] = elemento;
            for (int indice = 0; indice < numeros.length; indice++) {
                if (!(indice == index)) {
                    numeros[indice] = numeros2[indice1];
                    indice1++;
                }
            }
        }
    }

    /**
     * Vacía la colección
     */
    public void clear()
    {
        numeros = new int[0];
    }

    /**
     * Busca un elemento en nuestra coleccion
     * Devuelve true si la colección contiene ese elemento, false en cualquier otro caso
     */

    public boolean contains(int elemento)
    {
        boolean encontrado = false;
        int index = 0;
        while (index < numeros.length && !encontrado) {
            if (numeros[index] == elemento) {
                encontrado = true;
            }
            index++;
        }
        return encontrado;
    }

    /**
     * Devuelve el elemento existente en la posición indicada. Si el valor de index no es válido, entonces devuelve -1
     */
    public int get(int index) 
    {
        int valor = -1;
        if (index >= 0 && index < numeros.length) {
            valor = numeros[index];
        }
        return valor;
    }

    /**
     * Reemplaza el elemento en la posición index con el valor de element. 
     * Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element)
    {
        if (index >= 0 && index < numeros.length) {
            numeros[index] = element;
        }
    }

    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 
     * en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {
        boolean encontrado = false;
        int index = 0;
        int indice = -1;
        while (index < numeros.length && !encontrado) {
            if (numeros[index] == elemento) {
                encontrado = true;
                indice = index;
            }
            index++;
        }
        return indice;
    }

    /**
     * Devuelve true si la lista no contiene elementos
     */
    public boolean isEmpty()
    {
        return !((size() > 0));
    }

    /**
     * Elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. 
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove (int index)
    {
        int valor = -1;
        if (index >= 0 && index < numeros.length) {
            valor = numeros[index];
            int numeros2[] = numeros;
            int indice1 = 0;
            numeros = new int[numeros.length - 1];
            for (int indice = 0; indice < numeros2.length; indice++) {
                if (!(indice == index)) {
                    numeros[indice1] = numeros2[indice];
                    indice1++;
                }
            }              
        }
        return valor;
    }

    /**
     * Devuelve el número de elementos de la colección
     */
    public int size()
    {
        return numeros.length;
    }
}
