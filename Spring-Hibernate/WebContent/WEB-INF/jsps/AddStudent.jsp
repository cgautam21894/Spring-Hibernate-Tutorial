<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Provide Info:</h1>
	<hr />

	<f:form modelAttribute="student" action="saveProcess">
		<input type="text" value="${student.HOBBIES}" id="hobbies" />
		<table border="1">
			<f:hidden path="ID" />
			<tr>
				<td>Name</td>
				<td><f:input path="NAME" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><f:input path="EMAIL" /></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><f:input path="DATEOFBIRTH" type="date" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><f:radiobutton path="GENDER" value="Male" />Male <f:radiobutton
						path="GENDER" value="Female" />Female</td>
			</tr>
			<tr>
				<td>Hobbies</td>
				<td><f:checkbox path="HOBBIES" value="Cricket" />Cricket <f:checkbox
						path="HOBBIES" value="Football" />Football <f:checkbox
						path="HOBBIES" value="Volleyball" />Volleyball <f:checkbox
						path="HOBBIES" value="Hockey" />Hockey</td>
			</tr>
			<tr>
				<td>City</td>
				<td><f:select path="CITY">
						<f:option value="Mumbai">Mumbai</f:option>
						<f:option value="Pune">Pune</f:option>
						<f:option value="Surat">Surat</f:option>
						<f:option value="Vapi">Vapi</f:option>
						<f:option value="Baroda">Baroda</f:option>
					</f:select></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><f:textarea path="ADDRESS" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit">&nbsp; <input
					type="reset" value="reset">&nbsp;</td>
			</tr>

		</table>

	</f:form>


	<a href="getStudents">Go Back to List of All the Students</a>

	<script type="text/javascript">
		$(document).ready(function() {
			var hobbies = $('#hobbies').val().split(",");
			var $checkboxes = $("input[type=checkbox]");
			$checkboxes.each(function(id, ele) {
				if (hobbies.indexOf(ele.value) != -1) {
					ele.setAttribute("checked", "checked");
				}
			});

		});
	</script>




</body>
</html>