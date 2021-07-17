/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresLogicosRelacionais;

/**
 *
 * @author wesley
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Wesley";
        String nome2 = new String("Wesley");
        String res;
        res = (nome1.equals(nome2)) ? "Igual" : "Diferente";
        
        System.out.println(res);
    }
}
