/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package cliente;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Cliente;
import modelo.ClienteService;

/**
 *
 * @author LaptopSA
 */
@WebService(serviceName = "ClienteWebService")
public class ClienteWebService {

    ClienteService cs = new ClienteService();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearCliente")
    public String crearCliente(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena, @WebParam(name = "saldoInicial") double saldo) {
        //TODO write your implementation code here:
        return cs.crearCliente(usuario, contrasena, saldo);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {

        boolean ban = false;
        for (int i = 0; i < ClienteService.clientes.size(); i++) {
            if (ClienteService.clientes.get(i).getUserCliente().equals(username) && ClienteService.clientes.get(i).getPassCliente().equals(password)) {
                ban = true;
                System.out.println("SE HA INICIADO SESION");
            }
        }
        return ban;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumaSaldo")
    public Double operation(@WebParam(name = "numActual") double numActual, @WebParam(name = "numNuevo") double numNuevo) {
        double numero = numActual + numNuevo;
        return numero;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "restaSaldo")
    public Double restaSaldo(@WebParam(name = "numActual") double numActual, @WebParam(name = "numIngresado") double numIngresado) {
        double numero = numActual - numIngresado;
        return numero;
    }

}
