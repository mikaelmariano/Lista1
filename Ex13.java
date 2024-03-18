// 13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
// operador em outra variável do tipo CARACTERE. Imprima o resultado da operação
// de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma
// mensagem de operador não definido. Tratar erro de divisão por zero.

public class Ex13 {
    public static void executar(){
        int vA = Prompt.lerInteiro("Digite o valor para A: ");
        int vB = Prompt.lerInteiro("Digite o valor para B: ");
        String var = Prompt.lerLinha("Digite o operador");


        if (var.equals("+") || var.equals("/") || var.equals("-") || var.equals("*"))  {
        switch (var) {
            case "+":

            Prompt.imprimir(vA + vB);
                
                break;
            
            case "-":
            Prompt.imprimir(vA - vB);

                break;
            
            case "/" :
            if (vB != 0) {
                Prompt.imprimir(vA / vB);
            }
            
            else {
                Prompt.imprimir("Não é possivel dividir por zero.");
            }

            break;

            case "*":

            Prompt.imprimir(vA * vB);

            break;

        
            default:
                break;
        }
    }
    else   {

        Prompt.imprimir("Operador invalido");
    }
    }
    
}
