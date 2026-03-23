import java.util.Scanner;

public class OrdemDecrescente {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE 3 NÚMEROS:");

        double numero1 = leitor.nextDouble();
        double numero2 = leitor.nextDouble();
        double numero3 = leitor.nextDouble();
        double maior = numero1;
        double menor = numero1;
        double numeroMeio = 0;

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

        //Vendo qual número é o número do meio
        if (numero1 > menor && numero1 <maior) {
            numeroMeio = numero1;
        }

        if (numero2 > menor && numero2 < maior){
            numeroMeio = numero2;
        }

        if (numero3 > menor && numero3 < maior) {
            numeroMeio = numero3;
        }

        System.out.println("ORDEM DECRESCENTE: " + maior + ", " + numeroMeio + ", " + menor);
        System.out.println("ORDEM CRESCENTE: " + menor + ", " + numeroMeio + ", " + maior);

        leitor.close();
    }

}

