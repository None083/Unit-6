/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tarealeerficherosxmljson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) throws JAXBException, IOException {
        
        List<App> listaApps = crearListaApps(50);
        
        //Generar archivo XML
        CatalogoApps catalogoApps = new CatalogoApps();
        catalogoApps.setCatalogoApps(listaApps);
        catalogoApps.setDescripcion("Catalogo de apps");
        UtilidadesFicheros.generarXMLCatalogo(catalogoApps, "appsXML.xml");
        
        //Generar archivo JSON
        UtilidadesFicheros.generarJSONCatalogo(catalogoApps, "appsJSON.json");
        
        //Generar un archivo JSON por App
        UtilidadesFicheros.crearDirectorio("./aplicacionesJSON");
        UtilidadesFicheros.generarJSONPorApp(listaApps, "./aplicacionesJSON");
        
        //Leer XML
        CatalogoApps catalogoAppsDesdeXML = UtilidadesFicheros.leerXML("appsXML.xml");
        catalogoAppsDesdeXML.getCatalogoApps().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");
        
        //Leer JSON
        CatalogoApps catalogoAppsDesdeJSON = UtilidadesFicheros.leerJSON("appsJSON.json");
        catalogoAppsDesdeJSON.getCatalogoApps().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");

    }
    
    public static List<App> crearListaApps(int numApps){
        List<App> listaApps = new ArrayList<>();
        
        for (int i = 0; i < numApps; i++) {
            listaApps.add(new App());
        }
        return listaApps;
    }
    
}
