import java.util.Scanner;

public class MaiorNumeroDigitado {

  public  static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);

      int numero;
      int maior = 0;

      do {
          System.out.println("DIGITE UM NÚMERO (DIGITE 0 PARA PARAR):");
          numero = leitor.nextInt();

          if (numero > maior){
              maior = numero;
          }


      }while (numero != 0);

      System.out.println("O MAIOR NÚMERO DIGITADO FOI: " + maior);

      leitor.close();

    }



}
