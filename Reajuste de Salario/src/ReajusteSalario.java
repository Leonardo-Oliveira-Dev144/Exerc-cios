import java.util.Scanner;

public class ReajusteSalario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE O SALÁRIO DO FUNCIONÁRIO:");

        double salario = leitor.nextDouble();
        double percentual;

        if (salario < 280){
            percentual = 0.20;
        } else if (salario < 700) {
            percentual = 0.15;
        } else if (salario < 1500) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }

        double valorAumento = salario * percentual;
        double reajuste = (salario * percentual) + salario;



        System.out.println("SALÁRIO DO FUNCIONÁRIO: " + salario);
        System.out.println("PERCENTUAL DE AUMENTO: " + (percentual * 100) + "%");
        System.out.println("VALOR DO AUMENTO: " + valorAumento);
        System.out.println("SALÁRIO COM REAJUSTE: " + reajuste);

        leitor.close();
    }

}
