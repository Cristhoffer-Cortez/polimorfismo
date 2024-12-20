package com.mycompany.polimorfismotablas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolimorfismoTablas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero maximo para las tablas de multiplicar que desea (inicia en 2). ");
        int nummaximo = scanner.nextInt();

        List<Multiplicar> tablas = new ArrayList<>();

        // Crear tablas para los números desde 2 hasta maxNumber
        for (int i = 2; i <= nummaximo; i++) {
            tablas.add(new Operaciones(i));
        }

        // Bucle de interacción con el usuario
        while (true) {
            System.out.println("-------------MENU-----------------");
            System.out.println("1. Ver tablas en orden ascendente");
            System.out.println("2. Ver tablas en orden descendente");
            System.out.println("3. Sumar los resultados de cada tabla");
            System.out.println("4. Mostrar tablas invertidas (de 10 a 1)");
            System.out.println("5. Mostrar suma total de todas las tablas");
            System.out.println("6. Salir");
            System.out.println("Elija una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (Multiplicar tabla : tablas) {
                        tabla.OrdenAscendente();
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = nummaximo; i >= 2; i--) {
                        tablas.get(i - 2).OrdenDescendente();
                        System.out.println();
                    }
                    break;
                case 3:
                    for (Multiplicar tabla : tablas) {
                        System.out.println("Suma de la tabla del " + tabla.number + " es: " + tabla.SumaTablas());
                    }
                    break;
                case 4:
                    for (Multiplicar tabla : tablas) {
                        System.out.println("Tabla del " + tabla.number + " invertida:");
                        for (int i = 10; i >= 1; i--) {
                            System.out.println(tabla.number + " x " + i + " = " + (tabla.number * i));
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    int sumaTotal = 0;
                    for (Multiplicar tabla : tablas) {
                        sumaTotal += tabla.SumaTablas();
                    }
                    System.out.println("La suma de las tablas es : " + sumaTotal);
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}
