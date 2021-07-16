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
public class OperadoresAtribuicao {

    public static void main(String[] args) {
        int x = 5;
        x += 2;
        System.out.println("5 +2 = " + x);

        int y = 5;
        y *= 2;
        System.out.println("5 * 2 = " + y);
        
        float z = 5;
        z /= 2;
        System.out.println("5 / 2 = " + z);
        
        float w = 5;
        w %= 2;
        System.out.println("5 % 2 = " + w);
    }
}
