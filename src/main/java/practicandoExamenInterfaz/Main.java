/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicandoExamenInterfaz;

import java.io.IOException;

/**
 *
 * @author FX506
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        CatalogoPersonas personas = Utilidades.leerJSON("personas.json");
        personas.getPersonas().forEach(System.out::println);
        
        
    }
    
}
