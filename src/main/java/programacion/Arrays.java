package programacion;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        String[] nombres = new String[4]; // nulls por default
        String[] usuarios = {
                "Carlos",
                "Elias",
                "Gabriel",
                "Emmanuel"
        };

        System.out.println(usuarios[0]);
        numeros[0] = 26;
        System.out.println("Numeros[0] = " + numeros[0]);
        numeros[1] = 28;
        System.out.println("Numeros[1] = " + numeros[1]);
        numeros[2] = 30;
        System.out.println("Numeros[2] = " + numeros[2]);

        System.out.println("Recorriendo el array numeros con for");
        
        for ( int i = 0; i < numeros.length; i++ ) {
            System.out.println("Numero: " + numeros[i]);
        }

        for ( int i = 0; i < usuarios.length; i++ ) {
            System.out.println("Usuario : " + usuarios[i]);
        }
    }
}
