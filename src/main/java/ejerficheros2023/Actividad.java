/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerficheros2023;

import java.time.LocalDate;

/**
 *
 * @author FX506
 */
public class Actividad {
    
    private String centro;
    private String codigo;
    private String titulo;
    private String Modalidad;
    private String estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String dirigidoA;

    public Actividad(String centro, String codigo, String titulo, String Modalidad, String estado, LocalDate fechaInicio, LocalDate fechaFin, String dirigidoA) {
        this.centro = centro;
        this.codigo = codigo;
        this.titulo = titulo;
        this.Modalidad = Modalidad;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dirigidoA = dirigidoA;
    }

    public Actividad() {
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDirigidoA() {
        return dirigidoA;
    }

    public void setDirigidoA(String dirigidoA) {
        this.dirigidoA = dirigidoA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActividadFormativa{");
        sb.append("centro=").append(centro);
        sb.append(", codigo=").append(codigo);
        sb.append(", titulo=").append(titulo);
        sb.append(", Modalidad=").append(Modalidad);
        sb.append(", estado=").append(estado);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", dirigidoA=").append(dirigidoA);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
