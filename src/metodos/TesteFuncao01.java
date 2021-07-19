/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author wesley
 */
public class TesteFuncao01 {

    static void showMsg(int resultado) {
        System.out.println("A soma deu " + resultado);
    }

    static int soma(int a, int b) {
        int soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        int s = soma(5, 2);
        showMsg(s);
    }
}
