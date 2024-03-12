/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package leerficherovehiculos;

import java.util.List;
import java.util.Map;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {

        List<String> listaString = UtilidadesFicheros.leerFichero("vehiculos.csv");
        List<Vehiculo> listaVehiculos = UtilidadesFicheros.listaStringAVehiculo(listaString);
        listaVehiculos.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        
        Map<Vehiculo, Integer> map = UtilidadesFicheros.mapNumeroPalabras(listaVehiculos);
        for (Map.Entry<Vehiculo, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }

    }
}
