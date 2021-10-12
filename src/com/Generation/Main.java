package com.Generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Estructura if
        /*
        if(condicion) {
        } else if() {
        } else {
        }
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("¿Cual es tu nombre? ");
        sc.nextLine();
        String nombre = sc.nextLine();

        if(edad >18) {
            System.out.println("¡Felicidades " + nombre + ", puedes votar!");
        } else {
            System.out.println("Hola " + nombre + ". Aun no puedes votar.");

            sc.close();

         */

        /*

        // Ejercicio Triangulos

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de tu primer angulo: ");
        int angulo1 = sc.nextInt();
        System.out.println("Ingresa el valor de tu segundo angulo: ");
        int angulo2 = sc.nextInt();
        System.out.println("Ingresa el valor de tu tercer angulo: ");
        int angulo3 = sc.nextInt();


        if(angulo1 + angulo2 + angulo3 == 180) {
            System.out.println("El triangulo es valido.");
        } else {
            System.out.println("El triaguno es invalido.");

            sc.close();
         */

        /*

        // Ejercicio año bisiesto


        Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("Ingresa un año: ");
        año = sc.nextInt();
        if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println(año + " Es bisiesto.");
        } else {
            System.out.println(año + " No es bisiesto.");
        }
        sc.close();

        */

        /*

        // Ejercicio operaciones

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa la operacion deseada: \n 1) Suma \n 2) Resta \n 3) Multipliacacion \n 4) Division");
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado = 0;

        switch(operacion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;

            default:
                System.out.println("Operacion invalida.");
        }

        sc.close();
        System.out.println(resultado);
        */



        // Ejercicio semana

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 7: ");
        int numero = sc.nextInt();

        switch(numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero no valido.");
        }
        sc.close();
        System.out.println(numero);
            }
    }



