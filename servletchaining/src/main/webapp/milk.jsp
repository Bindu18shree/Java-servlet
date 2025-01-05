<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>

<html>
<head>
    <title>Sweet JSP</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<style>

        .form-container {
            border-radius: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border : 1.5px solid green;
        }

    </style>
</head>
<body class = "g-info-subtle">
<div class = "container mt-3">
<div class="row justify-content-center">
<div class="col-lg-6">

<h2 class="text-center text-success mb-4">Milk Jsp</h2>


<div class="form-container mb-3 bg-success-subtle px-5 py-1 w-100">
<form action = "milk" method = "post" onSubmit="return handleValidation(event) " id = "milkForm">
<div class="mt-4">
  <label for="brand" class="form-label">Brand</label>
  <input type="text" class="form-control border border-success" id="brand" placeholder="Enter the Brand here" name = "brand" id = "brand"/>
</div>
<span id="brandError" class="text-danger"></span>

<div class="mt-4">
<label for="milkType" class="form-label">Milk Type</label>
<select class="form-select form-select-sm border border-success" name="milkType" id ="milkType">
  <option value ="">Select Milk type</option>
  <option value="Special">Special</option>
  <option value="Ordinary">Ordinary</option>
  <option value="Good Life">Good Life</option>
  <option value="Good Life Lite">Good Life Lite</option>
  <option value="Family">Family</option>
  <option value="Buffalo Milk">Buffalo Milk</option>
</select>
</div>
<span id="milkTypeError" class="text-danger"></span>


<div class="mt-4">
<label for="quantity" class="form-label">Quantity</label>
<select class="form-select form-select-sm border border-success" name="quantity" id="quantity">
  <option value = "">select the quantity of milk</option>
  <option value="250">250 ml</option>
  <option value="500">500 ml</option>
  <option value="1000">1 litre</option>
  <option value="2000">2 litres</option>
</select>
</div>
<span id="quantityError" class="text-danger"></span>

<div class="d-grid gap-2 d-md-block mt-4">
  <button class="btn btn-success" type="submit">Submit</button>
  <button class="btn btn-success" type="reset">Clear</button>
  <a class="btn btn-success" href="index.jsp" role="button">Back</a>
  <a class="btn btn-success" href="milk" role="button">View All</a>
</div>


</div>
</form>
<div>
<h5 class = "text-success">${Message}<h5>
</div>
</div>
</div>
</div>
</div>

<script>

const handleValidation = (event) => {

const milkBrand = document.getElementById("brand").value;
const milkType = document.getElementById("milkType").value;
const quantity = document.getElementById("quantity").value;
isValid = true;

if (!milkBrand.trim() != "") {

      document.getElementById("brandError").innerHTML = "Please enter the brand field.";

      isValid = false;
   } else{

      document.getElementById("brandError").innerHTML = "";
   }

if(!milkType.trim() != ""){

      document.getElementById("milkTypeError").innerHTML = "Please select the type of milk";
      isValid = false;

}  else{

         document.getElementById("milkTypeError").innerHTML = "";
      }

if(quantity <=0){

      document.getElementById("quantityError").innerHTML = "Please select the quantity of milk";
      isValid = false;
}
return isValid;
};

</script>

</body>l
</html>
