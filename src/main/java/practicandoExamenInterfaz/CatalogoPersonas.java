/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicandoExamenInterfaz;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FX506
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CatalogoPersonas {
    
    @XmlElementWrapper(name = "personas")
    @XmlElement(name = "persona")
    
    private List<Persona> personas;
    private String descripcion;

    public List<Persona> getPersonas() {
        return personas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
