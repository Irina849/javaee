<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
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
<title>Create actor</title>
</head>
<body>
	<div class="row h-100 justify-content-center align-items-center">
		<div class="row h-100 justify-content-center align-items-center">
			<div class="container h-100">
				<h3>Create actor</h3>
				<div class="row h-100 justify-content-center align-items-center">
					<div class="form-group">
						<form method="POST" action="AddActorServlet">
							<table border="0">
								<tr>
									<td>LastName</td>
									<td><input required placeholder="enter last name"
										title="only letters A-Z are available"
										pattern="^[а-яА-ЯеЁa-zA-Z]+$" type="text" name="lastname" " /></td>
								</tr>
								<tr>
									<td>Name</td>
									<td><input required placeholder="enter first name"
										title="only letters A-Z are available"
										pattern="^[а-яА-ЯеЁa-zA-Z]+$" type="text" name="name" " /></td>
								</tr>
								<tr>
									<td>Gender</td>


									<td><select name="gender" class="dropDown">
											<option value="male"
												<%out.print("male".equals("${(param.gender)}") ? "selected" : "");%>>male</option>
											<option value="female"
												<%out.print("female".equals("${(param.gender)}") ? "selected" : "");%>>female</option>
									</select></td>
								</tr>
								<tr>
									<td colspan="2"><input
										class="btn btn-outline-dark btn-block" type="submit"
										value="Submit" /></td>
								</tr>
							</table>
						</form>
					
						<a class="btn btn-outline-dark btn-block" href="dann">Cancel</a>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>