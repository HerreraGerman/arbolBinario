package arbolBinario;

public class Nodo{
    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;
    
    public Nodo(Object dato){
        this.dato = dato;
        izdo = dcho = null;
    }
    
    public Nodo(Nodo ramaIzdo, Object dato, Nodo ramaDcho){
        this.dato = dato;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    // Operaciones de acceso
    public Object valorNodo(){ return dato; }
    public Nodo subarbolIzdo(){ return izdo; }
    public Nodo subarbolDcho(){ return dcho; }
    public void nuevoValor(Object d){ dato = d; }
    public void ramaIzdo(Nodo n){ izdo = n; }
    public void ramaDcho(Nodo n){ dcho = n; }
}