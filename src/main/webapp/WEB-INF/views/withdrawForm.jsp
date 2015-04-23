<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ATM Simulator</title>
</head>
<body>
 <h2>ATM Simulator</h2>
 <form:form method="POST" modelAttribute="withdrawForm">
 <%--<form:form>--%>
   <table>
    <tr>
        <td><form:label path="amount">Amount</form:label></td>
        <td><form:input path="amount" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Withdraw"/>
        </td>
    </tr>
</table>
</form:form>
</body>
</html>