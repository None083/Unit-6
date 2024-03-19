/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tb7expresionesreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author FX506
 */
public class Patrones {
    
    public static void patronAPN(String cadena){
        String regex = "AP-\\d{1,2}";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);
        
        while (matcher.find()) {
            System.out.println("Patrón encontrado: " + matcher.group());
        }
    }
    
    public static boolean patronAPNExacto(String cadena){
        return cadena.matches("^AP-\\d{1,2}$");
    }
    
    public static boolean patronMatricula(String cadena){
        return cadena.matches("^\\d{4}[A-Z]{3}$");
    }
    
    public static void patronLetraNumero(String cadena){
        String regex = "([a-zA-Z]\\d)+";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);
        
        while (matcher.find()) {
            System.out.println("Patrón encontrado: " + matcher.group());
        }
    }
    
    public static boolean patronCP(String cadena){
        return cadena.matches("^\\d{5}$");
    }
    
    public static boolean patronIPasen(String cadena){
        return cadena.matches("^[a-zA-Z]{7,8}\\d{3,4}$");
    }
    
    public static boolean patronCadena5SinFRK(String cadena){
        return cadena.matches("^[^FRK]{5}$");
    }
    
    public static boolean patronHardWareSoftware(String cadena){
        Pattern pattern = Pattern.compile("(hardware|software)", Pattern.CASE_INSENSITIVE);//insensible a mayusculas y minusculas
        Matcher matcher = pattern.matcher(cadena);
        return matcher.find();
    }
    
    
    
}
