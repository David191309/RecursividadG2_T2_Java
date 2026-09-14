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
public class Ejercicio2 {

    // Metodo recursivo que suma los digitos de un numero
    public static int sumaDigitos(int numero) {

        // Caso base: cuando solamente queda un digito
        if (numero < 10) {
            return numero;
        }

        // Suma el ultimo digito y vuelve a llamar al metodo
        return (numero % 10) + sumaDigitos(numero / 10);
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("¿Cuantos numeros desea ingresar?: ");
        int cantidad = leer.nextInt();

        int numeroMayor = 0;
        int mayorSuma = -1;

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Ingrese el numero " + i + ": ");
            int numero = leer.nextInt();

            // Valida para aceptar solo numeros positivos
            while (numero <= 0) {
                System.out.print(
                    "Error. Ingrese un numero entero positivo: "
                );
                numero = leer.nextInt();
            }

            int suma = sumaDigitos(numero);

            System.out.println(
                "La suma de los digitos de " + numero + " es: " + suma
            );

            if (suma > mayorSuma) {
                mayorSuma = suma;
                numeroMayor = numero;
            }
        }

        System.out.println(
            "\nEl numero con mayor suma de digitos es: " + numeroMayor
        );

        System.out.println(
            "La suma de sus digitos es: " + mayorSuma
        );

        leer.close();
    }
}
