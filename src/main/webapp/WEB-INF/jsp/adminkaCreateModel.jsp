<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Admin Panel</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
          crossorigin="anonymous">
    <style>
        body {
            background-image: url('https://images.unsplash.com/photo-1579546929518-9e396f3cc809?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80');
            background-size: cover;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<div class="container mt-5">
    <a href = "http://localhost:8080/admin/admin/adminchik" type="button" class="btn btn-info btn-lg ">Main page</a>
    <div class="d-flex justify-content-center ">
        <div class="row">

            <div class="col-xs-2">
                <div class="card card-body">
                    <form name="qweqwe">
                        <div class="input-group mb-2">
                            <select class="form-control" id="ManufacturersSel" name="manuf">
                                <c:forEach items="${AllManufacturers}" var="manuf">
                                    <option value="${manuf.id}">${manuf.name}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="input-group mb-2">
                            <input type="text" id="model" class="form-control" name="model" placeholder="Model`s name">
                        </div>

                        <button type="button" class="btn btn-success" onclick="addModel()">Add model</button>
                    </form>
                    <script>
                        function addModel() {
                            var formDataModel = new FormData();
                            formDataModel.append("manufacturer", $("#ManufacturersSel option:selected").val());
                            formDataModel.append("name", $("#model").val());
                            console.log(formDataModel);
                            var xhr = new XMLHttpRequest();
                            xhr.open("POST", "http://localhost:8080/admin/admin/adminchik/add-model");
                            xhr.send(formDataModel);
                            console.log($("#selectModel option:selected").val())
                        }
                    </script>
                </div>
            </div>

        </div>

    </div>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.js"
        integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
        crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>

</body>
</html>