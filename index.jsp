<%-- 
    Document   : index
    Created on : 21-May-2022, 11:53:36 AM
    Author     : khush
--%>

<%@page import="com.mycompany.mycart.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mycart - Home </title>
        
        <%@include file = "components/common_css_jss.jsp"%>
    </head>
    <body>
        
        <%@include file="components/navbar.jsp" %>
        
        <h1>Hello world</h1>
        <h1>Creating Sesion Factory object</h1>
        
        <%
            out.println(FactoryProvider.getFactory()+"<br>");
            out.println(FactoryProvider.getFactory()+"<br>");
            out.println(FactoryProvider.getFactory());

        %>
    </body>
</html>
