package programacion;

public class Operadores {

    public static void main(CadenaText[] args) {

        // Aritmeticos
        System.out.println(3+2);
        System.out.println(3-2);
        System.out.println(3*2);
        System.out.println(3%2);
        System.out.println(3/2);
        System.out.println("");


        // Operadores de asignacion
        System.out.println("Operadores de comparacion");
        int num1 = 35;

        num1 += 3;
        System.out.println("num1 = " + num1);
        num1 *= 4;
        System.out.println("num1 = " + num1);
        num1 /= 2;
        System.out.println("num1 = " + num1);
        num1 %= 2;
        System.out.println("num1 = " + num1);
        System.out.println("");

        // Operadores de comparacion
        System.out.println("Operadores de comparacion");
        System.out.println(2 > 4);
        System.out.println(2 >= 3);
        System.out.println(2 < 4);
        System.out.println(2 <= 4);
        System.out.println(2 != 4);
        System.out.println(2 == 4);
        System.out.println("");

        // Operadores logicos - Tabla de la verdad
        System.out.println("Operadores logicos - Tabla de la verdad");
        System.out.println(true && false);
        System.out.println(2 < 4 && 2>= 4);
        System.out.println(true || false);
        System.out.println(2 < 4 || 2 >= 4);
        System.out.println("");
        
        // Operadores Unarios
        System.out.println("Operadores Unarios ");
        int num2 = 2;
        System.out.println("num2 = " + num2++);
        System.out.println("num2 = " + num2);
        System.out.println("++num2 = " + ++num2);
        System.out.println("num2 = " + num2);




    }
}
