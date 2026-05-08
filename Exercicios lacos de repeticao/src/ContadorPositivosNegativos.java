import java.util.Scanner;

public class ContadorPositivosNegativos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero;
        int numeroNegativo = 0;
        int numeroPositivo = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("DIGITE 10 NÚMEROS:");
            numero = leitor.nextInt();


            if (numero > 0){
                numeroPositivo++;
            } else if (numero < 0) {
                numeroNegativo++;
            } else{
                System.out.println("0 É UM NÚMERO NEUTRO.");
                leitor.close();
                return;
            }


        }
        System.out.println("NÚMEROS POSITIVOS DIGITADOS: " + numeroPositivo);
        System.out.println("NÚMEROS NEGATIVOS DIGITADOS: " + numeroNegativo);

        leitor.close();

    }

}
