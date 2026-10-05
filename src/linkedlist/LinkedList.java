
package linkedlist;


public class LinkedList {

    
    public static void main(String[] args) {
        try {
            ListaEnlazada<String> lista = new ListaEnlazada<>();
            
            lista.append("Manzana");
            lista.append("Pera");
            lista.append("Uva");

            System.out.println("Tamaño de la lista: " + lista.size());
            System.out.println("Elemento 0: " + lista.get(0));
            System.out.println("Elemento 1: " + lista.get(1));
            System.out.println("Elemento 2: " + lista.get(2));
            
        } catch (ListException e) {
            System.out.println("Error en la lista.");
        }
    }
    
}
