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
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css" />

    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>

    <title>City Details</title>
</head>

<body onload="init()">

<div class="w3-container">
    <h2 style="text-align: center">${city.city}</h2>
    <br>
    <a class="w3-button" href="<c:url value="/" />"><spring:message code="application.back"/></a>

    <div class="w3-container w3-center">
        <a class="w3-button" href="<c:url value="${city.id}/cityModify" />"><spring:message code="application.new"/></a>
        <table id="CityTable" class="display w3-centered w3-table-all">
            <thead>
            <tr class="w3-light-grey">
                <th>ID</th>
                <th>${city.id}</th>
            </tr>
            <tr class="w3-light-grey">
                <th>Nom</th>
                <th>${city.city}</th>
            </tr>
            <tr class="w3-light-grey">
                <th>Pays</th>
                <th>${city.country.country}</th>
            </tr>
            <tr class="w3-light-grey">
                <th>MAJ</th>
                <th>${city  .lastUpdate}</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
<script>
    function init() {
        let location = "static/langages"
        $(document).ready(function () {
            $('#appTable').DataTable({
                "bInfo": false, //Dont display info e.g. "Showing 1 to 4 of 4 entries"
                "paging": false,//Dont want paging
                "bPaginate": false,//Dont want paging
                "processing": true,
                "filter": false,
                language: {
                    url: location
                }
            });
        });
    }
</script>
</body>
</html>