// 10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
// o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
// inválido!”. 

public class Ex10 {
    public static void executar(){

        int numero = Prompt.lerInteiro("Digite um numero de 1 a 5: ");

        switch (numero) {
            case 1:
            Prompt.imprimir("UM");
            break;
            
            case 2:
            Prompt.imprimir("Dois");
            break;

            case 3:
            Prompt.imprimir("Três");
            break;

            case 4:
            Prompt.imprimir("Quatro");
            break;

            case 5:
            Prompt.imprimir("Cinco");
            break;
        
            default:

            Prompt.imprimir("Número Invalido.");
                break;
        }


    }
    
}
