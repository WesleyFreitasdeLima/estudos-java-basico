/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasCondicionais;

import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        float n1 = input.nextFloat();
        
        System.out.println("Digite a nota 2:");
        float n2 = input.nextFloat();
        float m = (n1 + n2) / 2;

        System.out.println("Sua média foi " + m);

        if (m > 9) {
            System.out.println("Parabéns!");
        }
    }
}
