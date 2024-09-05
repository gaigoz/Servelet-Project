<%--
  Created by IntelliJ IDEA.
  User: vjagg
  Date: 01/09/2024
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<h2>Add Student</h2>
<form action="StudentStoreController" method="post">
    <label>Name</label>
    <input type="text" name="name"><br/>
    <label>Age</label>
    <input type="number" name="age"><br/>
    <label>Batch Id</label>
    <input type="number" name="bId"><br/>
    <input type="submit" value="Save Student">
</form>
</body>
</html>
