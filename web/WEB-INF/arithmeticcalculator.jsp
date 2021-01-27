<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 27, 2021, 10:20:31 AM
    Author     : 468181
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="Arithmetic">
            First: <input type="text" name="first" value=${first}><br>
            Second: <input type="text" name="second" value=${second}><br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit" value="*">
            <input type="submit" name="submit" value="%">
        </form>
            <p>${answerMessage}</p>
            <a href="AgeCalculator">Age Calculator</a>
    </body>
</html>
