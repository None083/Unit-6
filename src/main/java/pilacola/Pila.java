/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilacola;

/**
 *
 * @author noelia
 */
public class Pila<T> extends PilaCola<T> {

    public Pila(int tamanyoMax) {
        super(tamanyoMax);
    }

    @Override
    public T sacarElemento() {
        return super.lista.remove(super.numElementos() - 1);
    }

}
