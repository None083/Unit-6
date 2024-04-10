/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareastreamprecipitaciones;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author noelia
 */
public class UtilidadesFicheros {
    
    public static List<Precipitacion> leerJSON(String ruta) throws IOException{
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        return mapeador.readValue(new File(ruta),
                    mapeador.getTypeFactory().constructCollectionType(
                            ArrayList.class, Precipitacion.class));
    }
    
    public static Map<String, Double> mapaPrecipitaciones(List<Precipitacion> lista){
        return lista.stream()
            .collect(Collectors.groupingBy(
                p->p.getEstacionMeteorologica(),
                Collectors.summingDouble(Precipitacion::getPrecipitacion)
            ));
    }
    
    public static void escribirJSON(Map<String, Double> mapa) throws IOException{
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapeador.writeValue(new File("mapaPrecipitaciones.json"), mapa);
    }
    
}
