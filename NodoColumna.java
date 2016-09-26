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
//La lista columna
public class NodoColumna {
    //Creacion de datos y referecncias de los nodos columna
    public int dato;//Dato
    public NodoColumna siguiente;//.next
    public NodoColumna anterior;//.previous
    //Asignacion de datos y referencias de los nodos columna
    public NodoColumna(int pDato){
        siguiente = null;
        anterior = null;
        dato = pDato;
    }
    //Dato de los nodos Columna
    public void insertarDato(int numero){
        dato = numero;
    }
    
}
