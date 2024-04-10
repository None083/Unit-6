/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tareastreamprecipitaciones;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) throws IOException {

        List<Precipitacion> catPrecipitaciones = UtilidadesFicheros.leerJSON("precipitacionesBadajoz.json");
        catPrecipitaciones.forEach(System.out::println);

        Map<String, Double> mapa = UtilidadesFicheros.mapaPrecipitaciones(catPrecipitaciones);
        for (Map.Entry<String, Double> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        UtilidadesFicheros.escribirJSON(mapa);

        System.out.println("Precipitacion maxima: " + UtilidadesStream.obtenerMaximaPrecipitacion(catPrecipitaciones));

        System.out.println("número de estaciones meteorológicas que han sido "
                + "leídas entre el 10 de octubre de 2017 y el 20 de octubre de 2017: \n"
                + UtilidadesStream.numEstacionesEntreFechas(catPrecipitaciones));

        System.out.println("media de precipitaciones de las estaciones meteorológicas "
                + "leídas entre el 10 de octubre de 2017 y el 20 de octubre de 2017: \n"
                + UtilidadesStream.mediaPrecipitacionesEntreFechas(catPrecipitaciones));

    }
}
