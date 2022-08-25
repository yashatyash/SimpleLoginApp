<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
    </script>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Login Please !</h1>
        </div>
    </div>
</section>
<section class="container">
    <form:form modelAttribute="employee" method="post">
        <table align="center" class="table">
            <tr>
                <td>Enter email id </td>
                <td>
                    <form:input path="email" cssClass="fields"/>
                    <form:errors path="email" cssClass="text-danger"/>
                </td>
            </tr>
            <tr>
                <td>Enter password</td>
                <td>
                    <form:input path="password" cssClass="fields"/>
                    <form:errors path="password" cssClass="text-danger"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:button class="btn btn-primary btn-large"
                                 style="font-size: 20px;border-radius: 5px" >Login
                    </form:button>
                </td>
            </tr>
        </table>
    </form:form>
</section>
</body>
</html>