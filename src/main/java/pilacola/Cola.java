/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilacola;

/**
 *
 * @author noelia
 */
public class Cola<T> extends PilaCola<T> {

    public Cola(int tamanyoMax) {
        super(tamanyoMax);
    }

    public T sacarElemento(){
        if (!estaVacia()) {
            return this.lista.remove(0);
        }
        return null;
    }
    
}
