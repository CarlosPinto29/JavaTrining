package programacion;

import java.util.Scanner;

public class EjFunciones {

    static Scanner sc = new Scanner(System.in);

    static int suma(int a, int b){
        return a + b;
    }

    static int resta(int a, int b){
        return a - b;
    }

    static int multiplicar(int a, int b){
        return a * b;
    }

    static int dividir(int a, int b){
        if(b == 0){
            System.out.println("No se puede dividir por zero");
            return 0;
        } else {
            return a/b;
        }
    }

    static int pedirNumero(){
        int numero;
        while(true){
            System.out.println("Ingrese un numero: ");

            try{
                numero = Integer.parseInt(sc.nextLine());
                return numero;
            } catch(Exception e){
                System.out.println("Ingrese un numero valido");
            }
        }

    }

    static int ejecutarCaso(int opcion){
        int num1 = pedirNumero();
        int num2 = pedirNumero();

        switch(opcion){
            case 1:
                return suma(num1, num2);
            case 2:
                return resta(num1, num2);
            case 3:
                return multiplicar(num1, num2);
            case 4:
                return dividir(num1, num2);
            default:
                return 0;

        }
    }


    static void menu(){
        int opcion = 0;

        while (opcion != 5){
            System.out.println("### CALCULADORA ###");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = pedirNumero();
            switch (opcion){
                case 1:
                    System.out.println("Resultado: suma = : " + ejecutarCaso(1));
                    break;
                case 2:
                    System.out.println("Resultado: resta = : " + ejecutarCaso(2));
                    break;
                case 3:
                    System.out.println("Resultado: multiplicacion = : " + ejecutarCaso(3));
                    break;
                case 4:
                    System.out.println("Resultado: divicion = : " + ejecutarCaso(4));
                    break;
                case 5:
                    System.exit( 0);
                default:
                    System.out.println("Ingrese un numero valido");;
            }
        }
    }

    public static void main(String[] args) {
        menu();


    }

}
