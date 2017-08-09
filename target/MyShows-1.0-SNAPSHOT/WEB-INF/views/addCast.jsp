<%--
  Created by IntelliJ IDEA.
  User: Zamuna
  Date: 8/7/2017
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
    <form class="form-horizontal" action="artists" method="post">
    <div class="form-group">
        <label for="inputActor" class="col-md-2 control-label">Actor Name</label>
        <div class="col-md-8">
            <input type="text" class="form-control" id="inputActor" placeholder="Actor Name" name="name">
        </div>
    </div>
    <div class="form-group">
        <label for="inputRole" class="col-md-2 control-label">Birthplace</label>
        <div class="col-md-8">
            <input type="text" class="form-control" id="inputRole" placeholder="Role" name="birthPlace" >
        </div>
    </div>
        <div class="form-group">
            <label for="inputBiography" class="col-md-2 control-label">Biography</label>
            <div class="col-md-8">
                <input type="text" class="form-control" id="inputBiography" placeholder="Biography" name="birthPlace" >
            </div>
        </div>
        <div class="form-group">
            <label for="inputPrice" class="col-md-2 control-label">Price</label>
            <div class="col-md-8">
                <input type="text" class="form-control" id="inputPrice" placeholder="Price" name="price" >
            </div>
        </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-md-8">
            <button type="submit" class="btn btn-primary">Save</button>
        </div>
    </div>
</form>

<%@include file="footer.jsp"%>
