package programacion;

import java.util.Scanner;

public class EstructuraControl {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Cual es tu edad: ");
        int edad = inp.nextInt();

        System.out.println("Condicionales");
        if ( edad >= 18 ) {
            System.out.println("El edad es mayor de edad");
        } else if ( edad >= 13 ) {
            System.out.println("Es adolecente");
        } else  {
            System.out.println("Es un niño");
        }

        System.out.println("Ingrese un numero del 1 al 7: ");
        int dia = inp.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6, 7:
                System.out.println("Finde");
                break;
            default:
                System.out.println("Ingrese un numero valido");

        }



    }
}
