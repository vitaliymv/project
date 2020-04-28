<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<br>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: white; border-bottom: 2px solid; border-top: 2px solid">

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/"><h5 style="font-family: Algerian">Home</h5> <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/about-us"><h5 style="font-family: Algerian">About us</h5><span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/contacts"><h5 style="font-family: Algerian">Contacts</h5> <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/admin/admin/adminchik"><h5 style="font-family: Algerian">Admin panel</h5> <span class="sr-only">(current)</span></a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <a class="nav-link" href="${userId}/user-bucket"><h5 class="text-warning" style="font-family: Algerian">Bucket: 0.00$</h5> </a>
        </form>

        <form class="form-inline my-2 my-lg-0">
            <a class="nav-link" href="/logout"><h5 class="text-dark" style="font-family: Algerian">Log out</h5> </a>
        </form>
    </div>
</nav>