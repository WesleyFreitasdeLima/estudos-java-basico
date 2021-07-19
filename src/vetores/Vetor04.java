/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author wesley
 */
public class Vetor04 {

    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.print(v);
        }

        int p = Arrays.binarySearch(vet, 1);
        System.out.println("\nEncontrei o valor 1 na posicao " + p);
    }
}
