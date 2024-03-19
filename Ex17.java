// 17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes a
// cada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada:
// Média ponderada =
// nota1 * peso1 + nota2 * peso2 + nota3 * peso3
// peso1 + peso2 + peso3
// Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
// Média ponderada = 8.25

import java.text.DecimalFormat;

public class Ex17 {
    public static void executar(){
        double nota1 = 10;
        double nota2 = 5.5;
        double nota3 = 8;

        double peso1 = 5;
        double peso2 = 3;
        double peso3 = 2;

        DecimalFormat df = new DecimalFormat("#.##");

        double mediaponderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        Prompt.imprimir("A media é igual a " + df.format(mediaponderada));
    }

    
}
