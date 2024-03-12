/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leerficherovehiculos;


/**
 *
 * @author noelia
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String año;
    private String bastidor;
    private String color;
    private String matricula;

    public Vehiculo(String marca, String modelo, String año, String bastidor, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.bastidor = bastidor;
        this.color = color;
        this.matricula = matricula;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", a\u00f1o=").append(año);
        sb.append(", bastidor=").append(bastidor);
        sb.append(", color=").append(color);
        sb.append(", matricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }

}
