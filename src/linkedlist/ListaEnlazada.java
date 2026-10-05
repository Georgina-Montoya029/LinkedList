
package linkedlist;


public class ListaEnlazada <T> implements IList<T>, Iterable<T>{
    protected NodoSimple<T> inicio;
    protected int nElementos;
    
    private class NodoSimple<T>{
        private T dato;
        private NodoSimple<T> sig;
            
        public NodoSimple(T dato){
            this.dato= dato; 
                    
        } 
    }
    
    public ListaEnlazada(){
        inicio = null;
        nElementos = 0;
    }

    @Override
    public void append(T elemento) throws ListException {
        NodoSimple<T>  nodoNuevo= new NodoSimple<> (elemento);
        NodoSimple<T> nodo = inicio;
        
        if(nodo == null){
          inicio = nodoNuevo;   
        }else{
            while(nodo.sig != null){
                nodo = nodo.sig;
            }
            nodo.sig = nodoNuevo;
                    
        }
        nElementos++;
    }

    @Override
    public void insert(T elemento, int index) throws ListException {
        if (index < 0 || index > nElementos){
            throw new ListException();
        }
        NodoSimple<T> nodoNuevo = new NodoSimple<>(elemento);
        
        if (index == 0){
            nodoNuevo.sig = inicio;
            inicio = nodoNuevo;
        }else {
            NodoSimple<T> actual = inicio;
            for (int i =0; i < index - 1; i++){
                actual = actual.sig;
            }
           
        }
         nElementos++;
    }

    @Override
    public T remove(int index) throws ListException {
        if (index < 0 || index >= nElementos){
            throw new ListException();
        }
        T datoEliminado;
        
        if (index ==0){
            datoEliminado= inicio.dato;
            inicio = inicio.sig;
        }else {
            NodoSimple<T> actual = inicio;
            for (int i = 0;i < index -1; i++){
                actual= actual.sig;
            }
            datoEliminado= actual.sig.dato;
            actual.sig= actual.sig.sig;
        }
        nElementos--;
        return datoEliminado;
    }

    @Override
    public boolean removeObj(T elemento) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int indexOf(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T get(int index) throws ListException {
        if (index <0 || index >= nElementos){
            throw new ListException();
        }
        NodoSimple<T> actual = inicio;
        for (int i = 0; i < index; i++){
            actual= actual.sig;
        }
        return actual.dato;
    }

    @Override
    public void set(T elemento, int index) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        inicio= null;
        nElementos=0;
                
    }

    @Override
    public boolean empty() {
        return nElementos == 0;
    }

    @Override
    public int size() {
        return nElementos;
    }

    @Override
    public java.util.Iterator<T> Iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public java.util.Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
