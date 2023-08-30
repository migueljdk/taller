<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="estilos01/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <form id="frm_ingreso" name="frm_ingreso" action="login_control.jsp" class="box" method="POST">
                <h1>Bienvenido</h1>
                
                <input type="text" id="txt_user" name="txt_user" placeholder="Usuario" required>
                
                <input type="password" id="txt_pass" name="txt_pass" placeholder="Contrase&ntilde;a" autocomplete="off" required>
                <a href="#" class="forgetpass">¿Olvidaste tu contrase&ntilde;a?</a>
                <input type="submit" value="Iniciar sesion" class="btn1">
                <a href="#" class="dnthave">¿No tienes una cuenta? Registrate</a>
            </form>
            
        </div>
    </body>