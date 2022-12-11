/*El algoritmo de ordenamiento por inserción es un algoritmo de fácil aplicación que permite el ordenamiento de una lista. Su funcionamiento
consiste en el recorrido por la lista seleccionando en cada iteración un valor como clave y compararlo con el resto insertándolo en el lugar correspondiente.
 */
package Ordenamiento_6;

public class OrdenamientoInsercion2 {

    public static void main(String[] args) {
        int array[] = {10, 9, 8, 5, 4, 3, 2, 14, 26, 47, 36, 32};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        ordInsercion(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void ordInsercion(int[] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {
            /*	 indice j es para explorar la sublista a[i-1]..a[0] buscando la
	 	 posicion correcta del elemento destino*/
            j = i;
            aux = a[i];
            // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {
                // desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }
}
