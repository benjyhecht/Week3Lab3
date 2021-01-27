<%-- 
    Document   : agecalculator
    Created on : Jan 27, 2021, 9:40:41 AM
    Author     : 468181
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="AgeCalculator">
            Enter your age: <input type="text" name="age" value=${age}><br>
            <input type="submit" value="submit">
        </form>
            <p>${ageMessage}</p>
    </body>
</html>
