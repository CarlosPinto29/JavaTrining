package ejerciciosJava;

import java.time.Year;
import java.util.Scanner;

public class EjerciciosJava {


     public static String calcularEdad (String nombre, int anioNacimiento) {

        int year = Year.now().getValue();
        int edad = year - anioNacimiento;


        return nombre + ", Tienes " + edad + " Años.";
    }

    public static double converTemperatura (double celsius) {

         return (celsius * 9 / 5) - 32;
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return (base * 2) + (altura * 2);
    }

    public static double calcularDescuento(double precio, double porcentaje) {
        return precio * (porcentaje / 100);
    }

    public static double calcularPrecioFinal(double precio, double descuento) {
        return precio - descuento;
    }

    public static String verificarNumero(int numero) {

        if(numero > 0) {
            return "Positivo";
        } else if(numero < 0) {
            return "Negativo";
        }

        return "Cero";
    }

    public static String mayorEdad(int edad) {

        if(edad >= 18) {
            return "Mayor de edad";
        }

        return "Menor de edad";
    }

    public static String parImpar(int numero) {

        if(numero % 2 == 0) {
            return "Par";
        }

        return "Impar";
    }

    public static String compararNumeros(int n1, int n2) {

        if(n1 > n2) {
            return n1 + " es mayor";
        }

        if(n2 > n1) {
            return n2 + " es mayor";
        }

        return "Son iguales";
    }



    // 9. Calculadora Simple
    public static double calculadora(double num1, double num2, char operador) {

        switch (operador) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                }
                System.out.println("No se puede dividir por cero.");
                return 0;

            default:
                System.out.println("Operador inválido.");
                return 0;
        }
    }

    // 10. Clasificador de Notas
    public static String clasificarNota(double nota) {

        if (nota >= 1.0 && nota <= 3.9) {
            return "Reprobado";
        } else if (nota >= 4.0 && nota <= 5.9) {
            return "Aprobado";
        } else if (nota >= 6.0 && nota <= 7.0) {
            return "Excelente";
        }

        return "Nota inválida";
    }

    // 11. Contador de Letras
    public static int contarLetras(String texto) {
        return texto.length();
    }

    // 12. Iniciales
    public static String obtenerIniciales(String nombre, String apellido) {

        char inicialNombre = nombre.toUpperCase().charAt(0);
        char inicialApellido = apellido.toUpperCase().charAt(0);

        return "" + inicialNombre + inicialApellido;
    }

    // 13. Verificador de Contraseña
    public static String verificarPassword(String password) {

        if (password.equals("java123")) {
            return "Contraseña correcta";
        }

        return "Contraseña incorrecta";
    }

    // 14. Convertidor de Texto
    public static String convertirMayusculas(String frase) {
        return frase.toUpperCase();
    }

    public static String convertirMinusculas(String frase) {
        return frase.toLowerCase();
    }

    // 15. Contador del 1 al 10
    public static void contarUnoDiez() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 16. Tabla de Multiplicar
    public static void tablaMultiplicar(int numero) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // 17. Suma hasta N
    public static int sumarHastaN(int numero) {

        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        return suma;
    }

    // 18. Mostrar Pares
    public static void mostrarPares() {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // 19. Adivina el Número
    public static void adivinarNumero(Scanner sc) {

        int secreto = 7;
        int intento = 0;

        while (intento != secreto) {

            System.out.print("Adivina el número: ");
            intento = sc.nextInt();

            if (intento != secreto) {
                System.out.println("Incorrecto, intenta nuevamente.");
            }
        }

        System.out.println("¡Correcto!");
    }

    // 20. Menú Interactivo
    public static void menu(Scanner sc) {

        int opcion;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha ficticia");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Hola, bienvenido.");
                    break;

                case 2:
                    System.out.println("11/06/2099");
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el anio: ");
        int anioNac = sc.nextInt();

        System.out.println(calcularEdad(nombre, anioNac));

        System.out.print("Ingresa los Grados Celisus a convertir: ");
        double celsius = sc.nextDouble();
        double fahrenheit = converTemperatura(celsius);

        System.out.printf("La Temperatura en fahrenheit es: %.2f°F%n", fahrenheit);

        System.out.println(" ### Ejercicio 3 ###");

        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        System.out.println(" ### Ejercicio 4 ###");
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double porcentaje = sc.nextDouble();

        double descuento = calcularDescuento(precio, porcentaje);
        double precioFinal = calcularPrecioFinal(precio, descuento);

        System.out.printf("Descuento aplicado: %.2f%n", descuento);
        System.out.printf("Precio final: %.2f%n", precioFinal);

        System.out.println(" ### Ejercicio 5 ###");
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        String resultado = verificarNumero(numero);

        System.out.println(resultado);

        System.out.println(" ### Ejercicio 6 ###");
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        String resul = mayorEdad(edad);

        System.out.println(resul);

        System.out.println(" ### Ejercicio 7 ###");
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        String res = parImpar(numero);

        System.out.println(res);

        System.out.println(" ### Ejercicio 8 ###");
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        String result = compararNumeros(num1, num2);

        System.out.println(result);

        System.out.println(" ### Ejercicio 9 ###");

        System.out.print("Ingrese el primer número: ");
        double nume1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double nume2 = sc.nextDouble();

        System.out.print("Ingrese el operador (+ - * /): ");
        char operador = sc.next().charAt(0);

        double calcu = calculadora(nume1, nume2, operador);

        System.out.println("Resultado: " + calcu);

        System.out.println(" ### Ejercicio 10 ###");

        System.out.print("\nIngrese una nota: ");
        double nota = sc.nextDouble();

        System.out.println(clasificarNota(nota));

        sc.nextLine();

        System.out.println(" ### Ejercicio 11 ###");

        System.out.print("\nIngrese un nombre: ");
        String nomb = sc.nextLine();

        System.out.println("Cantidad de letras: "
                + contarLetras(nomb));

        System.out.println(" ### Ejercicio 12 ###");

        System.out.print("\nIngrese nombre: ");
        String nom = sc.nextLine();

        System.out.print("Ingrese apellido: ");
        String ape = sc.nextLine();

        System.out.println("Iniciales: "
                + obtenerIniciales(nom, ape));

        System.out.println(" ### Ejercicio 13 ###");
        System.out.print("\nIngrese contraseña: ");
        String password = sc.nextLine();

        System.out.println(verificarPassword(password));

        System.out.println(" ### Ejercicio 14 ###");
        System.out.print("\nIngrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Mayúsculas: "
                + convertirMayusculas(frase));

        System.out.println("Minúsculas: "
                + convertirMinusculas(frase));

        System.out.println(" ### Ejercicio 15 ###");
        System.out.println("\nContador 1 al 10:");
        contarUnoDiez();

        System.out.println(" ### Ejercicio 16 ###");
        System.out.print("\nIngrese un número para la tabla: ");
        int numer = sc.nextInt();

        tablaMultiplicar(numer);

        System.out.println(" ### Ejercicio 17 ###");
        System.out.print("\nIngrese N: ");
        int n = sc.nextInt();

        System.out.println("Suma total: "
                + sumarHastaN(n));

        System.out.println(" ### Ejercicio 18 ###");
        System.out.println("\nNúmeros pares:");
        mostrarPares();

        System.out.println(" ### Ejercicio 19 ###");
        adivinarNumero(sc);

        System.out.println(" ### Ejercicio 20 ###");
        menu(sc);

        sc.close();
    }

}
