/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilacola;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        //Pila
        Pila<Integer> pila = new Pila<>(5);
        
        pila.anyadirElemento(1);
        pila.anyadirElemento(2);
        pila.anyadirElemento(3);
        pila.anyadirElemento(4);
        pila.anyadirElemento(5);
        pila.anyadirElemento(6);
        
        System.out.println("Pila llena: " + pila.estaLlena());
        
        System.out.println("Número de elementos en la pila: " + pila.numElementos());
        
        System.out.println("Elemento sacado de la pila: " + pila.sacarElemento());
        System.out.println("Elemento sacado de la pila: " + pila.sacarElemento());
        System.out.println("Elemento sacado de la pila: " + pila.sacarElemento());
        System.out.println("Elemento sacado de la pila: " + pila.sacarElemento());
        System.out.println("Elemento sacado de la pila: " + pila.sacarElemento());
        
        System.out.println("Pila vacía: " + pila.estaVacia());
        
        //Cola
        Cola<String> cola = new Cola<>(5);

        cola.anyadirElemento("Elemento 1");
        cola.anyadirElemento("Elemento 2");
        cola.anyadirElemento("Elemento 3");

        System.out.println(cola.toString());

        System.out.println("Sacar elemento: " + cola.sacarElemento());
        System.out.println("Sacar elemento: " + cola.sacarElemento());

        System.out.println(cola.toString());
        
    }
    
}
