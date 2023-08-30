<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Beans.Beans_Usuario"%>
<%@page import="Daos.Dao_Usuario"%>
<%

    String txt_user = "";
    String txt_pass = "";


    txt_user = request.getParameter("txt_user");
    txt_pass = request.getParameter("txt_pass");
    
    Dao_Usuario d_u1 = new Dao_Usuario();
    List<Beans_Usuario> lista_recibe_u1 = new ArrayList<>();
    int cantidad_lista_recibe_u1=0;
    
    lista_recibe_u1 = d_u1.usuario_s_usuario_clave(txt_user, txt_pass);
    cantidad_lista_recibe_u1 = lista_recibe_u1.size();
    
    if (cantidad_lista_recibe_u1==1) {
            response.sendRedirect("menu.jsp");
            HttpSession sesion1 = request.getSession(true);
            sesion1.setAttribute("user", txt_user);
            sesion1.setAttribute("pass", txt_pass);
            sesion1.setAttribute("lista_usuario", lista_recibe_u1);
        }else{
        response.sendRedirect("index.html");
    }
%>


