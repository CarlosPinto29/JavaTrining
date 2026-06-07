package programacion;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {

        Map<String, Integer> sueldos = new HashMap<>();

        // Agregar valores a la coleccion
        sueldos.put("Juanito ", 19000000);
        sueldos.put("Marco ", 3998494);
        sueldos.put("Pedro ", 23399482);
        sueldos.put("Rafael ",32338);
        sueldos.put("Antonio ", 500);

        System.out.println(sueldos);

        // Modificar Valor
        sueldos.put("Juanito ", 500);
        System.out.println(sueldos);

        // Verificar existencia de calves y valores
        System.out.println(sueldos.containsKey("Juanito "));
        System.out.println(sueldos.containsValue(504));

        // Eliminar elementos
        sueldos.remove("Juanito ");
        System.out.println(sueldos);

        // Tamaño
        System.out.println(sueldos.size());

        // recorrer valores
        for(Integer sueldo : sueldos.values()){
            System.out.println(sueldo);
        }

        // recorrer claves
        for( String nombre : sueldos.keySet() ){
            System.out.println(nombre);
        }

        // Recorrer coleccion completa
        System.out.println("iternado coleccion: ");
        for(Map.Entry<String, Integer> infoUsers : sueldos.entrySet()){
            System.out.println(infoUsers.getKey() + "= " + infoUsers.getValue());

        }





    }
}
