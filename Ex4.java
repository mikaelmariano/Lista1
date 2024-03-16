// 4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,
// multiplicação e a divisão dos números lidos. 

public class Ex4 {
    
    public static void executar() {

        int numero1 = Prompt.lerInteiro("Digite o Primeiro Numero:");
        int numero2 = Prompt.lerInteiro("Digite o Segundo Numero:");

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        Prompt.imprimir("A soma de " + numero1 + " + " + numero2 + " é igual a " + soma);
        Prompt.imprimir("A subtracao de " + numero1 + " - " + numero2 + " é igual a " + subtracao);
        Prompt.imprimir("A multiplicacao de " + numero1 + " * " + numero2 + " é igual a " + multiplicacao);
        Prompt.imprimir("A divisão de " + numero1 + " / " + numero2 + " é igual a " + divisao);

        
    }
}
