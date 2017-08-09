<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
<form class="form-horizontal" action="../artists/${artist.id}" method="post">
	<div class="form-group">
		<label for="inputActor" class="col-md-2 control-label">Actor Name</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputActor" placeholder="Actor Name" name="name" value="${artist.name}">
		</div>
	</div>
	<div class="form-group">
		<label for="inputRole" class="col-md-2 control-label">Birthplace</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputRole" placeholder="Role" name="birthPlace" value="${artist.birthPlace}">
		</div>
	</div>
	<div class="form-group">
		<label for="inputBiography" class="col-md-2 control-label">Biography</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputBiography" placeholder="Biography" name="birthPlace" value="${artist.biography}">
		</div>
	</div>
	<div class="form-group">
		<label for="inputPrice" class="col-md-2 control-label">Price</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputPrice" placeholder="Price" name="price" value="${artist.price}" >
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-md-8">
			<button type="submit" class="btn btn-success" value="update">Update</button>
		</div>
	</div>
</form>
<form action="delete?artistId=${artist.id}" method="post">
	<button type="submit" class="btn btn-success">Delete</button>
</form>
<%@include file="footer.jsp"%>
