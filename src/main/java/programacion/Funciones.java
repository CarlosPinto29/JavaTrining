package programacion;

import java.util.Scanner;

public class Funciones {

    // crear nueva funcion que imprima un mensaje
    static void imprimirMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    // creo funcion sumar
    static int suma(int a, int b){
        return a + b;
    }

    // crear funcion sin parametros
    static void saludarC25(){
        System.out.println("Hola Corte C25");
    }

    // crear una funcion si es par
    static boolean esPar(int numero) {
        if (numero %2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        // conversion de datos utilizando un string para utilizarlo como enteros con tipo de dato Objeto -> Integer.parseInt(inp.nextLine());
        Scanner inp = new Scanner(System.in);

        System.out.println("Escribe un mensaje");
        String msj = inp.nextLine();

        imprimirMensaje(msj);

        System.out.println("Ingrese un numero: ");
        int num1 = Integer.parseInt(inp.nextLine());
        int num2 = inp.nextInt();

        System.out.println("Resultado: " + suma(num1, num2));

        System.out.printf(" Su Numero %d es par: %b \n", num1, esPar(num1));
        saludarC25();
    }
}
