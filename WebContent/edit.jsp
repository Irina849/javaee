<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="w3-container w3-padding">
		<div class="row h-100 justify-content-center align-items-center">
			<div class="row h-100 justify-content-center align-items-center">
				<div class="container h-100">
					<h1>Edit information about actor</h1>
					<form method="POST" action="EditServlet">


						<input hidden name="id" value="${param.id}">
						<table border="0">
							<tr>
								<td>LastName</td>
								<td><input required placeholder="enter last name"
									pattern="^[а-яА-ЯеЁa-zA-Z]+$" type="text" name="lastname"
									value="${actor.getLastname()}" /></td>
							</tr>
							<tr>
								<td>Name</td>
								<td><input required placeholder="enter first name"
									pattern="^[а-яА-ЯеЁa-zA-Z]+$" type="text" name="name"
									value="${actor.getFirstname()}" /></td>
							</tr>
							<tr>
								<td>Gender</td>

								<td><select name="gender" class="dropDown">

										<option value="male"
											<c:if test="${actor.getGender() == 'male'}">selected</c:if>>male</option>
										<option value="female"
											<c:if test="${actor.getGender() == 'female'}">selected</c:if>>female</option>

								</select></td>

							</tr>
							<tr>
								<td colspan="2"><input
									class="btn btn-outline-dark btn-block" type="submit"
									value="Submit" /> <a class="btn btn-outline-dark btn-block"
									href="dann">Cancel</a></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>