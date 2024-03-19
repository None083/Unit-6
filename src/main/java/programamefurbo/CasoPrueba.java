/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programamefurbo;

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
            }else{
                throw new IllegalArgumentException("La suma de las plazas no debe superar la del numero de equipos permitido");
            }

        } else {
            throw new IllegalArgumentException("El número de equipos debe estar entre 1 y 128");
        }
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public int getPlazasUEFA() {
        return plazasUEFA;
    }

    public void setPlazasUEFA(int plazasUEFA) {
        this.plazasUEFA = plazasUEFA;
    }

    public int getPlazasAFC() {
        return plazasAFC;
    }

    public void setPlazasAFC(int plazasAFC) {
        this.plazasAFC = plazasAFC;
    }

    public int getPlazasCAF() {
        return plazasCAF;
    }

    public void setPlazasCAF(int plazasCAF) {
        this.plazasCAF = plazasCAF;
    }

    public int getPlazasCONCACAF() {
        return plazasCONCACAF;
    }

    public void setPlazasCONCACAF(int plazasCONCACAF) {
        this.plazasCONCACAF = plazasCONCACAF;
    }

    public int getPlazasCONMEBOL() {
        return plazasCONMEBOL;
    }

    public void setPlazasCONMEBOL(int plazasCONMEBOL) {
        this.plazasCONMEBOL = plazasCONMEBOL;
    }

    public int getPlazasOFC() {
        return plazasOFC;
    }

    public void setPlazasOFC(int plazasOFC) {
        this.plazasOFC = plazasOFC;
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
    
    public static void pedirCasos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de casos");
        int numCasos = teclado.nextInt();
        for (int i = 0; i < numCasos; i++) {
            
        }
    }
    
    

}
