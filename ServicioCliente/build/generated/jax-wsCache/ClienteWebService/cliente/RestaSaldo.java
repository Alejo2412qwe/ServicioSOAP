
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para restaSaldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="restaSaldo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numActual" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="numIngresado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restaSaldo", propOrder = {
    "numActual",
    "numIngresado"
})
public class RestaSaldo {

    protected double numActual;
    protected double numIngresado;

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
     * Obtiene el valor de la propiedad numIngresado.
     * 
     */
    public double getNumIngresado() {
        return numIngresado;
    }

    /**
     * Define el valor de la propiedad numIngresado.
     * 
     */
    public void setNumIngresado(double value) {
        this.numIngresado = value;
    }

}
