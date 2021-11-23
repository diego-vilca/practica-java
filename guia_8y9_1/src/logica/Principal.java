
package logica;

public class Principal {

    
    public static void main(String[] args) {
        Arbol arbol = new Arbol("variedad árbol", "grueso", "marrón", "hoja ancha", "jacarandá", 3, "húmedo");
        Flor flor = new Flor("blancos", 0.2, "verde", "variedad flor", "primavera", "margarita", 0.1, "tropical");
        Arbusto arbusto = new Arbusto(0.5, true, "variedad arbusto", "verdes", true, "ligustro", 1.5, "caluroso");
        
        System.out.println(arbol.hola());
        System.out.println(arbol);
        
        System.out.println(flor.hola());
        System.out.println(flor);
        
        System.out.println(arbusto.hola());
        System.out.println(arbusto);
    }
    
}
