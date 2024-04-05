/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealeerficherosxmljson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class ProgramaLeerJSON {

    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        
        //Mostrar ficheros en ./aplicacionesJSON
        List<String> listaNombresFicheros = UtilidadesFicheros.guardarNombresFicheros(
                new File("./aplicacionesJSON"));
        listaNombresFicheros.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");
        
        //Preguntar al usuario por un fichero
        System.out.println("¿Qué fichero desea leer?");
        String fichero = teclado.nextLine();
        App app = UtilidadesFicheros.leerJSONEscogido("./aplicacionesJSON/" + fichero);
        System.out.println(app);
        
        //Borrar fichero
        System.out.println("---------Borrando fichero---------");
        UtilidadesFicheros.borrarElemento("./aplicacionesJSON/" + fichero);
        System.out.println("¿Existe " + fichero + "? "
                + Files.exists(Paths.get("./aplicacionesJSON/" + fichero)));
        
    }
    
}
