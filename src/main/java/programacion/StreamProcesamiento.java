package programacion;

import java.util.ArrayList;
import java.util.List;

public class StreamProcesamiento {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(30);
        numeros.add(5);
        numeros.add(40);
        numeros.add(80);
        numeros.add(54);
        numeros.add(60);
        numeros.add(70);

        numeros.stream()
                .filter(numero -> numero < 50)

                .map(numero -> numero * 2)
                .sorted()
                .limit(2)
                .forEach(System.out::println);




        /* Filtrar lista de coleccion con stream
        for(Integer numero : numeros){
            if (numero > 20){
                System.out.println(numero);
            }
        }



        // Recorrer Stream
        for(Integer numero : numeros){
            System.out.println(numero);
        }

        // Metodo para recorrer lista stream
        numeros.forEach(numero -> System.out.println(numero));

         */
    }
}
