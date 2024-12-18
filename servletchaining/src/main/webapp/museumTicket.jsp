<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Museum Jsp</h2>
<h5> ${Museum.name} has confirmed - ${Museum.noOfAdults} adult tickets and - ${Museum.noOfChildren} children tickets .Contact Number : ${Museum.mobileNo} and email : ${Museum.email} and total cost of the tickets : ${Museum.totalCost} </h5>

<form action = "museum" method = "post">

<pre>

Name : <input type= "text" name = "name"/> <br>

No of Adults :  <select name="adults" id="adults">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                    </select> <br>

No of children : <select name="children" id="children">
                       <option value="0">0</option>
                       <option value="1">1</option>
                       <option value="2">2</option>
                       <option value="3">3</option>
                       <option value="4">4</option>
                       <option value="5">5</option>
                       <option value="6">6</option>
                       <option value="7">7</option>
                       <option value="8">8</option>
                       <option value="9">9</option>
                   </select> <br>

Mobile Number : <input type = "number" name ="number"/> <br>

Email : <input type = "email" name ="email"/> <br>


<input type= "submit" value = "Submit"/>

</pre>
</form>

</body>
</html>
