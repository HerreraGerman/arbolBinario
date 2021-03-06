package arbolBinario;

public class ArbolBinario{
    protected Nodo raiz;

    public ArbolBinario(){
        raiz = null;
    }

    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
    }

    public Nodo raizArbol(){
        return raiz;
    }

    // Comprueba el estatus del árbol
    boolean esVacio(){
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha){
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
        
    // Recorrido de un árbol binario en preorden
    public static void preorden(Nodo r) {
        if (r != null) {
            r.visitar();
            preorden(r.getIzquierdo());
            preorden(r.getDerecho());
        }
    }

    // Recorrido de un árbol binario en inorden
    public static void inorden(Nodo r) {
        if (r != null) {
            inorden(r.getIzquierdo());
            r.visitar();
            inorden(r.getDerecho());
        }
    }

    // Recorrido de un árbol binario en postorden
    public static void postorden(Nodo r) {
        if (r != null) {
            postorden(r.getIzquierdo());
            postorden(r.getDerecho());
            r.visitar();
        }
    }
    
}