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

                case 5:
                Ex5.executar();
                break;

                case 6:
                Ex6.executar();
                break;

                case 7:
                Ex7.executar();
                break;

                case 8:
                Ex8.executar();
                break;

                case 9:
                Ex9.executar();
                break;

                case 10:
                Ex10.executar();
                break;

                case 11:
                Ex11.executar();
                break;

                case 12:
                Ex12.executar();
                break;

                case 13:
                Ex13.executar();
                break;

                case 14:
                Ex14.executar();
                break;

                case 15:
                Ex15.executar();
                break;

                case 16:
                Ex16.executar();
                break;

            default:
                break;
        }
    }
}
