/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LaptopSA
 */
public class ClienteService {

    public static List<Cliente> clientes = new ArrayList<>();

    public ClienteService() {
    }

    public String crearCliente(String usuario, String contra, double saldo) {

        Cliente c = new Cliente();
        c.setIdCLiente(clientes.size() + 1);
        c.setUserCliente(usuario);
        c.setPassCliente(contra);
        c.setSaldoInicial(saldo);
        clientes.add(c);

        return "SE AGREGO EL CLIENTE CORRECTAMENTE";
    }

}
