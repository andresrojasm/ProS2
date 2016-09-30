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
//La lista Fila
public class NodoFila {
    //Creacion de datos y referecncias de los nodos fila
    public ListaColumnas columnas;//Lista dentro de la lista como dato
    public NodoFila siguiente;//.next
    public NodoFila anterior;//.previous
    //Asignacion de datos y referencias de los nodos fila 
    public NodoFila(int cantidad){
        siguiente = null;
        anterior = null;
        columnas = new ListaColumnas();
        columnas.crearColumnas(cantidad);
    }
    
    
    
}
