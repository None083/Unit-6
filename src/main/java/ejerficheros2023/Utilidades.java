/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerficheros2023;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import tareaescribirficheroscsvxmljsontxt.App;

/**
 *
 * @author FX506
 */
public class Utilidades {

    public static void lecturaFicheroCSV(String id, List<Actividad> lista) {
        String linea;
        String[] tokens;

        try (Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            for (int i = 0; i < 5; i++) {
                if (datosFichero.hasNextLine()) {
                    datosFichero.nextLine(); //salta las primeras 5 lineas
                }
            }
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");

                DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //"d/MM/uuuu" , "dd/MM/yyyy" ??

                lista.add(new Actividad(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4],
                        LocalDate.parse(tokens[5], formatters),
                        LocalDate.parse(tokens[6], formatters), tokens[7]));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Actividad> ordenarPorFechaTitulo(List<Actividad> lista) {
        return lista.stream()
                .sorted(Comparator.comparing(Actividad::getFechaInicio)
                        .thenComparing(Actividad::getTitulo))
                .toList();
    }

    public static void ecribirTXTCursosAcabados(List<Actividad> lista, String directorio) throws FileNotFoundException {
        List<Actividad> listaCursosAcabados = lista.stream()
                .filter(p -> p.getFechaFin().getYear() == 2020 && p.getFechaFin().getMonthValue() <= 3)
                .toList();

        try (PrintWriter writer = new PrintWriter(new File(directorio), "UTF-8")) {
            for (Actividad a : listaCursosAcabados) {
                writer.println(a.getTitulo() + "\t" + a.getFechaFin());
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Map<String, Integer> cursosPorCentro(List<Actividad> lista) {
        Map<String, Integer> map = new HashMap<>();

        for (Actividad a : lista) {
            if (map.containsKey(a.getCentro())) {
                map.put(a.getCentro(), map.get(a.getCentro()) + 1);
            } else {
                map.put(a.getCentro(), 1);
            }
        }
        return map;
    }

    public static Map<String, Long> cursosPorCentroStream(List<Actividad> lista) {
        return lista.stream()
                .collect(Collectors.groupingBy(p->p.getCentro(), Collectors.counting()));
    }

    public static void escribirJSON(Map<String, Integer> mapa) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapeador.writeValue(new File("mapaPrecipitaciones.json"), mapa);
    }

}
