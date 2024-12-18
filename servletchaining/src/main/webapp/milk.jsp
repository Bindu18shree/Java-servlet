<html>
<body>
<h2>Milk Jsp</h2>

<form action = "milk" method = "post">

<pre>

Brand : <input type= "text" name = "brand"/> <br>

Milk Type :  <select name="milkType" id="milkType">
                        <option value="Special">Special</option>
                        <option value="Ordinary">Ordinary</option>
                        <option value="Good Life">Good Life</option>
                        <option value="Good Life Lite">Good Life Lite</option>
                        <option value="Family">Family</option>
                        <option value="Buffalo Milk">Buffalo Milk</option>
                    </select>

Quantity : <select name="quantity" id="quantity">
                       <option value="250">250 ml</option>
                       <option value="500">500 ml</option>
                       <option value="1000">1 litre</option>
                       <option value="2000">2 litres</option>
                   </select>

<input type= "submit" value = "Submit"/>

</pre>
</form>

</body>
</html>
