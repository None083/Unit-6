/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tarea7c;

import java.util.ArrayList;
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
        Set<String> setGeneros = Persona.tiposGenero(listaPersonas);
        for (String s : setGeneros) {
            System.out.println(s);
        }

        //Guardamos los géneros en un archivo de texto
        UtilidadesFicheros.escribirFicheroGeneros(setGeneros, "generos.txt");
        
        System.out.println("--------Número de personas por género--------");
        Map<String, Integer> mapPersonasGenero = Persona.numPersonasGenero(listaPersonas);
        for (Map.Entry<String, Integer> entry : mapPersonasGenero.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        
        //Guardamos los registros del map en un csv
        UtilidadesFicheros.escribirCSVGeneros(mapPersonasGenero, "contadorGeneros.csv");
        
    }
    
}
