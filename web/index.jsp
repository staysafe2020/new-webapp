<%-- 
    Document   : index
    Created on : 12 Mar, 2020, 9:54:08 PM
    Author     : arpit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Staysafe</title>
        <!--this is the link for tab bar icon-->
        <link rel="shortcut icon" type="image/png" href="Untitled design.png">

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">

        <!--google font for highlight-->
        <link href="https://fonts.googleapis.com/css?family=Amaranth|Bowlby+One+SC|Coda+Caption:800&display=swap" rel="stylesheet">

        <!--this is the file of internal css-->
        <link rel="stylesheet" href="index.css">

        <script src="index.js"></script>

    </head>
    <body>
        <div class="sidenav">
            <div class="login-main-text">
                <h2 id="wel">Welcome</h2>
                <h2 id="to">To</h2>
                <h2 id="stay">Staysafe</h2>
            </div>
        </div>
        <div class="main">
            <div class="col-md-6 ">
                <div class="card shadow" style="border-radius: 15px; background-color: #000; margin-top: 200px;">
                    <div class="card-body">
                        <!--<img src="IMG-20200325-WA0034.jpg" class="rounded-circle shadow" width="150px" height="150px" alt="logo">-->
                        <div class="login-form">
                            <form>
                                <div class="form-group">
                                    <label style="color: #FFF;">Email</label>
                                    <input type="text" class="form-control shadow" placeholder="User Name" style="border-radius: 10px;">
                                </div>
                                <div class="form-group">
                                    <label style="color: #FFF;">Password</label>
                                    <input type="password" class="form-control shadow" placeholder="Password" style="border-radius: 10px;">
                                </div>
                                <button type="submit" class="btn btn-light btn-block shadow" onclick="redi();" style="border-radius: 10px;">Login</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>