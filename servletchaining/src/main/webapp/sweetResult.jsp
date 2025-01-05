<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h4 class="text-center mt-4">Sweet List</h4>

<table class="table table-hover table-bordered border border-2 border-success mt-3">
<thead>
<tr class="table-success text-center">
<th>Id</th>
<th>Shop Name</th>
<th>Sweet Name</th>
<th>Special/Normal</th>
<th>Quantity(grams)</th>
<th>Total Cost</th>

</tr>
</thead>

<tbody>
<c:forEach var="sweet" items="${list}">
<tr class="table-light text-center">
<td>${sweet.id}</td>
<td>${sweet.shopName}</td>
<td>${sweet.sweetName}</td>
<td>${sweet.isSpecial}</td>
<td>${sweet.quantity}</td>
<td>${sweet.totalCost}</td>

</tr>
</c:forEach>
</tbody>

</table>
<div class="d-flex justify-content-center mb-3">
<a class="btn btn-success" href="sweet.jsp" role="button">Back</a>
</div>
</body>
</html>
