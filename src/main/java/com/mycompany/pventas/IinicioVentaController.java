/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pventas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author carlii
 */
@Controller
public class IinicioVentaController {
       @RequestMapping(method = RequestMethod.GET, value = "/InicioLogin.htm")
    public String AltaCliente(Model modelo)
    {
        System.out.println("Alta cliente");
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/Inicio_Venta.htm")
    public String InicioVentas(Model modelo)
    {
        System.out.println("Registro de ventas");
        return "PaginaVentas";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/Mostrar_clientes.htm")
    public String ShowClientes(Model modelo)
    {
        System.out.println("client");
        return "ShowClient";
    }
}
