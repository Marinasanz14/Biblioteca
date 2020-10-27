/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingclassmatrices;

/**
 *
 * @author marina
 */
public class TestingClassMAtrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassMAtrices Prueba = new ClassMAtrices();
        
        int matriz[][] = new int [2][2];
        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[1][0] = 6;
        matriz[1][1] = 6;
        
        Prueba.ImprimirMatriz(matriz);
    }
    
}
