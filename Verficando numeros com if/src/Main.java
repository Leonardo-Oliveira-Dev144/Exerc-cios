import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

       System.out.println("DIGITE 2 NÚMEROS:");

       double numA = leitor.nextDouble();
       double numB = leitor.nextDouble();

       if (numA > numB) {
           System.out.println("O NÚMERO MAIOR É: " + numA);
       } else {
           System.out.println("O NÚMERO MAIOR É: " + numB);
       }


    }




}
