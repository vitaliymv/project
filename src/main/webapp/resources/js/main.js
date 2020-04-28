function registration() {
    var formData1 = new FormData();
    formData1.append("userName", $("#username").val());
    formData1.append("password", $("#password").val());
    formData1.append("confirmPassword", $("#cpass").val());
    console.log(formData1);
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8080/registration");
    xhr.send(formData1);
}

function login() {
    var formData = new FormData();
    formData.append("userName", $("#user").val());
    formData.append("password", $("#pass").val());
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8080/login");
    xhr.send(formData);
}


