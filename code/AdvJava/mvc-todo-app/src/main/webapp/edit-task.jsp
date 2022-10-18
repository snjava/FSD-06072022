<%@page import="todo.bean.TaskBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Task</title>
</head>
<body>
<%@ include file="navbar.jsp" %>
	
	<div align="center">
		<h2>Create New Task</h2>
		
		<% TaskBean bean = (TaskBean) request.getAttribute("task"); %>
		
		<form action="#">
			<input type="hidden" name="id" value="<%=bean.getId()%>">
			Enter Title : <input name="title" value="<%=bean.getTitle()%>">
			<br><br>
			Select Status : <select name="status">
								<option value="open">Open</option>
								<option value="in-progress">In-Progress</option>
								<option value="completed">Completed</option>
							</select>
			<br><br>
			Enter Scheduled Date : <input type="date" name="scheduledOn" value="<%= bean.getScheduledOn() %>">
			<br><br>
			<button type="submit">Update Task</button>
		</form>
	</div>
</body>
</html>