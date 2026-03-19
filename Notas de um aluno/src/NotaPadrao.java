import java.util.Scanner;

public class NotaPadrao {

    public void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE AS DUAS NOTAS DO ALUNO");

        double nota1 = leitor.nextDouble();
        double nota2 = leitor.nextDouble();
        double media = (nota1 + nota2) / 2.0;

        if (media == 10){
            System.out.println("APROVADO COM DISTINÇÃO");
        } else if (media >= 7) {
            System.out.println("APROVADO");
        }
        else {
            System.out.println("REPROVADO");

        }

    }


}
