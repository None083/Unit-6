/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiquillafifo;

import java.util.Objects;

/**
 *
 * @author noelia
 */
public class ElementoPrioridad<T> implements Comparable<ElementoPrioridad> {
    
    private T elemento;
    private int prioridad;

    public ElementoPrioridad(T elemento, int prioridad) {
        this.elemento = elemento;
        if(prioridad < 0 || prioridad > 20){
            throw new IllegalArgumentException("El número no puede ser negativo ni mayor a 20");
        }
        this.prioridad = prioridad;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.prioridad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ElementoPrioridad<?> other = (ElementoPrioridad<?>) obj;
        return this.prioridad == other.prioridad;
    }

    

    @Override
    public int compareTo(ElementoPrioridad o) {
        return Integer.compare(o.prioridad, this.prioridad); //si pongo los elementtos al reves me ordena de mayor a menor
    }

    
    
    
    
}
