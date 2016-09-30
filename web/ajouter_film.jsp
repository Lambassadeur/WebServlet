<%-- 
    Document   : _TEMPLATE
    Created on : 28 sept. 2016, 16:09:17
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_HEAD.jsp"/>
    </head>
    <body>
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        <div class="titre">
            Nouveau film
        </div>
        <div class="contenu">
            <form method="POST">
                <label>Titre</label><input name="titre" type="text"></input><br/>
                <label>Synopsis</label><textarea name="synopsis" type="text"></textarea><br/>
                <label>Année de production</label><input name="annee" type="text"></input><br/>
                <label>Durée</label><input name="duree" type="text"></input><br/>
                <input type="submit" value="Ajouter"/><br/>
            </form>
        </div>
        <div class="pied">
            <c:import url="_FOOT.jsp"/>
        </div>
    </body>
</html>
