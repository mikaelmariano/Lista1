// 6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
// Fahrenheit. A fórmula de conversão é:
// F = (9 * C + 160) / 5

public class Ex6 {
    public static void executar() {

        double celsius = Prompt.lerInteiro("Digite a temperatura: ");

        double fahrenheit = (9 * celsius + 160)/5;

        Prompt.imprimir("A temperatura em Fahrenheit é de " + fahrenheit);
        
    }    
}
