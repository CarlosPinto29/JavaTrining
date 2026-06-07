package programacion;
import java.util.Scanner;

public class CadenaText {
    public static void main(String[] args) {


        String nombre = "Carlos";
        String contrasena = "123";
        System.out.println("Mi Nombre es  " + nombre);
        System.out.println("Longitud: " + nombre.length());
        System.out.println("Caracter: " + nombre.charAt(3));
        System.out.println("Minuscula: " + nombre.toLowerCase());
        System.out.println("Mayuscula: " + nombre.toUpperCase());
        System.out.println(nombre.contains("rl"));

        System.out.println(nombre == "Carlos");
        System.out.println(nombre.equals("Carlos"));
        System.out.println(nombre.equalsIgnoreCase("Carlos"));
        System.out.println("");

        Scanner inp = new Scanner(System.in);



    }
}
