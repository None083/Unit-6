/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareastream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author FX506
 */
public class MetodosStream {

    public static List<Persona> nacidos1985OrdenEmail(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .sorted((p1, p2) -> p1.getEmail().compareTo(p2.getEmail()))
                .filter(p -> p.getFecNacim().getYear() == 1985)
                .collect(Collectors.toList());
    }

    public static Set<String> obtenerEmailsNonBinaryJubilado(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .filter(p -> p.getGenero().equals("Non-binary") && p.isJubilado())
                .map(Persona::getEmail) //.map(p -> p.getEmail)
                .sorted()
                .collect(Collectors.toSet());
    }

    public static long obtenerNumeroCiudades(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .map(p -> p.getCiudad())
                .distinct()
                .count();
    }

    public static boolean algunaZondra(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .map(p -> p.getNombre())
                .anyMatch((s) -> s.equalsIgnoreCase("zondra"));
    }

    public static boolean algunEsteponero(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .map(p -> p.getCiudad())
                .anyMatch((s) -> s.equalsIgnoreCase("estepona"));
    }

    public static long apellidoCia(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .map(p -> p.getApellido())
                .filter(p -> p.contains("cia"))
                .count();
    }

    public static List<Integer> obtenerEdades(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .map(p -> p.getEdad())
                .collect(Collectors.toList());
    }

    public static int sumaEdades(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .mapToInt(p -> p.getEdad())
                .sum();
    }

    public static double mediaEdades(List<Persona> listaPersonas) {
        return listaPersonas.stream()
                .mapToInt(p -> p.getEdad())
                .average()
                .orElse(0.0);
    }

    public static String nombresConcatenados(List<Persona> listaPersonas) {
//        listaPersonas.stream()
//                .map(p->p.getNombre())
//                .reduce(" ", (a, b) -> a.concat(b));
        
        return listaPersonas.stream()
                .map(p->p.getNombre())
                .collect(Collectors.joining(", "));
    }

}
