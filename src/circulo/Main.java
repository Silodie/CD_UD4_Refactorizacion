package circulo;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en Visual Studio Core con la clase Circulo
 * 
 * @author profesor, Silvia López Diéguez
 * @version 03/03/2021
 * @see circulo.Circulo
 */
public class Main {
    public static void main(String[] args) {
        Circulito circulo = new Circulito(37, 43, 2.5);
        String salida = "La coordenada X es " + circulo.getCoordenadaX() + "\nLa coordenada Y es "
                + circulo.getCoordenadaY() + "\nEl radio es " + circulo.getRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaY(20);
        circulo.setRadio((4.2 < Circulito.getLimiteradio() ? 0.0 : 4.2));
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida += "\nEl diámetro es " + dosDigitos.format(circulo.obtenerDiametro());
        salida += "\nLa circunferencia es " + dosDigitos.format(circulo.obtenerCircunferencia());
        salida += "\nEl área es " + dosDigitos.format(circulo.obtenerAreaCirculo());
        System.out.println(salida);

        System.out.println(salida);
        System.exit(0);
    }

}
