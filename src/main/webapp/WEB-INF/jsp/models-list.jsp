<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="../../resources/css/style.css" rel="stylesheet" type="text/css" >
</head>



<body>
<div class="container">
    <jsp:include page="navbar.jsp"/>
    <div class="row">
        <div class="col-lg-3">
            <br><br><br>

            <h1>AutoLux</h1>
            <h4>Auto parts store</h4>
            <br><br><br>


            <h3 class="text-dark"> Catalog </h3>
                <c:forEach items="${models}" var="model">
                    <a href="/models/${model.id}" type="button" class="list-group-item">
                        <h5 class="text-muted">${model.name}</h5>
                    </a>
                </c:forEach>
        </div>

        <div class="col">
            <br><br><br>
            <div class="col-12 mt-3" style="border-bottom: 1px solid">
                <div class="card">
                    <div class="card-horizontal">
                        <div class="img-square-wrapper">
<%--                            manufacturer.image--%>
                            <br><br><br><br>
                            <img class="" src="https://cdn.worldvectorlogo.com/logos/toyota.svg" style="width: 140px" alt="Card image cap">
                        </div>
                        <div class="card-body">
<%--                            manufacturer.name--%>
                            <h3 class="card-title">TOYOTA</h3>
<%--                            manufacturer.description--%>
                            <p class="card-text" >Some quick example text to build on the card
                                title and make up the bulk of the card's content.
                                Some quick example text to build on the card
                                title and make up the bulk of the card's content.
                                Some quick example text to build on the card
                                title and make up the bulk of the card's content.
                                Some quick example text to build on the card
                                title and make up the bulk of the card's content.
                                Some quick example text to build on the card
                                title and make up the bulk of the card's content.
                                Some quick example text to build on the card
                                title and make up the bulk of the card's content.
                                Some quick example text to build on the card
                                title and make up the bulk of the card's content.
                                Some quick example text to build on the card
                                title and make up the bulk of the card's content.
                            </p>
                        </div>
                    </div>
                </div>
            </div>

<%--            partsByManufacturer--%>
        </div>
    </div>

</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>

</body>
</html>