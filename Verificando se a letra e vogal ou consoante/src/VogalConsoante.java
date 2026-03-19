import java.util.Scanner;

public class VogalConsoante {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE UMA LETRA:");

        String letra = leitor.nextLine();

        switch (letra) {
            case "A":
                System.out.println("A LETRA " + letra + " É UMA VOGAL");
                break;
            case "E":
                System.out.println("A LETRA " + letra + " É UMA VOGAL");
                break;
            case "I":
                System.out.println("A LETRA " + letra + " É UMA VOGAL");
                break;
            case "O":
                System.out.println("A LETRA " + letra + " É UMA VOGAL");
                break;
            case "U":
                System.out.println("A LETRA " + letra + " É UMA VOGAL");
                break;
            default:
                System.out.println("A LETRA " + letra + " É UMA CONSOANTE");
                break;




        }
    }




}