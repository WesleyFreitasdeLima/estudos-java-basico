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
public class Vetor05 {

    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);

        for (int val : v) {
            System.out.print(val + " ");
        }
    }
}
