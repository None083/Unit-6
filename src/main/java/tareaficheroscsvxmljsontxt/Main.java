/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tareaficheroscsvxmljsontxt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author noelia
 */


public class Main {
    
    public static void main(String[] args) throws JAXBException, IOException {
        
        List<App> listaApps = crearListaApps(50);
        
//        for (App app : listaApps) {
//            System.out.println(app);
//        }
        
        //CSV
        UtilidadesFicheros.escribirListaAppCSV(listaApps, "./appscsv/aplicacionestxt.csv");
        
        UtilidadesFicheros.crearDirectorio("./appscsv2");
        UtilidadesFicheros.escribirAppsCSV(listaApps, "./appscsv2");
        
        //XML
        UtilidadesFicheros.crearDirectorio("./appsxml");
        CatalogoApps catalogoApps = new CatalogoApps();
        catalogoApps.setCatalogoApps(listaApps);
        catalogoApps.setDescripcion("Catalogo de apps");
        
        JAXBContext contexto = JAXBContext.newInstance(CatalogoApps.class);
        Marshaller serializador = contexto.createMarshaller();
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        serializador.marshal(catalogoApps, System.out);
        serializador.marshal(catalogoApps, new File("./appsxml/aplicacionesxml.xml"));
        
        //JSON
        UtilidadesFicheros.crearDirectorio("./appsjson");
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapeador.writeValue(new File("./appsjson/aplicacionesjson.json"), catalogoApps);
        
        
        //COPIAS
        UtilidadesFicheros.crearDirectorio("./copias");
        UtilidadesFicheros.copiarFicheros("./appscsv/aplicacionestxt.csv", "./copias/aplicacionestxt.csv");
        UtilidadesFicheros.copiarFicheros("./appsxml/aplicacionesxml.xml", "./copias/aplicacionesxml.xml");
        UtilidadesFicheros.copiarFicheros("./appsjson/aplicacionesjson.json", "./copias/aplicacionesjson.json");
        
        List<String> listaNombresFicheros = UtilidadesFicheros.guardarNombresFicheros(new File("./appscsv2"));
        for (String s : listaNombresFicheros) {
            UtilidadesFicheros.copiarFicheros("./appscsv2/" + s, "./copias/" + s);
        }
        
        //TXT
        UtilidadesFicheros.crearDirectorio("./aplicaciones");
        UtilidadesFicheros.escribirAppsTXT(listaApps, "./aplicaciones");
        
    }
    
    public static List<App> crearListaApps(int numApps){
        List<App> listaApps = new ArrayList<>();
        
        for (int i = 0; i < numApps; i++) {
            listaApps.add(new App());
        }
        return listaApps;
    }
    
}
