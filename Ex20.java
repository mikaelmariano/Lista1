// 20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em
// uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são
// fornecidos o tempo em hora e a velocidade média da viagem.

public class Ex20 {
    public static void executar(){

        double hora = Prompt.lerDecimal("Digite a hora");
        double vm = Prompt.lerDecimal("Digite a velocidade media");

        int kmpl = 12;

        double qtdel = (hora * vm)/kmpl;

        Prompt.imprimir("A quantidade de litros é " + qtdel);

    }
}
