/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresLogicosRelacionais;

/**
 *
 * @author wesley
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        int x, y, z;

        x = 4;
        y = 7;
        z = 12;

        boolean r;
        r = (x < y && y < z);
        System.out.println(r);

        r = (x < y && y == z);
        System.out.println(r);

        r = (x < y || y == z);
        System.out.println(r);
        
        r = (x < y ^ y == z);
        System.out.println(r);
        
         r = (x < y ^ y < z);
        System.out.println(r);

    }
}
