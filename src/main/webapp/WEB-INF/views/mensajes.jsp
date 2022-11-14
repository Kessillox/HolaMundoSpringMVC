<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<c:forEach items="${dataMensajeList}" var="mensaje">
			<c:out
			value="${mensaje.getRemitente()} dice que
			${mensaje.getMensaje()}" />
			<br/>
		</c:forEach>
		
		<form:form id="frmMensajes" action="/saludos/saveMessage" modelAttribute="mensaje">
		Remitente: <input type="text" id="txtRemitente" name="remitente" /> <br/>
		Mensaje: <input type="text" id="txtMensaje" name="mensaje" /> <br />
		<input type="submit" id="btnEnviar" value="Enviar" />
		</form:form>
	</body>	
</html>