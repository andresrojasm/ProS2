/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author Carlos Alberto
 */
//Se crea almacen de datos en las columnas
public class ListaColumnas {
    
    public NodoColumna primerNodo;
    
    //Se crea los datos del primer nodo
    public ListaColumnas(){
        primerNodo = null;
    }
    //Se pone la cantidad de nodos con los que se desea realizar la columna
    public void crearColumnas(int cantidad){
        
        for(int i=0; i<cantidad ; i++){
            //Si no existe un nodo, se crea uno y se almacena en la lista
            if(primerNodo == null){
                NodoColumna nuevo = new NodoColumna(0);
                primerNodo = nuevo;
            }
            //Si ya existe el nodo, se almacena en la lista
            else{
                NodoColumna nuevo = new NodoColumna(0);
                NodoColumna actual = primerNodo;

                while(actual.siguiente!=null){
                    actual = actual.siguiente;
                }

                actual.siguiente = nuevo;
                nuevo.anterior = actual;
            }
        }
        
    }
    public void imprimir(){
        
        NodoColumna actual = primerNodo;
        while(actual!=null){
            System.out.print(actual.dato+" ");
            actual = actual.siguiente;
        }
        System.out.print("\n");
    }
    
}
