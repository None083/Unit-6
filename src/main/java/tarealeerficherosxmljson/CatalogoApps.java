/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealeerficherosxmljson;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author noelia
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CatalogoApps {
    
    @XmlElementWrapper(name = "catalogoApps")
    @XmlElement(name = "app")
    
    private List<App> catalogoApps;
    private String descripcion;

    public List<App> getCatalogoApps() {
        return catalogoApps;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCatalogoApps(List<App> catalogoApps) {
        this.catalogoApps = catalogoApps;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
    
}
