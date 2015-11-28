/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pventas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author carlii
 */
@Controller
public class pruebacontroller {

    @RequestMapping(method = RequestMethod.GET, value = "/Paginaventas.htm")

    public void validaDatos(Model modelo, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();

        out.println("<html>\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                + "        <title>Ventas</title>\n"
                + "        <link href=\"css/Estilos_ventas.css\" rel=\"stylesheet\"  >\n"
                + "        \n"
                + "    <body>\n"
                + "        <div class=\"encabezado\">\n"
                + "            <img src=\"img/ventas.png\">\n"
                + "\n"
                + "        </div>\n"
                + "        <div class=\"encabezadoCenter\">\n"
                + "            <h1>Aseguramos las ventas del mañana</h1>\n"
                + "        </div>\n"
                + "        <div class=\"hora\">\n"
                + "            <script languaje=\"JavaScript\">\n"
                + "\n"
                + "                var mydate = new Date();\n"
                + "                var year = mydate.getYear();\n"
                + "                if (year < 1000)\n"
                + "                    year += 1900;\n"
                + "                var day = mydate.getDay();\n"
                + "                var month = mydate.getMonth();\n"
                + "                var daym = mydate.getDate();\n"
                + "                if (daym < 10)\n"
                + "                    daym = \"0\" + daym;\n"
                + "                var dayarray = new Array(\"Domingo\", \"Lunes\", \"Martes\", \"Miercoles\", \"Jueves\", \"Viernes\", \"Sabado\");\n"
                + "                var montharray = new\n"
                + "                        Array(\"Enero\", \"Febrero\", \"Marzo\", \"Abril\", \"Mayo\", \"Junio\", \"Julio\", \"Agosto\", \"Septiembre\", \"Octubre\", \"Noviembre\", \"Diciembre\");\n"
                + "                document.write(\"<small><font color='ffffff' face='Arial'>\" + dayarray[day] + \" \" + daym + \" de \" + montharray[month] + \" de \" + year + \"</font></small>\");\n"
                + "\n"
                + "            </script>\n"
                + "\n"
                + "        </div>\n"
                + "       \n"
                + "        <div class=\"menu-wrapper\">\n"
                + "            <ul class=\"hmenu\">\n"
                + "                <li><a href=\"#\">Productos</a>\n"
                + "                    <ul class=\"sub-menu\"> \n"
                + "                        <li><form method=\"get\"><a href=\"Inventario.htm\" type=\"submit\">Inventario</a></form></li>\n"
                + "                        <li><form method=\"get\"><a href=\"Alta_Productos.htm\" type=\"submit\">Alta de productos</a></form></li>\n"
                + "                    </ul>\n"
                + "                </li>\n"
                + "                <li><a href=\"#\">Ventas</a>"
                + "                    <ul class=\"sub-menu\"> \n"
                + "                        <li><form method=\"get\"><a href=\"Proceso_Venta.htm\" type=\"submit\">Venta</a></form></li>\n"
                + "                        <li><form method=\"get\"><a href=\"Alta_Clientes.htm\" type=\"submit\">Alta de clientes</a></form></li>\n"
                + "                    </ul>\n"
                + "                </li>\n"
                + "                <li><a href=\"#\">Contacto</a></li>\n"
                + "                <li><form><a href=\"InicioLogin.htm\" type=\"submit\">salir</a></form></li>\n"
                + "            </ul>\n"
                + "        </div>\n"
                + "        <div class=\"enUser\">\n"
                + "            <h3>USUARIO: Carla Sandoval</h3>\n"
                + "        </div>\n"
                + "        <div class=\"enPerfil\">\n"
                + "            <h3>PERFIL: Gerente</h3>\n"
                + "        </div>\n"
                + "    </body>\n"
                + "</html>");

    }

    @RequestMapping(method = RequestMethod.GET, value = "/ChangePasswd.htm")

    public void ChangeP(Model modelo, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();

        out.println("<html>\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                + "        <title>Cambio de Contraseña</title>\n"
                + "        <link href=\"css/estilo.css\" rel=\"stylesheet\"  >\n"
                + "       \n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <div class=\"encabezado\">\n"
                + "            <img src=\"img/ventas.png\">\n"
                + "\n"
                + "        </div>\n"
                + "        <div class=\"encabezadoCenter\">\n"
                + "            <h1>Aseguramos las ventas del mañana</h1>\n"
                + "        </div>\n"
                + "        <div class=\"hora\">\n"
                + "            <script languaje=\"JavaScript\">\n"
                + "\n"
                + "                var mydate = new Date();\n"
                + "                var year = mydate.getYear();\n"
                + "                if (year < 1000)\n"
                + "                    year += 1900;\n"
                + "                var day = mydate.getDay();\n"
                + "                var month = mydate.getMonth();\n"
                + "                var daym = mydate.getDate();\n"
                + "                if (daym < 10)\n"
                + "                    daym = \"0\" + daym;\n"
                + "                var dayarray = new Array(\"Domingo\", \"Lunes\", \"Martes\", \"Miercoles\", \"Jueves\", \"Viernes\", \"Sabado\");\n"
                + "                var montharray = new\n"
                + "                        Array(\"Enero\", \"Febrero\", \"Marzo\", \"Abril\", \"Mayo\", \"Junio\", \"Julio\", \"Agosto\", \"Septiembre\", \"Octubre\", \"Noviembre\", \"Diciembre\");\n"
                + "                document.write(\"<small><font color='ffffff' face='Arial'>\" + dayarray[day] + \" \" + daym + \" de \" + montharray[month] + \" de \" + year + \"</font></small>\");\n"
                + "\n"
                + "            </script>\n"
                + "\n"
                + "        </div>\n"
                + "<div class=\"main\">\n"
                + "            <center>\n"
                + "                <br> \n"
                + "                <p>Cambio de password</p>\n"
                + "                <br>\n"
                + "\n"
                + "                <form class=\"contact_form\" action=\"#\" method=\"post\">\n"
                + "                    <ul>\n"
                + "                        <li>\n"
                + "                            <label for=\"usr\" style=\" font-size: 120%\">Usuario</label>\n"
                + "                            <input type=\"text\" class=\"form-control\" id=\"usr\" placeholder=\"Usuario\" size=\"30\">\n"
                + "                        </li>\n"
                + "                        <li>\n"
                + "                            <label for=\"pwd\" style=\" font-size: 120%\"  >Actual</label>\n"
                + "                            <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Actual password\" size=\"30\" >\n"
                + "\n"
                + "                        </li>\n"
                + "                        <li>\n"
                + "                            <label for=\"pwd\" style=\" font-size: 120%\"  >Nueva</label>\n"
                + "                            <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Nueva password\" size=\"30\" >\n"
                + "\n"
                + "                        </li>\n"
                + "                        <li>\n"
                + "                            <label for=\"pwd\" style=\" font-size: 120%\"  >Confirmar</label>\n"
                + "                            <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Confirmar password\" size=\"30\" >\n"
                + "\n"
                + "                        </li>\n"
                + "                    </ul>\n"
                + "\n"
                + "                </form>\n"
                + "            </center>\n"
                + "        </div>\n"
                + "         <div class=\"main2\">\n"
                + "            <center>\n"
                + "                <br>\n"
                + "                <br>\n"
                + "                <button class=\"submit\" type=\"submit\">Enviar</button>\n"
                + "            </center>\n"
                + "        </div>"
                + "    </body>\n"
                + "</html>\n"
                + "");

    }
}
