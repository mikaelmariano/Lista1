// 11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em
// ordem crescente. 

public class Ex11 {
    public static void executar(){

        int num1 = Prompt.lerInteiro("Digite o primeiro numero: ");
        int num2 = Prompt.lerInteiro("Digite o segundo numero: ");
        int num3 = Prompt.lerInteiro("Digite o terceiro numero: ");
        int temp = 0;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        Prompt.imprimir("A ordem é " + num1 + "," + num2 + "," + num3);

    }

    
}
