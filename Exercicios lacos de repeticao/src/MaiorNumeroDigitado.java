import java.util.Scanner;

public class MaiorNumeroDigitado {

  public  static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);

      int numero;
      int maior;

      System.out.println("DIGITE UM NÚMERO (0 PARA PARAR):");
      numero = leitor.nextInt();

      if (numero == 0){
          System.out.println("NENHUM NÚMERO FOI DIGITADO.");
          return;
      } else {
          maior = numero;
      }

      while (numero != 0){
          if (numero > maior){
              maior = numero;
          }

          System.out.println("DIGITE UM NÚMERO (0 PARA PARAR):");
          numero = leitor.nextInt();

      }





      System.out.println("O MAIOR NÚMERO DIGITADO FOI: " + maior);

      leitor.close();

    }



}
