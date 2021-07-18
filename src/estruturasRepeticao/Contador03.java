/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class Contador03 {

    public static void main(String[] args) {
        int n, s = 0;
        Scanner input = new Scanner(System.in);
        String resp;

        do {
            System.out.print("Digite um numero: ");
            n = input.nextInt();
            s += n;

            System.out.print("Deseja continuar? [S/N] ");
            resp = input.next();
        } while (resp.equals("S"));

        System.out.println("A soma de todos os valores é " + s);

    }
}
