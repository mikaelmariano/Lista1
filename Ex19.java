// 19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu
// volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2
// * altura;
// Exemplo: raio = 10, altura = 15. Volume = 4710

public class Ex19 {
    public static void executar(){
        double raio = Prompt.lerDecimal("Digite o raio");
        double altura = Prompt.lerDecimal("Digite a altura");

        double volume = 3.14 * Math.pow(raio, 2) * altura;

        Prompt.imprimir("o volume é " + volume);
    }
}
