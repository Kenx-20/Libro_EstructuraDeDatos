/*El ordenamiento por intercambio o bubble sort funciona de la siguiente manera: En relación a
lo anterior, podemos decir que el algoritmo bubble sort consiste en comparar pares de elementos 
adyacentes e intercambiarlos entre sí hasta que estén todos ordenados; este método también es conocido como intercambio directo.
 */
package Ordenamiento_6;

public class OrdenamientoIntercambio2 {

    public static void main(String[] args) {
        int array[] = {3, 6, 5, 8, 9, 374, 238, 546, 2, 1, 49, 473, 349};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        ordIntercambio(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public static void ordIntercambio(int a[]) {
        int i, j;
        for (i = 0; i < a.length - 1; i++) // sitúa mínimo de a[i+1]...a[n-1] en a[i]
        {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    intercambiar(a, i, j);
                }
            }
        }
    }
}
