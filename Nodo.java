package ProyectoVentanilla;

public class Nodo {
    Object cliente;
    int num;
    Nodo siguiente;
    public Nodo(Object cliente){
        this.cliente=cliente;
        this.siguiente=null;
    }
}
