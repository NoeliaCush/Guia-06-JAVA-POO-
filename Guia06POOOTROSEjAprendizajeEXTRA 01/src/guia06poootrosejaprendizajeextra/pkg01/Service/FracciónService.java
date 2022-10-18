package guia06poootrosejaprendizajeextra.pkg01.Service;

import guia06poootrosejaprendizajeextra.pkg01.Entidad.Fracción;
import java.util.Scanner;

public class FracciónService {

    Scanner leer = new Scanner(System.in);

    /**
     * Crear la clase servicio que contenga métodos para sumar, restar,
     * multiplicar y dividir fracciones
     */
    Fracción f1 = new Fracción();
    Fracción f2 = new Fracción();

    public void crearFracciones() {

        System.out.println("Por favor, indique los valores para la primera fracción");
        System.out.println("Numerador:");
        f1.setNumerador1(leer.nextDouble());
        System.out.println("Denominador: ");
        f1.setDenominador1(leer.nextDouble());
        System.out.println("La primer fracción queda de la siguiente manera " + f1.getNumerador1() + " / " + f1.getDenominador1());

        System.out.println("Por favor, indique los valores para la segunda fracción");
        System.out.println("Numerador:");
        f2.setNumerador2(leer.nextDouble());
        System.out.println("Denominador: ");
        f2.setDenominador2(leer.nextDouble());
        System.out.println("La primer segunda queda de la siguiente manera " + f2.getNumerador2() + " / " + f2.getDenominador2());
    }

    public void sumaFracciones() {

        //f racción1 + fracción2
        // (((denominador2 * numerador 1) +(denominador 1 * numerador2)) / (denominador 1 * denominador2))
        System.out.println("La suma entre las dos fracciones es " + ((f2.getDenominador2() * f1.getNumerador1()) + (f1.getDenominador1() * f2.getNumerador2())) + " / " + (f1.getDenominador1() * f2.getDenominador2()));

    }

    public void restaFracciones() {
        //f racción1 - fracción2
        // (((denominador2 * numerador 1) - (denominador 1 * numerador2)) / (denominador 1 * denominador2))

        System.out.println("La resta entre las dos fracciones es " + ((f2.getDenominador2() * f1.getNumerador1()) - (f1.getDenominador1() * f2.getNumerador2())) + " / " + (f1.getDenominador1() * f2.getDenominador2()));

    }

    public void multiFracciones() {

        //fracción1 * fracción2
        // (numerador1 * numerador 2) "/" (denominador1 * denominador2)
        System.out.println("La multiplicación entre las dos fracciones es " + (f1.getNumerador1() * f2.getNumerador2()) + " / " + (f1.getDenominador1() * f2.getDenominador2()));

    }

    public void dividFracciones() {
        //fracción 1 / fracción2
        //(numerador1 * dividor2) "/" (divisor1* numerador2)

        System.out.println("La división entre las dos fracciones es " + (f1.getNumerador1() * f2.getDenominador2()) + " / " + (f1.getDenominador1() * f2.getNumerador2()));

    }

}
