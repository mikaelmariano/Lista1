public class Ex5 {
    public static void executar() {

        int a = Prompt.lerInteiro("Digite o valor para A: ");
        int b = Prompt.lerInteiro("Digite o valor para B: ");

        Prompt.imprimir("O valor Original para A é: " + a);
        Prompt.imprimir("O valor Original para B é: " + b);

        int c = a;
        a = b;
        b = c;

        Prompt.imprimir("\nValores após a troca:");
        Prompt.imprimir("A: " + a);
        Prompt.imprimir("B: " + b);

        
    }
    
}
