import java.util.Scanner;

public class BuscarNumero {

    /*Leia 10 números e depois peça outro número ao usuário.
    Informe se ele existe dentro do array.
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double [] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextDouble();
        }

        System.out.println("DIGITE OUTRO NÚMERO E IREI VERIFICAR SE ELE ESTÁ DENTRO DO ARRAY:");
        double numero = leitor.nextDouble();
        boolean existe = false;


        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                existe = true;
                break;
            }
        }

        if (existe){
            System.out.println("O NÚMERO ESTÁ NO ARRAY");
        }else {
            System.out.println("O NÚMERO NÃO ESTÁ NO ARRAY");
        }

        leitor.close();

    }


}
