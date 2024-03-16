// 8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este
// número seja maior ou igual a 50, outra se ele for menor que 50. 

public class Ex8 {
    public static void executar(){

        int numero = Prompt.lerInteiro("Digite um numero: ");

        if (numero >= 50){

            Prompt.imprimir("O numero é maior ou igual a 50.");
        }

        else{
            Prompt.imprimir("O numero é menor que 50.");
        }

    }    
}
