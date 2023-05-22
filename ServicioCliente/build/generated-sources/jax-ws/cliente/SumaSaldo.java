
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sumaSaldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sumaSaldo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numActual" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="numNuevo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumaSaldo", propOrder = {
    "numActual",
    "numNuevo"
})
public class SumaSaldo {

    protected double numActual;
    protected double numNuevo;

    /**
     * Obtiene el valor de la propiedad numActual.
     * 
     */
    public double getNumActual() {
        return numActual;
    }

    /**
     * Define el valor de la propiedad numActual.
     * 
     */
    public void setNumActual(double value) {
        this.numActual = value;
    }

    /**
     * Obtiene el valor de la propiedad numNuevo.
     * 
     */
    public double getNumNuevo() {
        return numNuevo;
    }

    /**
     * Define el valor de la propiedad numNuevo.
     * 
     */
    public void setNumNuevo(double value) {
        this.numNuevo = value;
    }

}
