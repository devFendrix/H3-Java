<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 	CSS (w3css) de la Page -->
    <link rel="stylesheet" href="<c:url value="css/w3.css" />"/>

    <title>Countries Add/Modify JSP</title>

</head>
<body>
<div style="text-align: center" class="w3-container">
    <form name="countryForm" action="countryModify" method="POST">
        <table>
            <tr>
                <td>Id Pays:</td>
                <td><input type="number" name="id" readonly value="${country.id}"/></td>
                <td>Nom du Pays:</td>
                <td><input type="text" name="country" value="${country.country}"/></td>
            </tr>
            <th><input type="submit" value="Submit"/></th>
            <th><input type="reset" value="Clear"/></th>
        </table>
    </form>
</div>
</body>
</html>
