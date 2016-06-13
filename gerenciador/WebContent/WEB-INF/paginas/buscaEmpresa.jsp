<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busca de Empresas</title>
<style type="text/css">
	
	body{
		background-color:#54d;
		color: #fff;
		margin:10px;
		padding:10px;
	}

</style>
</head>
<body>
	<p>Resultado da busca:</p>
	<ul>
        <c:forEach var="empresa" items="${empresas}">
            <li>${empresa.id}: ${empresa.nome}</li>
        </c:forEach>
    </ul>
</body>
</html>