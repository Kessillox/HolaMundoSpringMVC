<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="ISO-8859-1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>

    <body>
        <h1>Hola Mundo Spring MVC</h1>
        <p>pagina de
            <c:out value="${page_name}" />
        </p>
        <c:set var="edad" value="${18}" />
        <c:if test="${edad > 17}">
            <p>Mayor de edad</p>
        </c:if>
        <form:form id="frmAcciones" modelAttribute="contact" action="/addContact">
            <div>
                <fieldset>
                    <legend>Mantenedor de Contactos</legend>
                    <table border="1">
                        <tr>
                            <td>Nombre: </td>
                            <td><input type="text" id="idNombre" name="nombre" /></td>
                            <td>Apellido Paterno: </td>
                            <td><input type="text" id="idApellidoPaterno" name="apellidoPaterno" /></td>
                        </tr>
                        <tr>
                            <td>Dirección: </td>
                            <td><input type="text" id="idDireccion" name="direccion" /></td>
                            <td>Teléfono: </td>
                            <td><input type="text" id="idTelefono" name="telefono" /></td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <input type="button" value="Buscar" />
                                <input type="button" value="Agregar"
                                    onclick="submitFormAction('/contactManager/addContact', 'post')" />
                                <input type="button" value="Eliminar" />
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </div>
        </form:form>
    </body>

    </html>
    </body>

    </html>