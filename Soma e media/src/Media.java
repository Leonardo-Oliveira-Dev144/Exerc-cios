import java.util.Scanner;

public class Media {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);


        System.out.println("DIGITE AS 4 NOTAS BIMESTRAIS DO ALUNO:");

        double nota1 = leitor.nextDouble();
        double nota2 = leitor.nextDouble();
        double nota3 = leitor.nextDouble();
        double nota4 = leitor.nextDouble();

        System.out.println("A MÉDIA DO ALUNO É: " + (nota1 + nota2 + nota3 + nota4)/4);

        leitor.close();


    }




}
