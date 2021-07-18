/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasRepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author wesley
 */
public class ExercicioRepita {

    public static void main(String[] args) {

        int n;
        int soma = 0;
        int countValores = 0;
        int countPares = 0;
        int countImpares = 0;
        int countAcima100 = 0;
        int media = 0;

        do {
            // Obtém o valor inputado
            String input = telaInput();
            n = Integer.parseInt(input);

            if (n != 0) {
                // Incrementa 1 ao total de valores inputados
                countValores++;

                // Verificar se o numero é par ou impar
                if (isPar(n)) {
                    countPares++;
                } else {
                    countImpares++;
                }

                // Verificar se o numero é maior que 100
                if (isMaiorQue100(n)) {
                    countAcima100++;
                }

                // Soma total
                soma += n;
            }
        } while (n != 0);

        // Obtém a média
        media = calularMedia(soma, countValores);

        // Exibe resultado
        telaResultado(countValores, countPares, countImpares, countAcima100, media, soma);
    }

    private static boolean isPar(int num) {
        boolean resposta = (num % 2 == 0);
        return resposta;
    }

    private static boolean isMaiorQue100(int num) {
        boolean resposta = (num > 100 == true);
        return resposta;
    }

    private static int calularMedia(int valorTotal, int numeroDeValores) {
        int resultado = valorTotal / numeroDeValores;
        return resultado;
    }

    private static String telaInput() {
        return JOptionPane.showInputDialog(
                null, "<html>"
                + "Informe um número:<br>"
                + "<em>"
                + "(valor 0 interrompe)"
                + "</em>"
                + "</html>"
        );
    }

    private static void telaResultado(int countValores, int countPares, int countImpares, int countAcima100, int media, int soma) {
        JOptionPane.showMessageDialog(
                null,
                "<html>"
                + "Resultado final"
                + "<hr>"
                + "<br>Valores inputados:" + countValores
                + "<br>Números pares:" + countPares
                + "<br>Números impares:" + countImpares
                + "<br>Números maiores quem 100:" + countAcima100
                + "<br>Média dos valores:" + media
                + "<br>Soma dos valores:" + soma
                + "</html>"
        );
    }
}
