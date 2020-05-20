<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Show Employees</title>
</head>
<body>
<div>
    day employeees trong na

</div>
<div id="books">
    <ul>
        <c:forEach items="${allEmployees}" var="emp">
            <li>
                <h2>${emp.empId}</h2>
                <h2>${emp.name}</h2>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>