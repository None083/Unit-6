/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repesca1a72023;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class Utilidades {
    
    public static void lecturaFicheroCSV(String id, List<Censo> lista) {
        String linea;
        String[] tokens;

        try (Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            datosFichero.nextLine(); //salta la primera linea
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(",");

//                DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d-MM-uuuu");

//                lista.add(new Persona(tokens[0], tokens[1], tokens[2], tokens[3],
//                        tokens[4], LocalDate.parse(tokens[5], formatters),
//                        Boolean.parseBoolean(tokens[6]), tokens[7]));
                if(tokens[5].isEmpty()){
                    lista.add(new Censo(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[6]));
                }else{
                    lista.add(new Censo(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]));
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
