/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package expresionesregulares;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author noelia
 */
public class ejemplosexpresionesregulares {

    public static void main(String[] args) {
        //Todos los archivos quwe están en la raiz del proyecto 
        //son accsibles directamente con su nombre
        List<String> lineasFichero;
        String fichero = "ssh_config";
        System.out.println("Leyendo el fichero " + fichero);
        lineasFichero = leerFichero(fichero);
        lineasFichero.forEach(System.out::println);
        
        //Mostrar numero de palabra por linea
        lineasFichero.forEach(linea->{
            int numeroPalabras = contarPalabrasPorLineas(linea);
            System.out.println(linea + " --> " + numeroPalabras);
        });
            System.out.println("--------------------------------------------");
        //Mostrar numero de palabra concreta
        lineasFichero.forEach(linea->{
            int numeroPalabras = contarPalabraConcretaPorLinea("is", linea);
            System.out.println(linea + " --> " + numeroPalabras);
        });
        
    }
    
    public static int contarPalabraConcretaPorLinea(String palabra, String linea){
        String regex = "\\b"+palabra+"\\b";
        //La clase pattern crea un obeto con la representacion compilada
        //dela expresion regular.
        //Permite crear un objeto matcher -- Pattern + regex (string)
        Pattern patron = Pattern.compile(regex);
        //Matcher se crea a partir del objeto pattern
        //permite hacer operaciones usando el regex sobre el string
        //matches() si cumple el patron
        //find() encontrar partes de string que cumplen el patron
        Matcher buscador = patron.matcher(linea);
        int contador = 0;
        
        while (buscador.find()) {            
            contador++;
        }
        
        return contador;
    }
    
    public static int contarPalabrasPorLineas(String linea){
        //En java para escapar la barra invertida hay que añadir otra
        //barra adicional
        linea = linea.trim();
        String[] array = linea.split("\\s+");
        return array.length;
    }
    
    //metodo para leer un fichero de texto plano
    //usa la clase files
    
    public static List<String> leerFichero(String nombreFichero){
        List lista = new ArrayList<>();
        try {
            lista = Files.readAllLines(Paths.get(nombreFichero));
        } catch (IOException ex) {
            System.out.println("Error accediendo a " + nombreFichero);
        }
        return lista;
    }
    
}
