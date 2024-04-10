/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareastreamprecipitaciones;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author noelia
 */
public class UtilidadesStream {

    public static double obtenerMaximaPrecipitacion(List<Precipitacion> lista) {
        return lista.stream()
                .mapToDouble(p -> p.getPrecipitacion())
                .max()
                .getAsDouble();
    }

    public static int numEstacionesEntreFechas(List<Precipitacion> lista) {
        return (int) lista.stream()
                .filter(p -> !p.getFecha().isBefore(LocalDate.of(2017, 10, 10))
                && !p.getFecha().isAfter(LocalDate.of(2017, 10, 20)))
                .map(p -> p.getEstacionMeteorologica())
                .distinct()
                .count();
    }

    public static double mediaPrecipitacionesEntreFechas(List<Precipitacion> lista) {
        return lista.stream()
                .filter(p -> !p.getFecha().isBefore(LocalDate.of(2017, 10, 10))
                    && !p.getFecha().isAfter(LocalDate.of(2017, 10, 20)))
                .mapToDouble(p -> p.getPrecipitacion())
                .average()
                .getAsDouble();
    }

}
