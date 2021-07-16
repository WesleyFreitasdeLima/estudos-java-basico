/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresAritmeticos;

/**
 *
 * @author wesley
 */
public class OperadoresUnarios {

    public static void main(String[] args) {
        int numero = 5;
        
        System.out.println("Numero: " + numero);
        
        numero++;
        System.out.println("Pós-incremento: " + numero);
        
        numero--;
        System.out.println("Pós-decremento: " + numero);
        
        int s1 = 5 + ++numero;
        System.out.println("Pré-incremento: " + s1);
        
        int s2 = 5 + --numero;
        System.out.println("Pré-decremento: " + s2);
      
    }
}
