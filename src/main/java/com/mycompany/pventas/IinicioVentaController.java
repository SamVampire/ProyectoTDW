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
}
