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
                    <select class="form-control" id="selectManuf" onchange="selectManufacturer(this)" name="manuf">
                        <c:forEach items="${AllManufacturers}" var="manuf">
                            <option value="${manuf.id}">${manuf.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="input-group mb-2">
                    <select class="form-control" id="selectModel" name="model">

                    </select>
                </div>
                        <div class="input-group mb-2">
                            <select class="form-control" id="selectCategory" name="category">
                                <c:forEach items="${AllCategory}" var="category">
                                    <option value="${category.id}">${category.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="input-group mb-2">
                            <input type="text" id="Part" class="form-control" name="part" placeholder="Part`s name">
                        </div>
                        <div class="input-group mb-2">
                            <input type="text" id="Price" class="form-control" name="price" placeholder="Price">
                        </div>
                        <div class="input-group mb-2">
                            <input type="text" id="Count" class="form-control" name="count" placeholder="Count">
                        </div>

                    <div class="input-group mb-2">
                    <input type="file" multiple="multiple" id="inputFile" accept=".txt,image/*">
                    </div>


                        <button type="button" class="btn btn-success" onclick="addPart()">Success</button>
                </form>
                <script>
                    var xhr = new XMLHttpRequest();
                    function addPart() {
                        var formData = new FormData();
                        formData.append("model", $("#selectModel option:selected").val());
                        formData.append("category", $("#selectCategory option:selected").val());
                        formData.append("price", $("#Price").val() );
                        formData.append("name", $("#Part").val());
                        formData.append("count", $("#Count").val());
                        xhr.open("POST", "http://localhost:8080/admin/admin/adminchik/create");
                        xhr.send(formData);
                    }
                    xhr.onreadystatechange = function () {
                        if (xhr.readyState === 4 && xhr.status === 200)
                        {
                            alert("Adding complete");
                        }
                    };


                    function selectManufacturer() {
                        $.ajax({
                            url: "http://localhost:8080/admin/admin/adminchik/create-validate?id=" + $("#selectManuf option:selected").val(),
                            success: function(result){
                                clearDropDownMenu();
                                $.each(JSON.parse(result), function( index, value ) {
                                    createDropDownMenu(value.id, value.name)
                                });
                            }
                        });
                    }

                    function clearDropDownMenu() {
                        const dropDown = document.getElementById("selectModel");
                        dropDown.innerHTML = "";
                    }

                    function createDropDownMenu(id, name) {
                        const dropDown = document.getElementById("selectModel");
                        const option = document.createElement("option");
                        option.value = id;
                        option.textContent = name;
                        dropDown.appendChild(option);
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