package classes;

public class Retangulo {

    public double base;
    public double altura;

    public void calcularArea(){

        System.out.println("ÁREA: " + base * altura);

    }

    public void calcularPerimetro(){

        System.out.println("PERÍMETRO: " + 2 * (base + altura));

    }

}
