import java.util.Scanner;

public class Soma {
    //Criando metodo
    public static void main(String[] args) {

        //Criando uma variável leitor para que ele leia os números digitados pelo usuário
        Scanner leitor = new Scanner(System.in);

        //Pedindo para que o usuário digite 2 números
        System.out.println("DIGITE 2 NÚMEROS");

        //Agora o scanner vai capturar os números que o usuário digitar
        double numeroA = leitor.nextDouble();
        double numeroB = leitor.nextDouble();

        //imprimindo a soma
        System.out.println("A SOMA DESSES VALORES É: " + (numeroA + numeroB));

        //fechando o leitor para evitar problemas
        leitor.close();

    }


}
