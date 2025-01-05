<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<h4 class="text-center mt-3 text-dark">Museum Tickets List</h4>

<div class="table-responsive">
<table class="table mt-4 table-bordered border border-2 border-black">
<thead>
<tr class="table-dark">
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Mobile No</th>
<th>No of Adults</th>
<th>No of children</th>
<th>Total Cost</th>

</tr>
</thead>

<tbody>
<c:forEach var="museum" items="${list}">
<tr class="table-secondary">
<td>${museum.id}</td>
<td>${museum.name}</td>
<td>${museum.email}</td>
<td>${museum.mobileNo}</td>
<td>${museum.noOfAdults}</td>
<td>${museum.noOfChildren}</td>
<td>${museum.totalCost}</td>
</tr>
</c:forEach>
</tbody>
</table>
<div class="d-flex justify-content-center mb-3">
<a class="btn btn-dark" href="museumTicket.jsp" role="button">Back</a>
</div>
</div>
</body>
</html>

