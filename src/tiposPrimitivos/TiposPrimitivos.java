package tiposPrimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite a nota do aluno: ");
        float nota = entrada.nextFloat();
        
        System.out.println("Digite a idade do aluno: ");
        int idade = entrada.nextInt();
        String idadeStr = Integer.toString(idade);
        
        System.out.format("A nota de %s (%s anos) é %.1f \n", nome, idadeStr, nota);
    }
}
