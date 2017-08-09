<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
<div class="container">
	<h1>Directors</h1>
	<table class="table table-striped">
	<c:forEach var="director" items="${directors}">
	<tr>
		<td>${director.id}</td>
		<td>${director.name}</td>
		<%--<td>${director.biography}</td>--%>
		<%--<td>${director.price}</td>--%>
		<td><a href="directors/${director.id}">Edit</a></td>
	</tr>
	</c:forEach>
	</table>

	<a href="/addDirector" class="label label-info"> Add Director</a>
</div>
<%@include file="footer.jsp"%>