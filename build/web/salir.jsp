<%
    if (session.getAttribute("user") != null) {
        session.setAttribute("pass", null);
        session.setAttribute("lista_usuario", null);
        
        response.sendRedirect("login.jsp");
    }
%>
