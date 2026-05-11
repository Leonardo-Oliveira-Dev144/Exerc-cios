import java.util.Scanner;

public class MenuSimples {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao;
        double numero1;
        double numero2;
        double resultado;

        do {

            System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO:");
            System.out.println("1- SOMAR DOIS NÚMEROS.");
            System.out.println("2- SUBTRAIR DOIS NÚMEROS.");
            System.out.println("3- SAIR");

            opcao = leitor.nextInt();

            if (opcao == 1){
                System.out.println("DIGITE UM NÚMERO:");
                numero1 = leitor.nextDouble();
                System.out.println("DIGITE MAIS UM NÚMERO");
                numero2 = leitor.nextDouble();
                resultado = numero1 + numero2;
                System.out.println("A SOMA DESSES 2 NÚMEROS É IGUAL À: " + resultado);
            } else if (opcao == 2) {
                System.out.println("DIGITE UM NÚMERO:");
                numero1 = leitor.nextDouble();
                System.out.println("DIGITE MAIS UM NÚMERO");
                numero2 = leitor.nextDouble();
                resultado = numero1 - numero2;
                System.out.println("ESSA SUBTRAÇÃO É IGUAL À: " + resultado);
            }else if (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("DIGITE UM NÚMERO VÁLIDO");
                leitor.close();
                return;
            }
        }while (opcao != 3);

        System.out.println("MENU ENCERRADO");

        leitor.close();
    }
}
