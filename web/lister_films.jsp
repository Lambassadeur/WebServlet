<%-- 
    Document   : lister_films.jsp
    Created on : 28 sept. 2016, 12:08:14
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${titre}</h1>
        
        <div>
            <c:forEach items="${mesFilms}" var="monFilm">
                ${monFilm.titre}
                <br/>
            </c:forEach> 
        </div>
        
        <div>${pied}</div>
        
    </body>
</html>
