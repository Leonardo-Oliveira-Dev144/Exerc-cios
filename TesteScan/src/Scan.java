import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();

        System.out.println("Digite sua altura:");
        double altura = leitor.nextDouble();

        System.out.println("Possuí Carro?");
        boolean temCarro = leitor.nextBoolean();

        System.out.println("Os valores digitados foram:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Possui carro: " + temCarro);

        leitor.close();
    }
}

