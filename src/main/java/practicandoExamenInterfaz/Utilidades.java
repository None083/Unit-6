/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoExamenInterfaz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author FX506
 */
public class Utilidades {
    
    public static CatalogoPersonas leerJSON(String ruta) throws IOException{
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        return mapeador.readValue(new File(ruta),CatalogoPersonas.class);
    }
    
}
