<%--
  Created by IntelliJ IDEA.
  User: Zamuna
  Date: 8/7/2017
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
    <form class="form-horizontal" action="/series" method="post">
        <div class="form-group">
            <label for="inputseries" class="col-md-2 control-label">series nameOfTheShow</label>
            <div class="col-md-8">
                <input type="text" class="form-control" id="inputseries" placeholder="series nameOfTheShow" name="nameOfTheShow">
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
                <input type="text" class="form-control" id="inputDescription" placeholder="Description" name="birthPlace" >
            </div>
        </div>
        <div class="form-group">
            <label for="inputStudio" class="col-md-2 control-label">Studio</label>
            <div class="col-md-8">
                <input type="text" class="form-control" id="inputStudio" placeholder="Studio" name="studio" >
            </div>
        </div>
        <div class="form-group">
            <label for="inputStudio" class="col-md-2 control-label">Genre</label>
            <div class="col-md-8">
                <input type="text" class="form-control" id="inputGenre" placeholder="Genre" name="genre"  >
            </div>
        </div>
        <div class="form-group">
            <label for="inputRating" class="col-md-2 control-label">Rating</label>
            <div class="col-md-8">
                <input type="text" class="form-control" id="inputRating" placeholder="Rating" name="rating"  >
            </div>
        </div>
        <div class="form-group">
            <label for="inputRating" class="col-md-2 control-label">Director</label>
            <%--<div class="col-md-8">--%>
                <%--<input type="text" class="form-control" id="inputDirector" placeholder="Director" name="director" >--%>
            <%--</div>--%>

            <select class="col-md-4" name="director">
            <c:forEach var="direct" items="${directors}">
                <option value="${direct}">${direct.name}</option>
            </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="inputActor" class="col-md-2 control-label">Actor</label>
            <select multiple class="col-md-4" name="artistList" id="inputActor">
                <c:forEach var="artist" items="${artists}">
                    <option value="${artist}">${artist.name}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-md-8">
                <button type="submit" class="btn btn-success" value="update">Save</button>
            </div>
        </div>
</form>

<%@include file="footer.jsp"%>
