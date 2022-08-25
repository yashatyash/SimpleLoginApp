<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>User Not Found</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
    </script>

    <style>
        .table
        {
            alignment: center;
            border: none;
        }

        .fields
        {
            width: 50%;
            border-style: revert;
            border-radius: 10px;
        }
    </style>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1 class="text-danger">Error</h1>
        </div>
    </div>
</section>
<section class="container">
    <%

    %>
    <div class="alert-danger">
        <table class="text-danger">
            <tr>
                <td>
                    <p>
                        ${invalidEmail}
                    </p>
                </td>
            </tr>
            <tr>
                <td>
                    <p>
                        ${message}
                    </p>
                </td>
            </tr>
        </table>
    </div>
</section>
</body>
</html>