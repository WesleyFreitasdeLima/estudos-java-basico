/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.calculaFatorial;

/**
 *
 * @author wesley
 */
public class Fatorial {

    private int num = 0;
    private int fatorial = 1;
    private String formula = "";

    public void setValor(int n) {
        num = n;
        int fat = 1;
        String s = "";

        for (int i = n; i > 1; i--) {
            fat *= i;
            s += i + " x ";
        }
        s += "1 = ";
        
        fatorial = fat;
        formula = s;
    }

    public int getFatorial() {
        return fatorial;
    }

    public String getFormula() {
        return formula;
    }
}
