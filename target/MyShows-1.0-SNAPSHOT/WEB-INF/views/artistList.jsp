<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
<div class="container">
	<h1>Artists</h1>
	<table class="table table-striped">
	<c:forEach var="artist" items="${artists}">
	<tr>
		<td>${artist.name}</td>
		<td>${artist.birthPlace}</td>
		<td>${artist.biography}</td>
		<td>${artist.price}</td>
		<td><a href="artists/${artist.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>

	<a href="/add" class="label label-info"> Add an Artist</a>
</div>
<%@include file="footer.jsp"%>