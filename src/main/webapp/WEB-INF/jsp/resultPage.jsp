<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Calculate Curvature drop</title>
</head>
<body>
	<p align="center">
		Standing on planet ${result[2]} <br>
		Looking from height of ${result[3]} m your horizon is ${result[0]} km away<br>
		Looking at an object ${result[4]} km away it appears ${result[1]} m below horizon <br>
	</p>
    
	<form align=center action="result.html" method="post">  
		height of the observer [m] <input type="text" name="h1" /><br/>
		distance to the target [km] <input type="text" name="d" /><br/>
		<input type="radio" name="planet" value="earth" checked> Earth<br>
	 	<input type="radio" name="planet" value="moon"> Moon<br>
	 	<input type="radio" name="planet" value="jupiter"> Jupiter<br>
		<input type="submit" value="calculate"/>  
	</form>

</body>
</html>
