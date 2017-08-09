<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
<form class="form-horizontal" action="../directors/${director.id}" method="post">
	<div class="form-group">
		<label for="inputDirector" class="col-md-2 control-label">Director Name</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputDirector" placeholder="Director Name" name="name" value="${director.name}">
		</div>
	</div>
	<%--<div class="form-group">--%>
		<%--<label for="inputRole" class="col-md-2 control-label">Birthplace</label>--%>
		<%--<div class="col-md-8">--%>
			<%--<input type="text" class="form-control" id="inputRole" placeholder="Role" name="birthPlace" value="${director.birthPlace}">--%>
		<%--</div>--%>
	<%--</div>--%>
	<%--<div class="form-group">--%>
		<%--<label for="inputBiography" class="col-md-2 control-label">Biography</label>--%>
		<%--<div class="col-md-8">--%>
			<%--<input type="text" class="form-control" id="inputBiography" placeholder="Biography" name="birthPlace" value="${director.biography}">--%>
		<%--</div>--%>
	<%--</div>--%>
	<%--<div class="form-group">--%>
		<%--<label for="inputPrice" class="col-md-2 control-label">Price</label>--%>
		<%--<div class="col-md-8">--%>
			<%--<input type="text" class="form-control" id="inputPrice" placeholder="Price" name="price" value="${director.price}" >--%>
		<%--</div>--%>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-md-8">
			<button type="submit" class="btn btn-success" value="update">Update</button>
		</div>
	</div>
</form>
<form action="delete?directorId=${director.id}" method="post">
	<button type="submit" class="btn btn-success">Delete</button>
</form>
<%@include file="footer.jsp"%>
