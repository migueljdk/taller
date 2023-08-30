<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        <link href="estilos01/prueba.css" rel="stylesheet" type="text/css"/>   
    </head>
    <body>

        <div id="logo-header-menu" class="navegacion"> 
            <ul class="menu">
                <li><a href="menu.jsp">Inicio</a></li>
                <li><a href="Mantenimiento/mantenimientojsp">Mantenimiento</a>

                </li>
                <li><a href="#">Operaciones</a>
                    <ul class="submenu">
                        <li><a href="Ventas/lista_productos.jsp">lista de productos</a></li>
                        <li><a href="Ventas/carrito.jsp">Carrito</a></li>

                    </ul>
                </li> 
                <li><a href="#">Reporte</a>
                    <ul class="submenu">
                        <li><a href="#">Ventas diarias</a></li> 
                        <li><a href="#">Ventas mensuales</a></li> 
                    </ul>
                </li>


                <li><a href="salir.jsp">Salir</a></li>                                    
            </ul>

        </div>
    </body>
</html>
