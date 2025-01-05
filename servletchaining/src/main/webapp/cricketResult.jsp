<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<h4 class="text-center mt-3 text-dark">Cricket List</h4>

<div class="table-responsive">
<table class="table mt-4 table-bordered border border-2 border-danger">
<thead>
<tr>
<th class="text-danger">Id</th>
<th class="text-danger">Tournament Name</th>
<th class="text-danger">Location</th>
<th class="text-danger">Start Date</th>
<th class="text-danger">End Date</th>
<th class="text-danger">Format</th>
<th class="text-danger">Status</th>
<th class="text-danger">Prize Money</th>
<th class="text-danger">No of Teams</th>

</tr>
</thead>

<tbody>
<c:forEach var="cricket" items="${list}">
<tr class="table-secondary">
<td>${cricket.id}</td>
<td>${cricket.tournamentName}</td>
<td>${cricket.location}</td>
<td>${cricket.startDate}</td>
<td>${cricket.endDate}</td>
<td>${cricket.format}</td>
<td>${cricket.status}</td>
<td>${cricket.prizeMoney}</td>
<td>${cricket.noOfTeams}</td>
</tr>
</c:forEach>
</tbody>
</table>
<div class="d-flex justify-content-center mb-3">
<a class="btn btn-danger" href="cricket.jsp" role="button">Back</a>
</div>
</div>
</body>
</html>

