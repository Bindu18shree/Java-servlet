<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>

<html>
<head>
    <title>Sweet JSP</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        body {
            background-color: #f8f9fa; /* Light background */
        }
        .form-container {
            background-color: #e9ecef; /* Light gray background for form */
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
         .back-button{
                width: 60px
         }

    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <h2 class="text-center text-primary mb-4">Sweet JSP</h2>
                <div class="form-container">
                    <form action="sweet" method="post" onSubmit="return handleValidation(event) " id = "sweetForm">
                        <div class="mb-3">
                            <label for="shopName" class="form-label">Shop Name:</label>
                            <select class="form-select" name="shopName" id="shopName">
                            <option value="">Select the shop name</option>
                                <option value="Kanti Sweets">Kanti Sweets</option>
                                <option value="Haldirams">Haldirams</option>
                                <option value="Asha Sweets">Asha Sweets</option>
                                <option value="New Agarwal Bhavan">New Agarwal Bhavan</option>
                            </select>
                            <span id="shopNameError" class="text-danger"></span>
                        </div>
                        <div class="mb-3">
                            <label for="sweetName" class="form-label">Sweet Name:</label>
                            <select class="form-select" name="sweetName" id="sweetName">
                                <option value="">Select the Sweet Name</option>
                                <option value="Kaju Katli">Kaju Katli</option>
                                <option value="Dry Fruit Ladoo">Dry Fruit Ladoo</option>
                                <option value="Kaju Pine">Kaju Pine</option>
                                <option value="Anjeer Dry Fruit Roll">Anjeer Dry Fruit Roll</option>
                                <option value="Anjeer Sandwich">Anjeer Sandwich</option>
                                <option value="Coconut Burfi">Coconut Burfi</option>
                            </select>
                            <span id="sweetNameError" class="text-danger"></span>
                        </div>
                        <div class="mb-3">
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" name="isSpecial" id="isSpecial" value="true">
                                <label class="form-check-label" for="isSpecial">Is the Sweet Special?</label>
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="quantity" class="form-label">Quantity:</label>
                            <select class="form-select" name="quantity" id="quantity">
                                <option value="">Select Quantity</option>
                                <option value="250">250 grams</option>
                                <option value="500">500 grams</option>
                                <option value="750">750 grams</option>
                                <option value="1000">1 kg</option>
                                <option value="2000">2 kg</option>
                            </select>
                            <span id="quantityError" class="text-danger"></span>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">Submit</button>
                            <button type="reset" class="btn btn-primary">clear</button>
                            <a href="index.jsp" class="btn btn-primary btn-sm back-button px-auto py-2 fw-medium">back</a>
                            <a href="sweet" class="btn btn-primary">View All</a>
                        </div>
                    </form>
                </div>

                <div><h6 class = "text-success mt-3">${Message}</h6></div>
            </div>
        </div>
    </div>

    <script>

    const handleValidation = (event) => {

    const shopName = document.getElementById("shopName").value;
    const sweetName = document.getElementById("sweetName").value;
    const quantity = document.getElementById("quantity").value;
    isValid = true;

    if(!shopName.trim() != ""){
       document.getElementById("shopNameError").innerHTML = "Please select the shop name";
       isValid = false;
    }
    else{
       document.getElementById("shopNameError").innerHTML = "";

    }

    if(!sweetName.trim() != ""){
       document.getElementById("sweetNameError").innerHTML = "Please select the sweet name";
       isValid = false;
    }
    else {
       document.getElementById("sweetNameError").innerHTML = "";
    }

    if(quantity <=0){
      document.getElementById("quantityError").innerHTML = "Please select the quantity";
      isValid = false;
    }
    else{
       document.getElementById("quantityError").innerHTML = "";
    }

    return isValid;

    }
    </script>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
            integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
            crossorigin="anonymous"></script>
</body>
</html>
