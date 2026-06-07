package programacion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<String> nombres = new ArrayList<>();

        int opt;

        while (true ) {

            System.out.println(" ### Sistema de trabajadores ### ");
            System.out.println("1.- Agregar Trabjador");
            System.out.println("2.- Mostrar Lista de Trabajadores");
            System.out.println("3.- Salir");

            opt = Integer.parseInt(sc.nextLine());

            if (opt == 1) {
                System.out.println("Agrega un Trabajador: ");
                String nombre = sc.nextLine();
                nombres.add(nombre);

            } else if (opt == 2) {
                for (int i = 0; i < nombres.size(); i++){
                    System.out.println("Trabajador: "+ i + ": " + nombres.get(i));
                }

            } else if (opt == 3) {
                System.out.println("Saliendo del sistema ...");
                break;

            } else {
                System.out.println("Opcion Invalida");
            }

        }


    }
}
