<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
<form class="form-horizontal" action="../series/${series.id}" method="post">
	<div class="form-group">
		<label for="inputseries" class="col-md-2 control-label">NameOfTheShow</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputseries" placeholder="NameOfTheShow" name="nameOfTheShow" value="${series.nameOfTheShow}">
		</div>
	</div>
	<div class="form-group">
		<label for="inputRole" class="col-md-2 control-label">Birthplace</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputRole" placeholder="Role" name="birthPlace" value="${series.birthPlace}">
		</div>
	</div>
	<div class="form-group">
		<label for="inputDescription" class="col-md-2 control-label">Description</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputDescription" placeholder="Description" name="birthPlace" value="${series.description}">
		</div>
	</div>
	<div class="form-group">
		<label for="inputStudio" class="col-md-2 control-label">Studio</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputStudio" placeholder="Studio" name="studio" value="${series.studio}" >
		</div>
	</div>
	<div class="form-group">
		<label for="inputStudio" class="col-md-2 control-label">Genre</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputGenre" placeholder="Genre" name="genre" value="${series.genre}" >
		</div>
	</div>
	<div class="form-group">
		<label for="inputRating" class="col-md-2 control-label">Rating</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputRating" placeholder="Rating" name="rating" value="${series.rating}" >
		</div>
	</div>
	<div class="form-group">
		<label for="inputRating" class="col-md-2 control-label">Director</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputDirector" placeholder="Director" name="director" value="${series.director}" >
		</div>
	</div>
	<div class="form-group">
		<label for="inputActor" class="col-md-2 control-label">Actor</label>
		<div class="col-md-8">
			<input type="text" class="form-control" id="inputActor" placeholder="Actor" name="artistList" value="${series.artistList}" >
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-md-8">
			<button type="submit" class="btn btn-success" value="update">Update</button>
		</div>
	</div>
</form>
<form action="delete?seriesId=${series.id}" method="post">
	<button type="submit" class="btn btn-success">Delete</button>
</form>
<%@include file="footer.jsp"%>
