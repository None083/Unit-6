/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamefurbo;

import java.util.List;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        List<CasoPrueba> lista = CasoPrueba.pedirCasos();
        List<Integer> listaRepesca = CasoPrueba.gruposRepesca(lista);
        CasoPrueba.guardarResultados(listaRepesca);
        
    }
    
}
