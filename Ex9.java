// 9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
// diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
// Caso sejam diferentes, informe que são diferentes e qual número é o maior. 

public class Ex9 {
    public static void executar(){

        int numero1 = Prompt.lerInteiro("Digite o primeiro numero:");
        int numero2 = Prompt.lerInteiro("Digite o segundo numero:");

        if (numero1 != numero2){
            int maior = Math.max(numero1, numero2);
            Prompt.imprimir("O maior valor é o " + maior);
        }

        else{
            Prompt.imprimir("Os numeros são iguais");
        }

    }
    
}
