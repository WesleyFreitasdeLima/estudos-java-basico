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
public class ProgramaCopasMundo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas Copas do Mundo?");
        int numPernas = input.nextInt();

        String tipo;
        switch (numPernas) {
            case 1:
                tipo = "Campeão";
                break;
            case 2:
                tipo = "Bi-campeão";
                break;
            case 3:
                tipo = "Tri-campeão";
                break;
            case 4:
                tipo = "Tetra-camepão";
                break;
            case 5:
                tipo = "Penta-campeão";
                break;
            default:
                tipo = "Desconhecido";
                break;
        }
        System.out.println(tipo);

    }
}
