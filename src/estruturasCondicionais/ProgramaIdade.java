/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasCondicionais;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Em que ano você nasceu?");
        int anoNascimento = input.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é " + idade);
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
