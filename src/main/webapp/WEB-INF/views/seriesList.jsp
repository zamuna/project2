<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
<div class="container">
	<h1>Series</h1>
	<table class="table table-striped">
	<c:forEach var="series" items="${series}">
	<tr>
		<td>${series.id}</td>
		<td>${series.description}</td>
		<td>${series.studio}</td>
		<td>${series.genre}</td>
		<td>${series.rating}</td>
		<td>${series.director}</td>
		<td>${series.artist}</td>
		<td><a href="seriess/${series.id}">Edit</a></td>
	</tr>
	</c:forEach>
	</table>

	<a href="/addSeries" class="label label-info"> Add Series</a>
</div>
<%@include file="footer.jsp"%>