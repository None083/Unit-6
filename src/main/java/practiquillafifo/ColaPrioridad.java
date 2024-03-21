/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiquillafifo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author noelia
 */
public class ColaPrioridad {

    private List<ElementoPrioridad> listaElementos;
    private int numMaximo;

    public ColaPrioridad(int numMaximo) {
        this.listaElementos = new ArrayList<>();
        this.numMaximo = numMaximo;
    }

    public List<ElementoPrioridad> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(List<ElementoPrioridad> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public int getNumMaximo() {
        return numMaximo;
    }

    public void setNumMaximo(int numMaximo) {
        this.numMaximo = numMaximo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColaPrioridad{");
        sb.append("listaElementos=").append(listaElementos);
        sb.append(", numMaximo=").append(numMaximo);
        sb.append('}');
        return sb.toString();
    }

//    public void añadirElemento(ElementoPrioridad elemento) {
//        
//        if (this.listaElementos.size() != this.numMaximo) {
//            
//            this.listaElementos.add(elemento);
//            
//            if (elemento.getPrioridad() > this.listaElementos.get(0).getPrioridad()) {
//                
//                sacarElemento();
//                this.listaElementos.add(elemento);
//            }
//        }
//    }
    public void añadirElemento(ElementoPrioridad elemento) {

        if (listaElementos.isEmpty()) {
            
            this.listaElementos.add(elemento);
            
        } else if (this.listaElementos.size() != this.numMaximo) {
            
            this.listaElementos.add(elemento);
            Collections.sort(listaElementos);
            
        } else {
            
            if (elemento.getPrioridad() > this.listaElementos.get(listaElementos.size()-1).getPrioridad()) {
                this.listaElementos.remove(listaElementos.size()-1);
                this.listaElementos.add(elemento);
                Collections.sort(listaElementos);
            }
        }
    }

    public void sacarElemento() {
        if (this.listaElementos.size() != this.numMaximo) {
            this.listaElementos.remove(this.listaElementos.get(0));
        }
    }

}
