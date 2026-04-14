import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE UM ANO:");

        long ano = leitor.nextLong();

        if (ano % 4 == 0 || ano % 100 == 0 && ano % 400 == 0){
            System.out.println("O ANO " + ano + " É BISSEXTO");
        } else {
            System.out.println("O ANO " + ano + " NÃO É BISSEXTO");
        }

        leitor.close();



    }


}
