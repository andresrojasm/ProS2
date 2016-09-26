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

//La clase Main que junta las clases de Filas y Columnas
public class Main {
    
    public static void main(String[] args) {
        
        Matriz matriz = new Matriz(5,3);//<--- Aqui se introduce el N x M
        matriz.imprimir();//Imprime la matriz deseada por listas enlazadas
        
    }
    
}
