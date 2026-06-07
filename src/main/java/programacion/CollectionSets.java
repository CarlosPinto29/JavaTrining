package programacion;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;



public class CollectionSets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Set -> es un tipo de "LISTA" desordenada pero no permite duplicados
        Set<String> nombres = new HashSet<>();

        nombres.add("Elias");
        nombres.add("Carlos");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Lucas");
        nombres.add("Fabian");

        // Agregar Elemento
        System.out.println("Ingresa Un nombre a la Lista set: ");
        System.out.println(nombres);
        System.out.println("");
        String nombre = sc.nextLine();
        nombres.add(nombre);
        System.out.println(nombres);

        // Verificar existencia de algo
        nombre = sc.nextLine();
        System.out.println(nombres.contains(nombre));

        nombre = sc.nextLine();

        // Eliminar elementos
        nombres.remove(nombre);
        System.out.println(nombres);

        // Acceder a elementos de set mediante forEach
        System.out.println("Recorriendo Set");
        for(String name : nombres) {
            System.out.println("Nombre: " + name);

        }
        System.out.println("Tamaño de la Colecciones: "+ nombres.size());

    }
}
