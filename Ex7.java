// 7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
// este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
// o usuário também deverá ser informado. 

public class Ex7 {
    public static void executar() {
        
        int numero = Prompt.lerInteiro("Digite o numero:");

        if ( numero >= 100 && numero <= 200 ){
            Prompt.imprimir("O numero " + numero + " está no intervalo de 100 a 200.");

        }
        else    {
            Prompt.imprimir("O numero " + numero + " está fora do intervalo de 100 a 200.");
        }
        
    }    
}
