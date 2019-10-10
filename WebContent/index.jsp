<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
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
<title>JSP with Table</title>
</head>
<body>
	<div class="col-sm-12 my-auto">
		<div class="col-sm-12 my-auto">
			<h1 class="my-lg-4" align='center'>ACTORS</h1>
			<form action="AddActorServlet">
				<input class="btn btn-outline-dark btn-block" type="submit"
					value="New" />
			</form>
			<br>
			<div class="text-center">
				<table class="table table-condensed" border="3">
					<tr>
						<th>lastname</th>
						<th>name</th>
						<th>gender</th>
					</tr>
					<%-- //Create row of table --%>

					<c:forEach var="actor" items="${act}">
						<tr>

						<td class="align-middle"><c:out value="${actor.getLastname()}"/></td>
						<td class="align-middle"><c:out value="${actor.getFirstname()}"/></td>
						<td class="align-middle"><c:out value="${actor.getGender()}"/></td>
						<td style="width: 200px;" class="align-middle col-sm-3">
							<form method="GET">
								<input hidden name="id" value="<c:out value="${actor.getId()}"/>">
								<button formaction="DeleteServlet"
									class="btn btn-outline-dark btn-lg" type="submit"
									onclick="return confirm('Do you want to delete?')">Delete</button>
								<button formaction="EditServlet"
									class="btn btn-outline-dark btn-lg " type="submit">Edit</button>
							</form>

						</td>
					</tr>
					</c:forEach>

				</table>
			</div>
		</div>
	</div>
</body>
</html>