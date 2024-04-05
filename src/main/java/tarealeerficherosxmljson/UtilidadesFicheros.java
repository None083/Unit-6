/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealeerficherosxmljson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author noelia
 */
public class UtilidadesFicheros {

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

    public static void generarXMLCatalogo(CatalogoApps catalogo, String ruta) throws JAXBException {
        JAXBContext contexto = JAXBContext.newInstance(CatalogoApps.class);
        Marshaller serializador = contexto.createMarshaller();
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        serializador.marshal(catalogo, new File(ruta));
    }

    public static void generarJSONCatalogo(CatalogoApps catalogo, String ruta) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapeador.writeValue(new File(ruta), catalogo);
    }

    public static void generarJSONPorApp(List<App> lista, String ruta) throws IOException {
        for (App app : lista) {
            ObjectMapper mapeador = new ObjectMapper();
            mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
            mapeador.writeValue(new File(ruta + "/" + app.getNombre() + ".json"), app);
        }
    }

    public static CatalogoApps leerXML(String ruta) throws JAXBException, FileNotFoundException {
        JAXBContext contexto = JAXBContext.newInstance(CatalogoApps.class);
        Unmarshaller um = contexto.createUnmarshaller();
        return (CatalogoApps) um.unmarshal(new File(ruta));
    }
    
    public static CatalogoApps leerJSON(String ruta) throws IOException{
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        return mapeador.readValue(new File(ruta),CatalogoApps.class);
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
    
    public static App leerJSONEscogido(String fichero) throws IOException{
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        return mapeador.readValue(new File(fichero),App.class);
    }
    
    public static void borrarElemento(String ruta) {
        Path file = Paths.get(ruta);
        try {
            Files.delete(file);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + ruta + " porque no existe");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + ruta);
        }
    }

}
