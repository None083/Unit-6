/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leerficherovehiculos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class UtilidadesFicheros {

//    public static List<Vehiculo> leerFicheroCsv(String fichero) {
//        List<Vehiculo> lista = new ArrayList<>();
//        String linea;
//        String[] atributo;
//
//        try (Scanner datosFichero = new Scanner(new File(fichero), "UTF-8")) {
//            //Saltar primera linea
//            datosFichero.nextLine();
//
//            while (datosFichero.hasNextLine()) {
//                linea = datosFichero.nextLine();
//                atributo = linea.split(",");
//
//                lista.add(new Vehiculo(atributo[0], atributo[1], atributo[2],
//                        atributo[3], atributo[4], atributo[5]));
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        return lista;
//    }
    
    public static List<String> leerFichero(String nombreFichero) {
        List lista = new ArrayList<>();
        try {
            lista = Files.readAllLines(Paths.get(nombreFichero)).subList(1, Files.readAllLines(Paths.get(nombreFichero)).size());
        } catch (IOException ex) {
            System.out.println("Error accediendo a " + nombreFichero);
        }
        return lista;
    }

    public static List<Vehiculo> listaStringAVehiculo(List<String> listaString) {
        List<Vehiculo> lista = new ArrayList<>();
        String[] atributo;
        
        for (int i = 1; i < listaString.size(); i++) {
            String linea = listaString.get(i);
            atributo = linea.split(",");

            if (atributo.length >= 6) {
                lista.add(new Vehiculo(atributo[0], atributo[1], atributo[2],
                        atributo[3], atributo[4], atributo[5]));
            } else {
                System.out.println("La línea no tiene suficientes atributos: " + linea);
            }
        }
        return lista;
    }
    
    public static Map<Vehiculo, Integer> mapNumeroPalabras(List<Vehiculo> lista){
        Map<Vehiculo, Integer> map = new HashMap<>();
        
        for (Vehiculo v : lista) {
            String[] palabras = v.toString().split("\\s+");
            map.put(v, palabras.length);
        }
        return map;
    }

}
