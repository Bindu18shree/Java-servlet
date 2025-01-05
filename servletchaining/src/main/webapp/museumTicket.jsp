<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="US-ASCII">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Museum JSP</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .form-container {
            max-width: 600px;
            margin: 30px auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .form-container h2 {
            margin-bottom: 20px;
        }
        .form-control {
            margin-bottom: 15px;
        }
        .btn {
            background-color: #007bff;
            color: #fff;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Museum JSP</h2>
    <form action="museum" method="post" onSubmit="return handleValidation(event)">

        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" id="name" name="name" class="form-control" placeholder="Enter your name">
            <span id="nameError" class = "text-danger"></span>
        </div>
        <div class="mb-3">
            <label for="adults" class="form-label">No of Adults</label>
            <input type="number" id="adults" name="adults" class="form-control" placeholder="Enter number of adults">
            <span id="adultError" class = "text-danger"></span>
        </div>
        <div class="mb-3">
            <label for="children" class="form-label">No of Children</label>
            <input type="number" id="children" name="children" class="form-control" placeholder="Enter number of children">
            <span id="ChildrenError" class = "text-danger"></span>
        </div>
        <div class="mb-3">
            <label for="number" class="form-label">Mobile Number</label>
            <input type="number" id="number" name="number" class="form-control" placeholder="Enter your mobile number">
            <span id="NumberError" class = "text-danger"></span>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="Enter your email">
            <span id="emailError" class = "text-danger"></span>

        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-primary">Clear</button>
        <a href="index.jsp" class="btn btn-primary btn-sm back-button px-auto py-2 fw-medium">back</a>
        <a href="museum" class="btn btn-primary btn-sm back-button px-auto py-2 fw-medium">View All</a>


</form>
<h5 class="mt-3 text-success">${Message}</h5>
</div>


<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<script>

const handleValidation = (event) =>{

const name = document.getElementById("name").value;
const noOfAdults = document.getElementById("adults").value;
const noOfChildren = document.getElementById("children").value;
const mobileNo = document.getElementById("number").value;
const emailId = document.getElementById("email").value;
const letters = /^[A-Za-z]+$/;
isValid=true;

if(!name.trim() != "" || name.length < 3 || !letters.test(name)) {
  document.getElementById("nameError").innerHTML="Please enter the correct name";
  isValid=false;
  }else{
   document.getElementById("nameError").innerHTML="";
  }

if(noOfAdults<=0){
   document.getElementById("adultError").innerHTML="Minimum number of adult tickets should be 1";
   isValid = false;
} else{
   document.getElementById("adultError").innerHTML="";
}

if(noOfChildren <= 0){
  document.getElementById("ChildrenError").innerHTML="Please enter the number of tickets";
  isValid=false;
} else{
  document.getElementById("ChildrenError").innerHTML="";
}

if(mobileNo <=0 || mobileNo.length <10 || mobileNo.length >10){
  document.getElementById("NumberError").innerHTML="Please enter valid number";
  isValid=false;
} else{
  document.getElementById("NumberError").innerHTML="";
}

if(!emailId.trim() != ""|| emailId.length < 12){
  document.getElementById("emailError").innerHTML="Please enter the valid email id";
  isValid=false;
} else{
  document.getElementById("emailError").innerHTML="";
}
return isValid;
};

</script>
</body>
</html>

