<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index JSP</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .container {
            height: 600px;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
        }
        .form-links {
            background: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .form-links h2 {
            color: #343a40;
            margin-bottom: 20px;
        }
        .form-links .btn {
            margin: 10px 0;
            font-size: 14px; /* Smaller font size for the buttons */
            width: auto; /* Adjust width to fit the text */
            padding: 5px 15px; /* Reduced padding for smaller size */

        }
    </style>
</head>
<body>

<div class="container">
    <div class="form-links">
        <h2>This is Index JSP Page</h2>

        <div class = "d-flex flex-column">
        <a href="milk.jsp" class="btn btn-info btn-sm">Milk Form</a>
        <a href="sweet.jsp" class="btn btn-info btn-sm">Sweet Form</a>
        <a href="museumTicket.jsp" class="btn btn-info btn-sm">Museum Ticket Booking Form</a>
        <a href="cricket.jsp" class="btn btn-info btn-sm">Cricket Form</a>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
