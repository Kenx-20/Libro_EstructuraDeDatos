package E8_4;

public class Nodo {
    String dato;
    Nodo enlace;

    public Nodo(String entrada) {
        dato = entrada;
        enlace = this; // se apunta asímismo
    }
}
