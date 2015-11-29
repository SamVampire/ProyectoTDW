<%-- 
    Document   : AltaPersonal
    Created on : 08-nov-2015, 14:10:26
    Author     : carlii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta de personal</title>
        <link href="css/Estilo_Altac.css" rel="stylesheet">
    </head>
    <body>
         <div class="encabezado">
            <img src="img/ventas.png">

        </div>
        <div class="encabezadoCenter">
            <h1>Aseguramos las ventas del mañana</h1>
        </div>
        <div class="hora">
            <script languaje="JavaScript">

                var mydate = new Date();
                var year = mydate.getYear();
                if (year < 1000)
                    year += 1900;
                var day = mydate.getDay();
                var month = mydate.getMonth();
                var daym = mydate.getDate();
                if (daym < 10)
                    daym = "0" + daym;
                var dayarray = new Array("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado");
                var montharray = new
                        Array("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
                document.write("<small><font color='ffffff' face='Arial'>" + dayarray[day] + " " + daym + " de " + montharray[month] + " de " + year + "</font></small>");

            </script>

        </div>
        <br>
        <br>
        <br>
    <center><h2 style="font-family: arial" >Alta de Productos</h2></center>

    <h2 style="font-family: arial">Llenar campos</h2>
    <br>

    <div class="main">
        <form class="contact_form">

            <ul>
                <table>

                    <tr>
                        <td> <label for="idprod" style=" font-size: 120%">Id producto</label></td>
                        <td><input type="text" class="form-control" id="idprod" placeholder="Id del producto" size="30" required></td>
                    </tr>


                    <tr></tr>
                    <tr></tr>
                    <tr></tr>
                    <tr>
                        <td> <label for="desc" style=" font-size: 120%">Descripción </label></td>
                        <td><input type="text" class="form-control" id="desc" placeholder="Descripcion de producto" size="30" required></td>
                    </tr>
                    <tr></tr>
                    <tr></tr>
                    <tr></tr>
                    <tr>
                        <td> <label for="precio" style=" font-size: 120%">Precio</label></td>
                        <td><input type="text" class="form-control" id="precioP" placeholder="Precio de producto" size="30" required></td>
                    </tr>
                    <tr></tr>
                    <tr></tr>
                    <tr></tr>
                    <tr>
                        <td> <label for="existencencia" style=" font-size: 120%">Existencia </label></td>
                        <td><input type="text" class="form-control" id="existencia" placeholder="Descripcion de producto" size="30" required></td>
                    </tr>
                    <tr></tr>
                    <tr></tr>
                    <tr></tr>
                    <tr>
                        <td><label for="desc" style=" font-size: 120%"  >Descripción</label></td>
                        <td><textarea rows="4" cols="27" placeholder="Descripción del producto">
                            
                            </textarea></td>
                    </tr>


                    <tr></tr>
                    <tr></tr>
                    <tr></tr>
                    <tr>

                        <td><label for="precio" style=" font-size: 120%"  >Precio</label></td>
                        <td><input type="text" class="form-control" id="precio" placeholder="Precio del producto" size="30" required></td>



                    </tr>
                   
                    <tr></tr>
                    <tr></tr>
                    <tr></tr>
                    
                    <tr>

                        <td><label for="status" style=" font-size: 120%"  >Estatus</label></td>
                        <td><input type="text" class="form-control" id="status" placeholder="Status" size="30" required></td>

                    </tr>
                     
                    <tr>
                      <td> <button type="submit" >Aceptar</button></td>
                    </tr>

                </table>
               
            </ul>

        </form>
        
        <form method="get" action="Paginaventas.htm">
            <table>
                <tr>
                    
                    <td><button type="submit" >Regresar</button></td></td>
             
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
