package programacion;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        for ( int i = 0; i < 5; i++) {
            System.out.print(i);
        }
        System.out.println("");

        int i = 1;
        while(i <= 5){
            System.out.print(i);
            i++;

        }

        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Ingrese un numero: ");
            int numero = inp.nextInt();

        } catch (Exception e){
            System.out.println("Ingrese un numero valido");
        }
    }
}

