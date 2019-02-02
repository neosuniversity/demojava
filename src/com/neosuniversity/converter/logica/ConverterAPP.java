package com.neosuniversity.converter.logica;

import java.util.Scanner;

public class ConverterAPP {

    /*
    public static void main(String[] args) {

        double celsius=0;
        double farenheit=0;

        Scanner scanner = new Scanner(System.in);

        celsius = scanner.nextDouble();
        System.out.println(celsius);

        scanner.nextLine();

        String cadena = scanner.nextLine();
        System.out.println(cadena);




     //  celsius =  convierteFarenheitaCelsius(farenheit);
     //   System.out.println("C =" + celsius);
      farenheit = convierteCelsiusaFarenheit(celsius);

        System.out.println("F = " + farenheit);

    }
*/
    /*
    *  (visibilidad) static tipoDato nombreMetodo (parametros )
    * */

    public static double convierteFarenheitaCelsius( double farenheit) {

        double celsius = (5*(farenheit-32))/9;

        return celsius;

    }

    public static double convierteCelsiusaFarenheit(double celsius) {
       double farenheit = (9*celsius+(32*5))/5;

       return farenheit;
    }
}
