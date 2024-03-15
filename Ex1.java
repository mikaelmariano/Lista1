// 1.  Escreva  um  algoritmo  que  leia  um  número  digitado  pelo  usuário  e  mostre  a 
// mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número 
// menor ou igual a 10!”, caso este número seja menor ou igual.  

public class Ex1 {
    public static void executar(){

        int numero = Prompt.lerInteiro("Digite o Numero:");

        Prompt.imprimir("Numero: " + numero);
        if (numero > 10) {
            Prompt.imprimir("Número maior do que 10!");
            
        }
        else
        {
            Prompt.imprimir("Número menor ou igual a 10!");
        }


    }


}
