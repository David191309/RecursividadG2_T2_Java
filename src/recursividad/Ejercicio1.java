/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    public static int vocales(String texto) {

        if (texto.length() == 0) {
            return 0;
        }

        char letra = Character.toLowerCase(texto.charAt(0));

        if (letra == 'a' || letra == 'e' || letra == 'i'
                || letra == 'o' || letra == 'u') {

            return 1 + vocales(texto.substring(1));
        }

        return vocales(texto.substring(1));
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = leer.nextLine();

        System.out.println("Cantidad de vocales: "
                + vocales(cadena));
    }
}
