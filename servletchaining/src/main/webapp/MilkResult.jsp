<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h5 class="text-center mt-3">Milk List</h5>

<div class="table-responsive">
<table class="table table-hover table-bordered border-secondary table-sm mt-3">
  <thead>
    <tr class="table-info text-center">
      <th scope="col">Id</th>
      <th scope="col">Brand</th>
      <th scope="col">Milk Type</th>
      <th scope="col">Quantity(ml)</th>
      <th scope="col">Total Cost</th>

    </tr>
  </thead>

  <tbody class="table-group-divider">

  <c:forEach var="milk" items="${list}">
    <tr class="table-light text-center">

      <td>${milk.id}</td>
      <td>${milk.brand}</td>
      <td>${milk.milkType}</td>
      <td>${milk.quantity}</td>
      <td>${milk.totalPrice}</td>

    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="d-flex justify-content-center mb-3">
<a class="btn btn-primary" href="milk.jsp" role="button">Back</a>
</div>
</div>
</body>
</html>

