package E8_4;

public class ListaCircular {

    private Nodo lc;

    public ListaCircular() {
        lc = null;
    }

    public ListaCircular insertar(String entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (lc != null) { // lista circular no vacía
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
        return this;
    }

    public void eliminar(String entrada) {
        Nodo actual;
        actual = lc;
        while ((actual.enlace != lc)
                && !(actual.enlace.dato.equals(entrada))) {
            if (!actual.enlace.dato.equals(entrada)) {
                actual = actual.enlace;
            }
        }

        // Enlace de nodo anterior con el siguiente
        // si se ha encontrado el nodo.
        if (actual.enlace.dato.equals(entrada)) {
            Nodo p;
            p = actual.enlace; // Nodo a eliminar
            if (lc == lc.enlace) // Lista con un solo nodo
            {
                lc = null;
            } else {
                if (p == lc) {
                    lc = actual; // Se borra el elemento referenciado por lc,
                    // el nuevo acceso a la lista es el anterior
                }
                actual.enlace = p.enlace;
            }
            p = null;
        }
    }

    public void borrarLista() {
        Nodo p;
        if (lc != null) {
            p = lc;
            do {
                Nodo t;
                t = p;
                p = p.enlace;
                t = null; // no es estrictamente necesario
            } while (p != lc);
        } else {
            System.out.println("\n\t Lista vacía.");
        }
        lc = null;
    }

    public void recorrer() {
        Nodo p;
        if (lc != null) {
            p = lc.enlace; // siguiente nodo al de acceso
            do {
                System.out.println("\t" + p.dato);
                p = p.enlace;
            } while (p != lc.enlace);
        } else {
            System.out.println("\t Lista Circular vacía.");
        }
    }
}
