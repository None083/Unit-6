/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tarea7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author noelia
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Persona> listaPersonas = new ArrayList<>();
        UtilidadesFicheros.lecturaFicheroPersonas("personas.csv", listaPersonas);
        for (Persona p : listaPersonas) {
            System.out.println(p);
        }
        
        System.out.println("--------Tipos de géneros existentes--------");
        Set<String> setGeneros = tiposGenero(listaPersonas);
        for (String s : setGeneros) {
            System.out.println(s);
        }

        //Guardamos los géneros en un archivo de texto
        UtilidadesFicheros.escribirFicheroGeneros(setGeneros, "generos.txt");
        
        System.out.println("--------Número de personas por género--------");
        Map<String, Integer> mapPersonasGenero = numPersonasGenero(listaPersonas);
        for (Map.Entry<String, Integer> entry : mapPersonasGenero.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        //Guardamos los registros del map en un csv
        UtilidadesFicheros.escribirCSVGeneros(mapPersonasGenero, "contadorGeneros.csv");
        
    }
    
    public static Set<String> tiposGenero(List<Persona> listaPersonas) {
        Set<String> setGeneros = new HashSet<>();
        
        for (Persona p : listaPersonas) {
            setGeneros.add(p.getGenero());
        }
        return setGeneros;
    }
    
    public static Map<String, Integer> numPersonasGenero(List<Persona> listaPersonas) {
        Map<String, Integer> mapPersonasGenero = new HashMap<>();
        
        for (Persona p : listaPersonas) {
            
            if (mapPersonasGenero.containsKey(p.getGenero())) {
                mapPersonasGenero.put(p.getGenero(), mapPersonasGenero.get(p.getGenero()) + 1);
            }else{
                mapPersonasGenero.put(p.getGenero(), 1);
            }
        }
        return mapPersonasGenero;
    }
    
}
