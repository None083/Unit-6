/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escribirlineasficheroscanner;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String linea = "";
        
        while(!linea.equalsIgnoreCase("fin")){
            System.out.println("Introduce una palabra");
            linea = teclado.nextLine();
            if(!linea.equalsIgnoreCase("fin")){
                escribirLinea(linea + "\n");
            }
        }

    }
    
    
    public static void escribirLinea(String datos) {
        
        try {
            Files.write(Paths.get("escribirLinea.txt"), datos.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.out.println("Error creando el fichero");
        }
    }
    
}
