/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package practiquillafifo;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public record Paciente(String numHistorialClinico, String nombre, 
        String apellidos, LocalDate fechaNacimiento) {

}
