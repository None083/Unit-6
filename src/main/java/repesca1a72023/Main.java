/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repesca1a72023;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        List<Censo> listaCenso = new ArrayList<>();
        
        Utilidades.lecturaFicheroCSV("censo_instalaciones_deportivas.csv", listaCenso);
        
        listaCenso.forEach(System.out::println);
        
    }
    
}
