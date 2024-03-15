// 2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
// resultado da sua soma. 

public class Ex2 {
    public static void executar(){
        int numero1 = Prompt.lerInteiro("Digite o 1º Número:");
        int numero2 = Prompt.lerInteiro("Digite o 2º Número:");


        Prompt.imprimir("A soma é igual a: " + (numero1+numero2));

        
    }
}
