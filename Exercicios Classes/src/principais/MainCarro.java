package principais;
import classes.Carro;

/*Crie uma classe chamada Carro. Atributos:
marca
modelo
ano
Crie 2 carros diferentes e imprima as informações dos dois
 */

public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.marca = "Mitsubishi";
        carro.modelo = "Eclipse";
        carro.ano = 1995;

        carro2.marca = "BMW";
        carro2.modelo = "M3 GTR";
        carro2.ano = 2001;

        System.out.println("MARCA: " + carro.marca);
        System.out.println("MODELO: " + carro.modelo);
        System.out.println("ANO: " + carro.ano);

        System.out.println("------------------------");

        System.out.println("MARCA: " + carro2.marca);
        System.out.println("MODELO: " + carro2.modelo);
        System.out.println("ANO: " + carro2.ano);

    }


}
