


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
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
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
            <h3>Category</h3>
            <c:forEach items = "${category}" var="category"  >
                <a href="/models/${modelId}/${category.id}" class="list-group-item text-muted">
                    <h5>${category.name}</h5>
                </a>
            </c:forEach>
        </div>

        <div class="col">
            <br><br><br>
            <div class="col-12 mt-3">
                <div class="card"  style="border-bottom: 1px solid">
                    <div class="card-horizontal">
                        <div class="img-square-wrapper">
                            <%--                            manufacturer.image--%>
                            <br><br><br><br>
                            <img class="" src="http://placehold.it/320x240" style="width: 200px" alt="Card image cap">
                        </div>
                        <div class="card-body">
                            <%--                            manufacturer.name--%>
                            <h3 class="card-title">(TOYOTA) name.manufacturer</h3>
                            <%--                            manufacturer.description--%>
                            <p class="card-text">(description) Some quick example text to build on the card
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
                <br> <br> <br>
                <div class="row">
                    <c:forEach items = "${partsByModel}" var="parts">
                        <div class="col-lg-3 ">
                            <div class="card h-70">
                                <a href="/parts/${parts.id}"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
                                <div class="card-body">
                                    <h5 class="card-title">
                                        <a href="/parts/${parts.id}">${parts.name}</a>
                                    </h5>
                                    <h5>${parts.price} $</h5>
                                    <p class="card-text">${parts.model.name}   ${parts.category.name}</p>
                                    <a href="" type="button" class="btn btn-success">
                                        Add to bucket
                                    </a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>

            </div>

            <%--            partsByManufacturer--%>
        </div>

    </div>

</div>

</body>
</html>