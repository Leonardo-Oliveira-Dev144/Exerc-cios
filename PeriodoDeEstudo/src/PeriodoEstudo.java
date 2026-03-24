import java.util.Scanner;

public class PeriodoEstudo {

   public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);


       System.out.println("DIGITE EM QUAL PERÍODO VOCÊ ESTUDA: (M) PARA MATUTINO; (V) PARA VESPERTINO; (N) PARA NOTURNO;");
       String periodo = leitor.next();

       switch (periodo) {
           case "M":
               System.out.println("VOCÊ ESTUDA NO PERÍODO MATUTINO");
               break;
           case "V":
               System.out.println("VOCÊ ESTUDA NO PERÍODO VESPERTINO");
               break;
           case "N":
               System.out.println("VOCÊ ESTUDA NO PERÍODO NOTURNO");
               break;
           default:
               System.out.println("ERRO: DIGITE UM PERÍODO VÁLIDO");
               break;
       }

       leitor.close();
    }

}
