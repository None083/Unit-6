/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoExamenInterfaz;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 *
 * @author FX506
 */
public class Persona {
    
    public String nombre;
    public String apellido;
    public int edad;
    @JsonProperty("fecha_de_nacimiento")
    public LocalDate fechaNacimiento;
    public double altura;

    public Persona(String nombre, String apellido, int edad, LocalDate fechaNacimiento, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
    }

    public Persona() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", edad=").append(edad);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
