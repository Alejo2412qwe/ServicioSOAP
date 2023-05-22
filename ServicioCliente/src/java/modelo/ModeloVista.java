/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import cliente.ClienteWebService;
import cliente.ClienteWebService_Service;
import javax.swing.JOptionPane;
import vista.InterfazUsuario;
import vista.Login;
import vista.Registro;

/**
 *
 * @author LaptopSA
 */
public class ModeloVista {

    ClienteWebService_Service servicio = new ClienteWebService_Service();
    ClienteWebService cliente = servicio.getClienteWebServicePort();
    Login l = new Login();
    Registro r = new Registro();
    InterfazUsuario iu = new InterfazUsuario();

    public void inciarControles() {
        l.setVisible(true);
        l.getBtnIngresar().addActionListener(l -> login());
        l.getBtnRegistrar().addActionListener(l -> abrirRegistro());
        r.getBtnRegistrar().addActionListener(l -> registrarCliente());
        r.getBtnCerrar().addActionListener(l -> r.setVisible(false));
        iu.getBtnRealizarTrasaccion().addActionListener(l -> realizarTrasaccion());
    }

    public void abrirRegistro() {
        r.setVisible(true);
        r.getLabelSaldo().setText("100");

    }

    public void login() {
        if (cliente.login(r.getTxtUsuario().getText(), r.getTxtClave().getText())) {
            l.getTxtRespuesta().setText("INICIO DE SESION EXITOSO");
            iu.setVisible(true);
            iu.getLabelUsuario().setText(l.getTxtUsuario().getText());
            iu.getLabelSaldo().setText("100");
        } else {
            l.getTxtRespuesta().setText("USUARIO NO EXISTE");
        }
    }

    public void realizarTrasaccion() {
        if (iu.getBtnRetiro().isSelected()) {
            if (Double.valueOf(iu.getTxtValor().getText()) > Double.parseDouble(iu.getLabelSaldo().getText())) {
                iu.getTxtRespuesta().setText("No se puede realizar la transaccion");
            } else {
                iu.getLabelSaldo().setText(String.valueOf(cliente.restaSaldo(Double.parseDouble(iu.getLabelSaldo().getText()), Double.parseDouble(iu.getTxtValor().getText()))));
                iu.getTxtRespuesta().setText("Retiro Realizado Correctamente");
            }
        }

        if (iu.getBtnDeposito().isSelected()) {
            iu.getLabelSaldo().setText(String.valueOf(cliente.sumaSaldo(Double.parseDouble(iu.getLabelSaldo().getText()), Double.parseDouble(iu.getTxtValor().getText()))));
            iu.getTxtRespuesta().setText("Deposito Realizado Correctamente");
        }
    }

    public void registrarCliente() {
        if (validar()) {
            cliente.crearCliente(r.getTxtUsuario().getText(), r.getTxtClave().getText(), 100);
            r.getTxtRespuestaRegistro().setText("Usuario Registrado con éxito");
        } else {
            r.getTxtRespuestaRegistro().setText("verifique los campos");
        }
    }

    public boolean validar() {
        boolean ban = false;

        if (r.getTxtUsuario().getText().matches("[a-zA-Z]*")) {
            ban = true;
        }

        if (!r.getTxtUsuario().getText().matches("[a-zA-Z]*")) {
            JOptionPane.showMessageDialog(r, "USUARIO INCORRECTO");
        }

        if (r.getTxtClave().getText().matches("[a-zA-Z0-9]*") && r.getTxtClave().getText().equals(r.getTxtClave2().getText())) {
            ban = true;
        }

        if (!r.getTxtClave().getText().matches("[a-zA-Z0-9]*") && !r.getTxtClave().getText().equals(r.getTxtClave2().getText())) {
            JOptionPane.showMessageDialog(r, "CONTRASEÑA INCORRECTA");
        }

        return ban;
    }
}
