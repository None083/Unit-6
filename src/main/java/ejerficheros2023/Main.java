/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerficheros2023;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        List<Actividad> listaActividades = new ArrayList<>();
        Utilidades.lecturaFicheroCSV("RegActForCep.csv", listaActividades);
        
        //Utilidades.ordenarPorFechaTitulo(listaActividades).forEach(System.out::println);
        
        Utilidades.ecribirTXTCursosAcabados(listaActividades, "CursosAcabados.txt");
        
        Map<String, Integer> mapCursos = Utilidades.cursosPorCentro(listaActividades);
        
//        for (Map.Entry<String, Integer> entry : mapCursos.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        System.out.println("-----------------------------------------");
        
        Map<String, Long> mapCursosStream = Utilidades.cursosPorCentroStream(listaActividades);
        
//        for (Map.Entry<String, Long> entry : mapCursosStream.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        Utilidades.escribirJSON(mapCursos);
        
        
    }
    
}
