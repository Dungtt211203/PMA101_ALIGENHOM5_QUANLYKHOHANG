<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/10/2023
  Time: 8:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form action="/student/save" method="post" modelAttribute="sv">
    Name:  <form:input path="name"/> <form:errors path="name" cssStyle="color: red"/> <br><br>
    Email: <form:input path="email"/> <form:errors path="email" cssStyle="color: red"/>
    <br><br>
    Masks: <form:input path="marks" type="number"/> <form:errors path="marks" cssStyle="color: red"/>
    <br><br>
    Gender: <form:radiobuttons items="${genders}" path="gender"/> <form:errors path="gender" cssStyle="color: red"/>

    <br><br>
    Faculty: <form:select path="faculty">
    <form:option value="">Khoa</form:option>
    <form:options items="${faculties}"/>
    </form:select> <form:errors path="faculty" cssStyle="color: red"/>   <br><br>
    Hobbies: <form:checkboxes items="${hobbies}" path="hobbies"/> <form:errors path="hobbies" cssStyle="color: red"/>  <br><br>
    <button type="submit">Save</button>
</form:form>
</body>
</html>
