<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="US-ASCII">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Milk JSP</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #fff;
            font-family: Arial, sans-serif;
        }
        .form-container {
            max-width: 600px;
            margin: 30px auto;
            background: #ffecd2;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border: 2px solid #ffa726;
        }
        .form-container h2 {
            color: #f57c00;
            margin-bottom: 20px;
            text-align: center;
        }
        .form-control {
            margin-bottom: 15px;
            border-color: #ffa726;
        }
        .btn {
            background-color: #f57c00;
            color: white;
        }

    </style>
</head>

<body>

<div class="form-container">
    <h2>Cricket JSP</h2>
    <form action="cricket" method="post" onSubmit="return validation(event)">
        <div class="mb-3">
            <label for="name" class="form-label">Tournament Name</label>
            <input type="text" id="name" name="name" class="form-control" placeholder="Enter tournament name">

        </div>
        <div class="mb-3">
            <label for="location" class="form-label">Location</label>
            <input type="text" id="location" name="location" class="form-control" placeholder="Enter location">
        </div>
        <div class="mb-3">
            <label for="startDate" class="form-label">Start Date</label>
            <input type="date" id="startDate" name="startDate" class="form-control">
        </div>
        <div class="mb-3">
            <label for="endDate" class="form-label">End Date</label>
            <input type="date" id="endDate" name="endDate" class="form-control">
        </div>
        <div class="mb-3">
            <label for="format" class="form-label">Format</label>
            <input type="text" id="format" name="format" class="form-control" placeholder="Enter format (e.g., T20)">
        </div>
        <div class="mb-3">
            <label for="status" class="form-label">Status</label>
            <input type="text" id="status" name="status" class="form-control" placeholder="Enter status">
        </div>
        <div class="mb-3">
            <label for="prize" class="form-label">Prize Money</label>
            <input type="text" id="prize" name="prize" class="form-control" placeholder="Enter prize money">
        </div>
        <div class="mb-3">
            <label for="team" class="form-label">Number of Teams</label>
            <input type="text" id="team" name="team" class="form-control" placeholder="Enter number of teams">
        </div>

        <span id="error" class="text-danger"></span> <br>

        <div class= "mt-2">
        <button type="submit" class="btn btn-block">Submit</button>
        <button type="reset" class="btn btn-block fw-medium">clear</button>
        <a href="index.jsp" class="btn btn-block btn-sm back-button px-auto py-2 fw-medium">back</a>
        <a href="cricket" class="btn btn-block btn-sm back-button px-auto py-2 fw-medium">view All</a>
        </div>
    </form>

</div>
<div> <h5 class="text-success px-5 mx-5"> ${Message} <h5> </div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<script>

const validation = (event) =>{

const tournamentName = document.getElementById("name").value;
const location = document.getElementById("location").value;
const startDate = document.getElementById("startDate").value;
const endDate = document.getElementById("endDate").value;
const format = document.getElementById("format").value;
const status = document.getElementById("status").value;
const prize = document.getElementById("prize").value;
const noOfTeams = document.getElementById("team").value;
isValid = true;

if(!tournamentName.trim() != "" || !location.trim() != "" || !startDate.trim() != "" || !endDate.trim()
   != "" || !format.trim() != "" || !status.trim() != "" || prize <= 0 || noOfTeams <= 0){

  document.getElementById("error").innerHTML = "Please fill the fields.";
  isValid=false;
} else{
   document.getElementBYId("error").innerHTML="";
}
return isValid;
}
</script>
</body>
</html>
