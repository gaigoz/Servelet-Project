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
<form action="StudentUpdateController" method="post">
    <label>Student Id</label>
    <input type="number" name="sid"><br/>
    <label>Student Name</label>
    <input type="text" name="sname"><br/>
    <input type="submit" value="Update Student">
</form>
</body>
</html>
