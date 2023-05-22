
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearCliente_QNAME = new QName("http://cliente/", "crearCliente");
    private final static QName _CrearClienteResponse_QNAME = new QName("http://cliente/", "crearClienteResponse");
    private final static QName _Login_QNAME = new QName("http://cliente/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://cliente/", "loginResponse");
    private final static QName _RestaSaldo_QNAME = new QName("http://cliente/", "restaSaldo");
    private final static QName _RestaSaldoResponse_QNAME = new QName("http://cliente/", "restaSaldoResponse");
    private final static QName _SumaSaldo_QNAME = new QName("http://cliente/", "sumaSaldo");
    private final static QName _SumaSaldoResponse_QNAME = new QName("http://cliente/", "sumaSaldoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearCliente }
     * 
     */
    public CrearCliente createCrearCliente() {
        return new CrearCliente();
    }

    /**
     * Create an instance of {@link CrearClienteResponse }
     * 
     */
    public CrearClienteResponse createCrearClienteResponse() {
        return new CrearClienteResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link RestaSaldo }
     * 
     */
    public RestaSaldo createRestaSaldo() {
        return new RestaSaldo();
    }

    /**
     * Create an instance of {@link RestaSaldoResponse }
     * 
     */
    public RestaSaldoResponse createRestaSaldoResponse() {
        return new RestaSaldoResponse();
    }

    /**
     * Create an instance of {@link SumaSaldo }
     * 
     */
    public SumaSaldo createSumaSaldo() {
        return new SumaSaldo();
    }

    /**
     * Create an instance of {@link SumaSaldoResponse }
     * 
     */
    public SumaSaldoResponse createSumaSaldoResponse() {
        return new SumaSaldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente/", name = "crearCliente")
    public JAXBElement<CrearCliente> createCrearCliente(CrearCliente value) {
        return new JAXBElement<CrearCliente>(_CrearCliente_QNAME, CrearCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente/", name = "crearClienteResponse")
    public JAXBElement<CrearClienteResponse> createCrearClienteResponse(CrearClienteResponse value) {
        return new JAXBElement<CrearClienteResponse>(_CrearClienteResponse_QNAME, CrearClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestaSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente/", name = "restaSaldo")
    public JAXBElement<RestaSaldo> createRestaSaldo(RestaSaldo value) {
        return new JAXBElement<RestaSaldo>(_RestaSaldo_QNAME, RestaSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestaSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente/", name = "restaSaldoResponse")
    public JAXBElement<RestaSaldoResponse> createRestaSaldoResponse(RestaSaldoResponse value) {
        return new JAXBElement<RestaSaldoResponse>(_RestaSaldoResponse_QNAME, RestaSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumaSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente/", name = "sumaSaldo")
    public JAXBElement<SumaSaldo> createSumaSaldo(SumaSaldo value) {
        return new JAXBElement<SumaSaldo>(_SumaSaldo_QNAME, SumaSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumaSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente/", name = "sumaSaldoResponse")
    public JAXBElement<SumaSaldoResponse> createSumaSaldoResponse(SumaSaldoResponse value) {
        return new JAXBElement<SumaSaldoResponse>(_SumaSaldoResponse_QNAME, SumaSaldoResponse.class, null, value);
    }

}
