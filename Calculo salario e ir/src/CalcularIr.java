import java.util.Scanner;

public class CalcularIr {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("QUANTAS HORAS VOCÊ TRABALHA POR MÊS?");
        int horasTrabalho = leitor.nextInt();


        System.out.println("QUANTO VOCÊ GANHA POR HORA?");
        double salarioHora = leitor.nextDouble();
        double salarioBruto = horasTrabalho * salarioHora;
        double impostoRenda = salarioBruto * (11.0/100.0);
        double inss = salarioBruto * (8.0/100.0);
        double sindicato = salarioBruto * (5.0/100.0);
        double salarioDesconto = salarioBruto - (impostoRenda + inss + sindicato);


        System.out.println("VOCÊ GANHA: " + salarioBruto + " REAIS POR MÊS");
        System.out.println("IMPOSTO DE RENDA: " + impostoRenda + " REAIS");
        System.out.println("INSS: " + inss + " REAIS");
        System.out.println("SINDICATO: " + sindicato + "REAIS");
        System.out.println("SALÁRIO TOTAL COM DESCONTO DOS IMPOSTOS: " + salarioDesconto + " REAIS POR MÊS");




        leitor.close();





    }


}

