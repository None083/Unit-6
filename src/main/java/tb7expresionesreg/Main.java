/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tb7expresionesreg;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Patrones AP-Nº");
        Patrones.patronAPN("AP-7, AP-77, AP-777");

        System.out.println("Matricula 1234ABC: " + Patrones.patronMatricula("1234ABC"));
        System.out.println("Matricula 123456ABC: " + Patrones.patronMatricula("123456ABC"));

        System.out.println("Patrones letra-numero");
        Patrones.patronLetraNumero("e3, e3r4, q1w2d4, 11aa1a");

        System.out.println("Código Postal 29680: " + Patrones.patronCP("29680"));
        System.out.println("Código Postal 296801: " + Patrones.patronCP("296801"));

        System.out.println("Usuario iPasen: " + Patrones.patronIPasen("npergon914"));

        System.out.println("Cadena de 5 sin F, R, K: " + Patrones.patronCadena5SinFRK("HOLI9"));
        System.out.println("Cadena de 5 sin F, R, K: " + Patrones.patronCadena5SinFRK("HOLIK"));

        System.out.println("Cadena de 5 sin F, R, K: "
                + Patrones.patronHardWareSoftware("""
                el hardware es la parte física del dispositivo, esto es, 
                sus accesorios, mientras que el software comprende el 
                conjunto de códigos del sistema operativo
                                                  """));

    }
}
