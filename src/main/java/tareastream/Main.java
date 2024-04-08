/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tareastream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author noelia
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Persona> listaPersonas = new ArrayList<>();
        UtilidadesFicheros.lecturaFicheroPersonas("personas.csv", listaPersonas);
        for (Persona p : listaPersonas) {
            System.out.println(p);
            System.out.println("Edad: " + p.getEdad());
        }
        
        System.out.println("----------Personas nacidas en 1985, orden email-------------------");
        List<Persona> listaNacidos1985 = MetodosStream.nacidos1985OrdenEmail(listaPersonas);
        listaNacidos1985.forEach(System.out::println);
        
        System.out.println("----------Emails de Non-binary y jubilado, orden alfabetico------------");
        Set<String> setEmails = MetodosStream.obtenerEmailsNonBinaryJubilado(listaPersonas);
        setEmails.forEach(System.out::println);
        
        System.out.println("Número ciudades diferentes: " + MetodosStream.obtenerNumeroCiudades(listaPersonas));
        
        System.out.println("¿Hay alguna Zondra?: " + MetodosStream.algunaZondra(listaPersonas));
        
        System.out.println("¿Hay algún esteponero?: " + MetodosStream.algunEsteponero(listaPersonas));
        
        System.out.println("Número de apellidos terminados en cia: " + MetodosStream.apellidoCia(listaPersonas));
        
        System.out.println("----------Lista con todas las edades-------------------");
        List<Integer> listaEdades = MetodosStream.obtenerEdades(listaPersonas);
        for (Integer edad : listaEdades) {
            System.out.print(edad + ", ");
        }
        
        System.out.println("Suma total de todas las edades: " + MetodosStream.sumaEdades(listaPersonas));
        
        System.out.println("Media de edad: " + MetodosStream.mediaEdades(listaPersonas));
        
        System.out.println("----------Todos los nombres concatenados-------------------\n"
                + MetodosStream.nombresConcatenados(listaPersonas));
        
    }
}
