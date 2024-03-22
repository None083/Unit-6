/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7c;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author noelia
 */
public class Persona {
    
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private LocalDate fecNacim;
    private boolean jubilado;
    private String ciudad;

    public Persona(String id, String nombre, String apellido, String email, String genero, LocalDate fecNacim, boolean jubilado, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.fecNacim = fecNacim;
        this.jubilado = jubilado;
        this.ciudad = ciudad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getFecNacim() {
        return fecNacim;
    }

    public boolean isJubilado() {
        return jubilado;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", genero=").append(genero);
        sb.append(", fecNacim=").append(fecNacim);
        sb.append(", jubilado=").append(jubilado);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }
    
    public static Set<String> tiposGenero(List<Persona> listaPersonas) {
        Set<String> setGeneros = new HashSet<>();
        
        for (Persona p : listaPersonas) {
            setGeneros.add(p.getGenero());
        }
        return setGeneros;
    }
    
    public static Map<String, Integer> numPersonasGenero(List<Persona> listaPersonas) {
        Map<String, Integer> mapPersonasGenero = new HashMap<>();
        
        for (Persona p : listaPersonas) {
            
            if (mapPersonasGenero.containsKey(p.getGenero())) {
                mapPersonasGenero.put(p.getGenero(), mapPersonasGenero.get(p.getGenero()) + 1);
            }else{
                mapPersonasGenero.put(p.getGenero(), 1);
            }
        }
        return mapPersonasGenero;
    }
    
}
