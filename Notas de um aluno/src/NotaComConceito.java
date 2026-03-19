import java.util.Scanner;

public class NotaComConceito {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE AS DUAS NOTAS DO ALUNO");

        double nota1 = leitor.nextDouble();
        double nota2 = leitor.nextDouble();
        double media = (nota1 + nota2) / 2;
        String conceito = "";

        if (media > 9){
            conceito = "A";
        } else if (media >= 7.5 ) {
            conceito = "B";
        } else if (media >= 6.0 ) {
            conceito = "C";
        } else if (media >= 4.0) {
            conceito = "D";
        } else { conceito = "E";
        }
        System.out.println("A NOTA DO ALUNO É: " + conceito);

    }



}
