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
public class OperadoresMath {

    public static void main(String[] args) {
        float v = 8.3f;
        int ab = (int) Math.floor(v);
        System.out.println("8.3 arredondado pra baixo: " + ab);

        int ac = (int) Math.ceil(v);
        System.out.println("8.3 arredondado pra cima: " + ac);

        int ar = (int) Math.round(v);
        System.out.println("8.3 arredondado: " + ar);

        double rand = Math.random();
        System.out.println("Numero aleatorio: " + rand);

        int rand2 = (int) (5 + Math.random() * (10 - 5));
        System.out.println("Numero aleatorio entre 5 e 10: " + rand2);
    }
}
