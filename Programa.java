public class Programa {

    public static void main(String[] args) {

        int numero = Prompt.lerInteiro("Digite o Numero do Exercicio:");

        switch (numero) {
            case 1:
                Ex1.executar();
                break;
        
                case 2:
                Ex2.executar();
                break;

                case 3:
                Ex3.executar();
                break;

                case 4:
                Ex4.executar();
                break;

            default:
                break;
        }
    }
}
