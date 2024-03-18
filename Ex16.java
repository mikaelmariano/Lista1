// 16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
// aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

import java.text.DecimalFormat;

public class Ex16 {
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Digite a nota1");
        double nota2 = Prompt.lerDecimal("Digite a nota 2");
        double nota3 = Prompt.lerDecimal("Digite a nota 3");

        double media = (nota1 + nota2 + nota3)/3;

        DecimalFormat df = new DecimalFormat("#.##");

        Prompt.imprimir(" A média do aluno é " + df.format(media));
    }
}
