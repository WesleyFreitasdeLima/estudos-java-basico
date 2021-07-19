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
public class Vetor03 {

    public static void main(String[] args) {
        double v[] = {3.5, 2.7, 9, -4.5};
        Arrays.sort(v);
        for (double valor : v) {
            System.out.println(valor);
        }
    }
}
