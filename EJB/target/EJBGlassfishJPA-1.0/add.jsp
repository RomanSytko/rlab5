<%@ page import="com.devcolibri.entity.EntityCurrency" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exchange rate of currency</title>
</head>
<body>
<center><h1>CONVERTER</h1></center>
<hr>
    <form action="add" method="post">
        <label for="EUR">Enter an amount to convert:
            <input type="text" id="EUR" value="" name="EUR" />
        </label>
        <p>According to currency exchange rate the dollar is <%= EntityCurrency.USD %></p>
        <p>According to currency exchange rate the Russian Ruble is <%= EntityCurrency.RUB %></p>
        <input type="submit" value="Convert" />
        <input type="reset" value="Convert" />
    </form>
</body>
</html>