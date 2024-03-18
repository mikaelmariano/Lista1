// 15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,
// y2), calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz
// (((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03

import java.text.DecimalFormat;

public class Ex15 {
    public static void executar(){
        int x1 = Prompt.lerInteiro("Digite o valor para x1");
        int y1 = Prompt.lerInteiro("Digite o valor para y1");
        int x2 = Prompt.lerInteiro("Digite o valor para x2");
        int y2 = Prompt.lerInteiro("Digite o valor para y2");

        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        DecimalFormat df = new DecimalFormat("#.##");

        Prompt.imprimir("O valor é " + df.format(d));

    }
}
