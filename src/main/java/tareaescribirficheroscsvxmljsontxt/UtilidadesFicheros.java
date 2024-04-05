/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaescribirficheroscsvxmljsontxt;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class UtilidadesFicheros {

    public static void escribirListaAppCSV(List<App> lista, String fichero) {
        List<String> listaString = new ArrayList<>();

        for (App app : lista) {
            listaString.add(app.toString());
        }

        try {
            Files.write(Paths.get(fichero), listaString, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException ex) {
            System.out.println("Error creando el fichero");
        }
    }

    public static void crearDirectorio(String ruta) {

        Path directory = Paths.get(ruta);
        try {
            Files.createDirectory(directory);
        } catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear " + ruta + " porque ya existe");
        } catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear " + ruta);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio " + ruta);
            System.out.println("Seguramente la ruta está mal escrita o no existe");
        }

    }

    public static void escribirAppsCSV(List<App> lista, String directorio) {
        for (App app : lista) {
            try {
                Files.write(Paths.get(directorio + "/" + app.getNombre() + ".csv"), app.toString().getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            } catch (IOException ex) {
                System.out.println("Error creando el fichero");
            }
        }
    }
    
    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);
        try {
            Files.copy(origen, destino);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }
    }
    
    public static List<String> guardarNombresFicheros(File file){
        List<String> nombresFicheros = new ArrayList<>();
        
        if (file.isDirectory()){
            File[] listaHijos = file.listFiles();
            for (File fichero : listaHijos) {
                if (fichero.isFile()){
                    nombresFicheros.add(fichero.getName());
                }
            }
        }
        return nombresFicheros;
    }
    
    public static void escribirAppsTXT(List<App> lista, String directorio) {
        for (App app : lista) {
            try {
                Files.write(Paths.get(directorio + "/" + app.getNombre() + ".txt"), app.toString().getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            } catch (IOException ex) {
                System.out.println("Error creando el fichero");
            }
        }
    }
    
}
