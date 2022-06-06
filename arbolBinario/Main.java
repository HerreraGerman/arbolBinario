package arbolBinario;

public class Main {

    public static void main(String[] args) {

        ArbolBinario arbol;
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();

        a1 = ArbolBinario.nuevoArbol(null, new Auto("Ford", "Ka", 2002), null);
        a2 = ArbolBinario.nuevoArbol(null, new Auto("Volkswagen", "Gol Trend", 2017), null);
        a = ArbolBinario.nuevoArbol(a1, new Auto("Fiat", "147", 1996), a2);

        pila.insertar(a);

        a1 = ArbolBinario.nuevoArbol(null, new Auto("Volkswagen", "Vento", 2022), null);
        a2 = ArbolBinario.nuevoArbol(null, new Auto("Ford", "F150", 1998), null);
        a = ArbolBinario.nuevoArbol(a1, new Auto("Ford", "Ka", 2010), a2);
        
        pila.insertar(a);

        a2 = (Nodo) pila.quitar();
        a1 = (Nodo) pila.quitar();
        a = ArbolBinario.nuevoArbol(a1, new Auto("Volkswagen", "Gol G3", 2005),a2);
        arbol = new ArbolBinario(a);
    }
    
}
