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
public class ControllerClass {
    

    
    @RequestMapping(method = RequestMethod.GET, value = "/Alta_Clientes.htm")
    public String AltaCliente(Model modelo)
    {
        System.out.println("Alta cliente");
        return "AltaCliente";
    }
    
     @RequestMapping(method = RequestMethod.GET, value = "/Alta_Productos.htm")
    public String AltaProd(Model modelo)
    {
        System.out.println("Alta productos");
        return "AltaProductos";
    }
     @RequestMapping(method = RequestMethod.GET, value = "/Inventario.htm")
    public String Inventario(Model modelo)
    {
        System.out.println("Inventario");
        return "Inventario";
    }
  @RequestMapping(method = RequestMethod.GET, value = "/Proceso_Venta.htm")
    public String ventas(Model modelo)
    {
        System.out.println("Inventario");
        return "ventas";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/PaginaClientes.htm")
        public String Cliente(Model modelo)
    {
        System.out.println("PgClientes");
        return "Clientes";
    }
        
    }

