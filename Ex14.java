// 14. A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão
// Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
// r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo
// que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =
// 7, r = 3. Resultado: an = 28

public class Ex14 {
    public static void executar(){
        int a1 = Prompt.lerInteiro("Digite o valor para a1");
        int n = Prompt.lerInteiro("Digite o valor para n");
        int r = Prompt.lerInteiro("Digite o valor par r");

        int an = a1 + (n - 1) * r;

        Prompt.imprimir("O valor é igual a " + an);
    }
    
}
