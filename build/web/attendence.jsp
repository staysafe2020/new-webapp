<%-- 
    Document   : attendence
    Created on : 25 Mar, 2020, 5:37:09 PM
    Author     : arpit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Dashboard</title>
        <link rel="icon" type="image/png" href="img/icons/favicon.ico"/>

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css"/>

        <!-- Custom styles for this template-->
        <link href="css/sb-admin-2.min.css" rel="stylesheet">


    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="#">
                    <div class="sidebar-brand-icon">
                        <img src="img/logo2.jpg" class="img-fluid" style="border-radius: 50px; margin-top: 10px; margin-bottom: 10px;" width="65" height="65">
                    </div>
                    <div class="sidebar-brand-text mx-3">Staysafe</div>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Parent Module</span></a>
                </li>
                <!-- Divider -->
                <hr class="sidebar-divider">

                <!-- Heading -->
                <div class="sidebar-heading">
                    Items
                </div>

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true"
                       aria-controls="collapsePages">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Pages</span>
                    </a>
                    <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">Main Pages</h6>
                            <a class="collapse-item" href="user.jsp">User Profile</a>
                            <a class="collapse-item" href="result.jsp">Result</a>
                            <h6 class="collapse-header">Fees Section</h6>
                            <a class="collapse-item" href="fees.jsp">Fees</a>
                            <div class="collapse-divider"></div>
                            <h6 class="collapse-header">Attendence</h6>
                            <a class="collapse-item active" href="#">Attendence</a>
                            <div class="collapse-divider"></div>
                            <h6 class="collapse-header">Notice Board</h6>
                            <a class="collapse-item" href="notice.jsp">Notice</a>
                        </div>
                    </div>
                </li>


                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">
                <li class="nav-item active">
                    <a class="nav-link" href="aboutus.jsp">
                        <i class="fas fa-code"></i>
                        <span>About US</span></a>
                </li> 

                <!--Divider-->
                <hr class="sidebar-divider d-none d-md-block">
                <li class="nav-item active">
                    <a class="nav-link" href="#" data-toggle="modal" data-target="#logoutModal">
                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                        Logout
                    </a>
                </li>

                <!-- Sidebar Toggler (Sidebar) -->
                <div class="text-center d-none d-md-inline">
                    <button class="rounded-circle border-0" id="sidebarToggle"></button>
                </div>

            </ul>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>

                        <a class="navbar-brand" href="#">Attendence</a>

                        <!-- Topbar Navbar -->
                        <ul class="navbar-nav ml-auto">

                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                            <li class="nav-item dropdown no-arrow d-sm-none">
                               

                                <!-- Nav Item - User Information -->
                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown"
                                   aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small">User Name</span>
                                    <img class="img-profile rounded-circle" src="img/LOGO.png">
                                </a>
                                <!-- Dropdown - User Information -->
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                                    <a class="dropdown-item" href="user.jsp">
                                        <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Profile
                                    </a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Logout
                                    </a>
                                </div>
                            </li>

                        </ul>

                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">


                        <!-- Content Row -->
                        <div class="row">

                            <!--total students Card Example -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-left-primary shadow h-100 py-2 animate__animated animate__fadeInLeft" style="background-color: #FF0000;">
                                    <div class="card-body">
                                        <div class="row no-gutters align-items-center">
                                            <div class="col mr-2">
                                                <div class="text-xs font-weight-bold text-uppercase mb-1" style="color: white;">Total Students</div>
                                                <div class="h5 mb-0 font-weight-bold" style="color: white;">1000</div>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-user-friends" style="color: white;"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <!-- total girls Card Example -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-left-success shadow h-100 py-2 animate__animated animate__fadeInLeft" style="background-color: #FFCD00;">
                                    <div class="card-body">
                                        <div class="row no-gutters align-items-center">
                                            <div class="col mr-2">
                                                <div class="text-xs font-weight-bold text-uppercase mb-1" style="color: white;">Total girls</div>
                                                <div class="h5 mb-0 font-weight-bold" style="color: white;">500</div>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-user-friends" style="color: white;"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <!-- completed task Card Example -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-left-success shadow h-100 py-2 animate__animated animate__fadeInLeft" style="background-color: #17a673;">
                                    <div class="card-body">
                                        <div class="row no-gutters align-items-center">
                                            <div class="col mr-2">
                                                <div class="text-xs font-weight-bold text-uppercase mb-1" style="color: white;">Total boys</div>
                                                <div class="h5 mb-0 font-weight-bold" style="color: white;">500</div>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-user-friends" style="color: white;"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <!-- Pending tasks Card Example -->
                            <div class="col-xl-3 col-md-6 mb-4">
                                <div class="card border-left-success shadow h-100 py-2 animate__animated animate__fadeInLeft" style="background-color: #008BFF;">
                                    <div class="card-body">
                                        <div class="row no-gutters align-items-center">
                                            <div class="col mr-2">
                                                <div class="text-xs font-weight-bold text-uppercase mb-1" style="color: white;">Teachers</div>
                                                <div class="h5 mb-0 font-weight-bold" style="color: white;">20</div>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-user-friends" style="color: white;"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>

                        <!--row content-->
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="card shadow animate__animated animate__fadeInUp" style="height: 750px;">
                                    <div
                                        class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                        <h6 class="m-0 font-weight-bold text-primary">Attendence</h6>
                                        <div class="text-right">
                                            <select class="form-control form-control-sm" style="border-radius: 5px;">
                                                <option class="active">January</option>
                                                <option>February</option>
                                                <option>March</option>
                                                <option>April</option>
                                                <option>May</option>
                                                <option>June</option>
                                                <option>July</option>
                                                <option>August</option>
                                                <option>September</option>
                                                <option>October</option>
                                                <option>November</option>
                                                <option>December</option>
                                            </select>
                                        </div>
                                    </div>
                                    <!--card Body-->
                                    <div class="card-body">
                                        <table class="table table-hover">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Date</th>
                                                    <th scope="col">Lecture 1</th>
                                                    <th scope="col">Lecture 2</th>
                                                    <th scope="col">Lecture 3</th>
                                                    <th scope="col">Lecture 4</th>
                                                    <th scope="col">Lecture 5</th>
                                                    <th scope="col">Lecture 6</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="row">1</th>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>

                                                </tr>
                                                <tr>
                                                    <th scope="row">2</th>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>

                                                </tr>
                                                <tr>
                                                    <th scope="row">3</th>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>

                                                </tr>
                                                <tr>
                                                    <th scope="row">4</th>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>
                                                    <td>Present</td>

                                                </tr>
                                            </tbody>
                                        </table>

                                    </div>

                                </div>
                            </div>

                        </div>

                    </div>
                    <!-- End of Main Content -->

                    <!-- Footer -->
                    <footer class="sticky-footer bg-white shadow" style="margin-top: 50px;">
                        <div class="container my-auto">
                            <div class="copyright text-right my-auto">
                                ©
                                <script>
                                    document.write(new Date().getFullYear())
                                </script>
                                <a href="#">StaySafe</a>
                            </div>
                        </div>
                    </footer>
                    <!-- End of Footer -->

                </div>
                <!-- End of Content Wrapper -->

            </div>
            <!-- End of Page Wrapper -->

            <!-- Scroll to Top Button-->
            <a class="scroll-to-top rounded" href="#page-top">
                <i class="fas fa-angle-up"></i>
            </a>

            <!-- Logout Modal-->
            <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">×</span>
                            </button>
                        </div>
                        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                            <a class="btn btn-primary" href="login.jsp">Logout</a>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Bootstrap core JavaScript-->
            <script src="vendor/jquery/jquery.min.js"></script>
            <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

            <!-- Core plugin JavaScript-->
            <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

            <!-- Custom scripts for all pages-->
            <script src="js/sb-admin-2.min.js"></script>

            <!-- Page level plugins -->
            <script src="vendor/chart.js/Chart.min.js"></script>

            <!-- Page level custom scripts -->
            <script src="js/demo/chart-area-demo.js"></script>
            <script src="js/demo/chart-pie-demo.js"></script>

    </body>

</html>