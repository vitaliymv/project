<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Admin Panel</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
        body {
            background-image: url('https://images.unsplash.com/photo-1579546929518-9e396f3cc809?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80');
            background-size: cover;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>

<body>
<div class="view rgba-gradient ">

    <div class="col rgba-gradient">
        <div class="d-flex justify-content-center align-items-center">
            <p>
                <a href="/admin/admin/adminchik/create" type="button" class="btn btn-success btn">
                    Add new part
                </a>
                <a href="/admin/admin/adminchik/add-category" type="button" class="btn btn-success btn">
                    Add new category
                </a>
                <a class="btn btn-primary" data-toggle="collapse" href="#multiCollapseExample1"
                   role="button" aria-expanded="false" aria-controls="multiCollapseExample1">
                    List all parts
                </a>
                <a href="/admin/admin/adminchik/add-manuf" type="button" class="btn btn-success">
                    Add manufacturer
                </a>

                <a href="/admin/admin/adminchik/add-model" type="button" class="btn btn-success">
                    Add model
                </a>

                <a href="/" type="button" class="btn btn-warning">
                    To user page
                </a>

                <a href="/login" type="button" class="btn btn-warning">
                    To login page
                </a>
            </p>
        </div>
        <div class="d-flex justify-content-center align-items-center">
            <p>
                <br><br>
            <div class="collapse multi-collapse" id="multiCollapseExample1">
                <div class="container">
                    <a class="btn btn-primary" data-toggle="collapse" href="#multiCollapseExample2"
                       role="button" aria-expanded="false" aria-controls="multiCollapseExample2">
                        Manufacturer with model
                    </a>
                    <a class="btn btn-primary" data-toggle="collapse" href="#multiCollapseExample3"
                       role="button" aria-expanded="false" aria-controls="multiCollapseExample3">
                        Category
                    </a>
                    <a class="btn btn-primary" data-toggle="collapse" href="#multiCollapseExample4"
                       role="button" aria-expanded="false" aria-controls="multiCollapseExample4">
                        Parts all
                    </a>
                </div>
        </div>
            </div>
                <div class="collapse multi-collapse" id="multiCollapseExample2">
                    <div class="container">
                        <table class="table table-striped table-dark">
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Manufacturer name</th>
                                <th scope="col">Model name</th>
                            </tr>
                            <c:forEach items="${AllModels}" var="model">
                                <tr>
                                    <th scope="row">${model.id}</th>
                                    <th scope="row">${model.manufacturer.name}</th>
                                    <th scope="row">${model.name}</th>

                                    <td>
                                        <a href="/admin/admin/adminchik/deleting?id=${model.id}" type="button" class="btn btn-danger">
                                            Delete
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
        <div class="collapse multi-collapse" id="multiCollapseExample3">
            <div class="container">
                <table class="table table-striped table-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Manufacturer name</th>
                        <th scope="col">Model name</th>
                    </tr>
                    <c:forEach items="${AllCategory}" var="category">
                        <tr>
                            <th scope="row">${category.id}</th>
                            <th scope="row">${category.name}</th>
                            <td>
                                <a href="/admin/admin/adminchik/deleting?id=${model.id}" type="button" class="btn btn-danger">
                                    Delete
                                </a>
                            </td>

                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
                <div class="collapse multi-collapse" id="multiCollapseExample4">
                    <div class="container">
                        <table class="table table-striped table-dark">
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Name</th>
                                <th scope="col">Price</th>
                                <th scope="col">Count</th>
                                <th scope="col">Model name</th>
                                <th scope="col">Category</th>
                            </tr>
                            <c:forEach items="${AllParts}" var="prod">
                                <tr>
                                    <td>${prod.id}</td>
                                    <td>${prod.name}</td>
                                    <td>${prod.price}</td>
                                    <td>${prod.count}</td>
                                    <td>${prod.model.name}</td>
                                    <td>${prod.category.name}</td>
                                    <td>
                                        <a href="/admin/admin/adminchik/editing/${prod.id}" type="button" class="btn btn-primary">
                                            Edit
                                        </a>
                                    </td>
                                    <td>
                                        <a href="/admin/admin/adminchik/deleting?id=${prod.id}" type="button" class="btn btn-danger">
                                            Delete
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
        </div>
    </div>










</body>
</html>