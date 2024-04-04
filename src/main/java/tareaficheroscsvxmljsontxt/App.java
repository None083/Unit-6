/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaficheroscsvxmljsontxt;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.RandomStringUtils;

@XmlRootElement(name = "mueble")
@XmlAccessorType(XmlAccessType.FIELD)
public class App {
    
    private int codigoUnico;
    private String nombre;
    private String descrip;
    private double kb;
    private int numDescarga;
    private static int contador;

    public App() {
        contador++;
        this.codigoUnico = contador;
        
        this.nombre = "app" + contador + RandomStringUtils.randomAlphabetic(1).toLowerCase();
        
        Random random = new Random();
        int numRandom = random.nextInt(0, 10);
        this.descrip = conjuntoDescripciones()[numRandom];

        DoubleStream doubleStream = random.doubles(1, 100.0, 1024.0);
        this.kb = doubleStream.findFirst().getAsDouble();
        
        IntStream intStream = random.ints(1, 0, 50000);
        this.numDescarga = intStream.findFirst().getAsInt();
    }

    public App(int codigoUnico, String nombre, String descrip, double kb, int numDescarga) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.descrip = descrip;
        this.kb = kb;
        this.numDescarga = numDescarga;
    }
    
    private String[] conjuntoDescripciones(){
        String[] conjuntoDescrip = new String[10];
        
        conjuntoDescrip[0] = "Aplicación de fitness";
        conjuntoDescrip[1] = "Plataforma de meditación";
        conjuntoDescrip[2] = "App de aprendizaje de idiomas";
        conjuntoDescrip[3] = "Servicio de entrega de alimentos";
        conjuntoDescrip[4] = "Aplicación de edición de fotos";
        conjuntoDescrip[5] = "Plataforma de planificación de viajes";
        conjuntoDescrip[6] = "App de gestión de finanzas";
        conjuntoDescrip[7] = "Herramienta de productividad";
        conjuntoDescrip[8] = "Red social centrada en la fotografía";
        conjuntoDescrip[9] = "App de música en streaming";

        return conjuntoDescrip;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getKb() {
        return kb;
    }

    public void setKb(double kb) {
        this.kb = kb;
    }

    public int getNumDescarga() {
        return numDescarga;
    }

    public void setNumDescarga(int numDescarga) {
        this.numDescarga = numDescarga;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        App.contador = contador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigoUnico);
        sb.append(";").append(nombre);
        sb.append(";").append(descrip);
        sb.append(";").append(kb);
        sb.append(";").append(numDescarga);
        return sb.toString();
    }
    
    
    
}
