/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilacola;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public abstract class PilaCola<T> {
    
    private final int tamanyoMax;
    protected final List<T> lista;

    public PilaCola(int tamanyoMax) {
        this.tamanyoMax = tamanyoMax;
        this.lista = new ArrayList<>();
    }
    
    public List<T> getLista() {
        return lista;
    }

    public void anyadirElemento(T elemento){
        if (!estaLlena()) {
            this.lista.add(elemento);
        }
    }

    public abstract T sacarElemento();

    public boolean estaVacia(){
        return this.lista.isEmpty();
    }

    public boolean estaLlena(){
        return numElementos() == getTamanyoMax();
    }

    @Override
    public String toString() {
        return "Cola{" + "lista=" + lista + '}';
    }

    public int numElementos(){
        return this.lista.size();
    }

    public int getTamanyoMax() {
        return tamanyoMax;
    }
    
}
