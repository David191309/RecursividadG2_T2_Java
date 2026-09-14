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
public class Ejercicio3 {

    public static int sumaRecursiva(int n) {

        if (n == 1) {
            return 1;
        }

        // Llamada recursiva
        return sumaRecursiva(n - 1) + n;
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = leer.nextInt();

        // Validar que el número sea positivo
        while (numero <= 0) {
            System.out.print(
                    "Error. debes ingresar un numero mayor que cero: "
            );
            numero = leer.nextInt();
        }

        int resultado = sumaRecursiva(numero);

        System.out.println(
                "La suma de los primeros " + numero
                + " numeros positivos es: " + resultado
        );

        leer.close();
    }
}
