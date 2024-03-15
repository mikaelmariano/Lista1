// 3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
// variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
// ao usuário que a sequência de números informados é inválida. 

public class Ex3 {
    public static void executar(){
        int var1 = Prompt.lerInteiro("Digite o primeiro número:");
        int var2 = Prompt.lerInteiro("Digite o segundo número:");

        if (var1 < var2) {
            Prompt.imprimir("O número " + var2 + " é o maior.");
        }
        else if (var2 < var1) {
            Prompt.imprimir("O número " + var1 + " é o maior.");
        }
        else{
            Prompt.imprimir("A sequencia é invalida!");
        }
    }
    
}
