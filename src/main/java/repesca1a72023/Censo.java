/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repesca1a72023;

/**
 *
 * @author FX506
 */
public class Censo {
    
   private String codigo;
   private String nombreInstalacion;
   private String provincia;
   private String municipio;
   private String nombreVia;
   private String cp;
   private String espacioDepor;

    public Censo(String codigo, String nombreInstalacion, String provincia, String municipio, String nombreVia, String cp, String espacioDepor) {
        this.codigo = codigo;
        this.nombreInstalacion = nombreInstalacion;
        this.provincia = provincia;
        this.municipio = municipio;
        this.nombreVia = nombreVia;
        this.cp = cp;
        this.espacioDepor = espacioDepor;
    }

    //sin cp
    public Censo(String codigo, String nombreInstalacion, String provincia, String municipio, String nombreVia, String espacioDepor) {
        this.codigo = codigo;
        this.nombreInstalacion = nombreInstalacion;
        this.provincia = provincia;
        this.municipio = municipio;
        this.nombreVia = nombreVia;
        this.espacioDepor = espacioDepor;
    }

    public Censo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreInstalacion() {
        return nombreInstalacion;
    }

    public void setNombreInstalacion(String nombreInstalacion) {
        this.nombreInstalacion = nombreInstalacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEspacioDepor() {
        return espacioDepor;
    }

    public void setEspacioDepor(String espacioDepor) {
        this.espacioDepor = espacioDepor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Censo{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombreInstalacion=").append(nombreInstalacion);
        sb.append(", provincia=").append(provincia);
        sb.append(", municipio=").append(municipio);
        sb.append(", nombreVia=").append(nombreVia);
        sb.append(", cp=").append(cp);
        sb.append(", espacioDepor=").append(espacioDepor);
        sb.append('}');
        return sb.toString();
    }
   
   
    
}
