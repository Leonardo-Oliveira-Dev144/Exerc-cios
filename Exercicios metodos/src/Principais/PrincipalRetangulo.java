package Principais;

import classes.Retangulo;

/*Crie uma classe Retangulo e calcule seu perímetro e sua área
utilizando métodos.
 */
public class PrincipalRetangulo {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();


        retangulo.base = 8;
        retangulo.altura = 6;

        retangulo.calcularArea();
        retangulo.calcularPerimetro();



    }




}
