import java.util.Scanner;

public class MaiorDeTresNumeros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE 3 NÚMEROS:");

        double numero1 = leitor.nextDouble();
        double numero2 = leitor.nextDouble();
        double numero3 = leitor.nextDouble();
        double maior = numero1;
        double menor = numero1;

        //Vendo qual é o menor número dos 3
        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 <menor){
            menor = numero3;
        }

        //Vendo qual é o maior número dos 3
        if (numero2 > maior){
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }



        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);

        leitor.close();
    }

}
