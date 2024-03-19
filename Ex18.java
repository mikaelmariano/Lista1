// 18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
// harmônica.

import java.text.DecimalFormat;

public class Ex18 {

    public static void executar(){

        double nota1 = Prompt.lerDecimal("Digite a nota 1");
        double nota2 = Prompt.lerDecimal("Digite a nota 2");
        double nota3 = Prompt.lerDecimal("Digite a nota 3");

        double mediaharmonica = 3 / ((1/nota1)+(1/nota2)+(1/nota3));

        DecimalFormat df = new DecimalFormat("#.##");

        Prompt.imprimir("A media harmonica é " + df.format(mediaharmonica));

    }
    
}
