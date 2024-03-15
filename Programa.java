public class Programa {

    public static void main(String[] args) {

        int numero = Prompt.lerInteiro("Digite o Numero do Exercicio:");

        switch (numero) {
            case 1:
                Ex1.executar();
                break;
        
                case 2:
                System.out.println("Voce Digitou o 2");
                break;

            default:
                break;
        }
    }
}
