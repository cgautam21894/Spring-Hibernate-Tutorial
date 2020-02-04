<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of students:</h1>
<p>
<button onclick="window.location.href='addStudent'";return false;>Add Student</button>
</p>
	<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Hobbies</th>
			<th>City</th>
			<th>Address</th>
			<th>Action</th>
		</tr>

		<c:forEach items="${AllStudents}" var="student">
			<c:url var="updatelink" value="showUpdateForm">
				<c:param name="studentId" value="${student.ID }"/>
			</c:url>
			<c:url var="deletelink" value="deleteRecord">
				<c:param name="studentId" value="${student.ID }"/>
			</c:url>
			
			<tr>
				<td>${student.NAME}</td>
				<td>${student.EMAIL}</td>
				<td>${student.DATEOFBIRTH}</td>
				<td>${student.GENDER}</td>
				<td>${student.HOBBIES}</td>
				<td>${student.CITY}</td>
				<td>${student.ADDRESS}</td>
				<td><a href ="${updatelink}"> update</a> | <a onclick="if(!(confirm('delete record?'))) return false" href="${deletelink}">Delete</a> </td>
			</tr>
		</c:forEach>
	</table>
	<hr/>



</body>
</html>