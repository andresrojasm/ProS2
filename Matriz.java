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
public class Matriz {

    public NodoFila primerNodo;
    //Se crean los nodos de las filas con las columnas ya llamadas
    public Matriz( int filas, int columnas){
        primerNodo = null;
        crearFilas(filas, columnas);
    }
    //Se asigna el dato del primer nodo en la lista
    public void crearFilas(int cantidadFilas, int cantidadColum){
        
        for(int i=0; i<cantidadFilas; i++){
            //Se crea el primer nodo y se asigna en la lista
            if(primerNodo == null){
                NodoFila nuevo = new NodoFila(cantidadColum);
                primerNodo = nuevo;
            }
            //Si ya existe, solo se asigna en la lista
            else{
                NodoFila nuevo = new NodoFila(cantidadColum);
                NodoFila actual = primerNodo;

                while(actual.siguiente!=null){
                    actual = actual.siguiente;
                }

                actual.siguiente = nuevo;
                nuevo.anterior = actual;
            }
        }
        
    }
    
    public void imprimir(){
        NodoFila actual = primerNodo;
        while(actual!=null){
            actual.columnas.imprimir();
            actual = actual.siguiente;
        }
    }
    
}
