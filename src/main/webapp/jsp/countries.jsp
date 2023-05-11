<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 	CSS (w3css) de la Page -->
    <link rel="stylesheet" href="<c:url value="css/w3.css" />"/>

    <title>Countries JSP</title>

</head>

<body onload="init();">


<div class="w3-container">
    <h2 style="text-align: center"><spring:message code="page.country.title"/></h2>
    <br>
    <a class="w3-button" href="<c:url value="/" />"><spring:message code="application.back"/></a>

    <div class="w3-container w3-center">
        <a class="w3-button" href="<c:url value="countryModify" />"><spring:message code="application.new"/></a>
        <table id="countriesTable" class="w3-centered w3-table-all">
            <thead>
            <tr class="w3-light-grey">
                <th><spring:message code="application.id"/></th>
                <th><spring:message code="application.country"/></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${countries}" var="elem">
                <tr>
                    <th scope="row">${elem.id}</th>
                    <td>${elem.country}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
<!-- JavaScript resources dataTables + jQuery -->

</html>
