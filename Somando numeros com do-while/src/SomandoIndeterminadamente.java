import java.util.Scanner;

public class SomandoIndeterminadamente {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero;
        int soma = 0;
        do {
            System.out.println("DIGITE UM NÚMERO(PARA ENCERRAR, DIGITE 0):");
            numero = leitor.nextInt();
            if (numero != 0){
                soma += numero;
            }



        }while (numero != 0);
        System.out.println("ESSES NÚMEROS SOMADOS SÃO IGUAIS A: " + soma );

        leitor.close();
    }



}
