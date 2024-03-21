/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programamefurbo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class CasoPrueba {

    private int numEquipos;
    private int plazasUEFA;
    private int plazasAFC;
    private int plazasCAF;
    private int plazasCONCACAF;
    private int plazasCONMEBOL;
    private int plazasOFC;

    public CasoPrueba(int numEquipos, int plazasUEFA, int plazasAFC, int plazasCAF, int plazasCONCACAF, int plazasCONMEBOL, int plazasOFC) {
        if (numEquipos > 1 && numEquipos < 128) {
            this.numEquipos = numEquipos;
            int totalPlazas = plazasUEFA + plazasAFC + plazasCAF + plazasCONCACAF + plazasCONMEBOL + plazasOFC;
            if (totalPlazas <= this.numEquipos) {
                this.plazasUEFA = plazasUEFA;
                this.plazasAFC = plazasAFC;
                this.plazasCAF = plazasCAF;
                this.plazasCONCACAF = plazasCONCACAF;
                this.plazasCONMEBOL = plazasCONMEBOL;
                this.plazasOFC = plazasOFC;
            } else {
                throw new IllegalArgumentException("La suma de las plazas no debe superar la del numero de equipos permitido");
            }

        } else {
            throw new IllegalArgumentException("El número de equipos debe estar entre 1 y 128");
        }
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public int getPlazasUEFA() {
        return plazasUEFA;
    }

    public int getPlazasAFC() {
        return plazasAFC;
    }

    public int getPlazasCAF() {
        return plazasCAF;
    }

    public int getPlazasCONCACAF() {
        return plazasCONCACAF;
    }

    public int getPlazasCONMEBOL() {
        return plazasCONMEBOL;
    }

    public int getPlazasOFC() {
        return plazasOFC;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CasoPrueba{");
        sb.append("numEquipos=").append(numEquipos);
        sb.append(", plazasUEFA=").append(plazasUEFA);
        sb.append(", plazasAFC=").append(plazasAFC);
        sb.append(", plazasCAF=").append(plazasCAF);
        sb.append(", plazasCONCACAF=").append(plazasCONCACAF);
        sb.append(", plazasCONMEBOL=").append(plazasCONMEBOL);
        sb.append(", plazasOFC=").append(plazasOFC);
        sb.append('}');
        return sb.toString();
    }

    public static List<CasoPrueba> pedirCasos() {
        List<CasoPrueba> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero de casos");
        int numCasos = teclado.nextInt();
        
        for (int i = 0; i < numCasos; i++) {
            System.out.println("Introduce el numero máximo de equipos");
            int numEquipos = teclado.nextInt();
            System.out.println("Introduce el numero de plazas para la UEFA");
            int plazasUEFA = teclado.nextInt();
            System.out.println("Introduce el numero de plazas para la AFC");
            int plazasAFC = teclado.nextInt();
            System.out.println("Introduce el numero de plazas para la CAF");
            int plazasCAF = teclado.nextInt();
            System.out.println("Introduce el numero de plazas para la CONCACAF");
            int plazasCONCACAF = teclado.nextInt();
            System.out.println("Introduce el numero de plazas para la CONMEBOL");
            int plazasCONMEBOL = teclado.nextInt();
            System.out.println("Introduce el numero de plazas para la OFC");
            int plazasOFC = teclado.nextInt();
            lista.add(new CasoPrueba(numEquipos, plazasUEFA, plazasAFC, plazasCAF, plazasCONCACAF, plazasCONMEBOL, plazasOFC));
        }
        return lista;
    }
    
    public static List<Integer> gruposRepesca(List<CasoPrueba> listaCasos){
        List<Integer> listaRepesca = new ArrayList<>();
        int totalGrupos = 0;
        for (CasoPrueba c : listaCasos) {
            totalGrupos = c.getPlazasAFC() + c.getPlazasCAF() + c.getPlazasCONCACAF() 
                    + c.getPlazasCONMEBOL() + c.getPlazasOFC() + c.getPlazasUEFA();
            listaRepesca.add(totalGrupos);
        }
        return listaRepesca;
    }
    
    public static void guardarResultados(List<Integer> listaRepesca) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultados.txt"))) {
        for (Integer i : listaRepesca) {
            writer.write(i.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
