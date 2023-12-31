<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- 
    Document   : admin
    Created on : May 14, 2023, 10:34:54 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Star Admin2 </title>
        <!-- plugins:css -->
        <link rel="stylesheet" href="Admin/vendors/feather/feather.css">
        <link rel="stylesheet" href="Admin/vendors/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="Admin/vendors/ti-icons/css/themify-icons.css">
        <link rel="stylesheet" href="Admin/vendors/typicons/typicons.css">
        <link rel="stylesheet" href="Admin/vendors/simple-line-icons/css/simple-line-icons.css">
        <link rel="stylesheet" href="Admin/vendors/css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- Plugin css for this page -->
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <link rel="stylesheet" href="Admin/css/vertical-layout-light/style.css">
        <!-- endinject -->
        <link rel="shortcut icon" href="Admin/images/favicon.png" />
        <style>
            a {
                all: unset;
                cursor: pointer;
            }
        </style>
    </head>

    <body>
        <div class="container-scroller">
            <!-- partial:../../partials/_navbar.html -->
            <nav class="navbar default-layout col-lg-12 col-12 p-0 fixed-top d-flex align-items-top flex-row">
                <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-start">
                    <div class="me-3">
                        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-bs-toggle="minimize">
                            <span class="icon-menu"></span>
                        </button>
                    </div>
                    <div>
                        <a class="navbar-brand brand-logo" href="DashboardController">
                            <img src="images/logo.svg" alt="logo" />
                        </a>
                        <a class="navbar-brand brand-logo-mini" href="#">
                            <img src="images/logo.svg" alt="logo" />
                        </a>
                    </div>
                </div>
                <div class="navbar-menu-wrapper d-flex align-items-top"> 
                    <ul class="navbar-nav ms-auto">

                        <li class="nav-item dropdown d-none d-lg-block">
                            <a class="nav-link dropdown-bordered dropdown-toggle dropdown-toggle-split" id="messageDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false"> Select Category </a>
                        </li>

                        <li class="nav-item d-none d-lg-block">
                            <div id="datepicker-popup" class="input-group date datepicker navbar-date-picker">
                                <span class="input-group-addon input-group-prepend border-right">
                                    <span class="icon-calendar input-group-text calendar-icon"></span>
                                </span>
                                <input type="text" class="form-control">
                            </div>
                        </li>

                        <li class="nav-item">
                            <form class="search-form" action="#">
                                <i class="icon-search"></i>
                                <input type="search" class="form-control" placeholder="Search Here" title="Search here">
                            </form>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link count-indicator" id="notificationDropdown" href="#" data-bs-toggle="dropdown">
                                <i class="icon-mail icon-lg"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list pb-0" aria-labelledby="notificationDropdown">
                            </div>
                        </li>

                        <li class="nav-item dropdown"> 
                            <a class="nav-link count-indicator" id="countDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false">
                                <i class="icon-bell"></i>
                                <span class="count"></span>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list pb-0" aria-labelledby="countDropdown">
                            </div>
                        </li>

                        <li class="nav-item dropdown d-none d-lg-block user-dropdown">
                            <a class="nav-link" id="UserDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false">
                                <i class="mdi mdi-account-circle"></i> </a>
                            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="UserDropdown">
                                <a href="ProfileAdminController" class="dropdown-item"><i class="dropdown-item-icon mdi mdi-account-outline text-primary me-2"></i> My Profile </span></a>
                                <a href="ChangesPasswordAdminController" class="dropdown-item"><i class="dropdown-item-icon mdi mdi-account-key text-primary me-2"></i> Change Password</a>
                                <a href="LogoutController?logout=2" class="dropdown-item"><i class="dropdown-item-icon mdi mdi-power text-primary me-2"></i>Sign Out</a>
                            </div>
                        </li>

                    </ul>

                    <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-bs-toggle="offcanvas">
                        <span class="mdi mdi-menu"></span>
                    </button>
                </div>
            </nav>

            <!-- partial -->
            <div class="container-fluid page-body-wrapper">
                <!-- partial:../../partials/_settings-panel.html -->
                <div class="theme-setting-wrapper">
                    <div id="settings-trigger"><i class="ti-settings"></i></div>
                    <div id="theme-settings" class="settings-panel">
                        <i class="settings-close ti-close"></i>
                        <p class="settings-heading">SIDEBAR SKINS</p>
                        <div class="sidebar-bg-options selected" id="sidebar-light-theme"><div class="img-ss rounded-circle bg-light border me-3"></div>Light</div>
                        <div class="sidebar-bg-options" id="sidebar-dark-theme"><div class="img-ss rounded-circle bg-dark border me-3"></div>Dark</div>
                        <p class="settings-heading mt-2">HEADER SKINS</p>
                        <div class="color-tiles mx-0 px-4">
                            <div class="tiles success"></div>
                            <div class="tiles warning"></div>
                            <div class="tiles danger"></div>
                            <div class="tiles info"></div>
                            <div class="tiles dark"></div>
                            <div class="tiles default"></div>
                        </div>
                    </div>
                </div>

                <!-- partial -->
                <!-- partial:../../partials/_sidebar.html -->
                <%@include file="leftpage.jsp" %>  
                <!-- partial -->
                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="col-lg-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <div class="d-sm-flex justify-content-between align-items-start">
                                        <div>
                                            <h4 class="card-title card-title-dash">Customer</h4>
                                        </div>
                                        <div>
                                            <form class="search-form" action="CustomerController?service=searchCustomer" method="post">
                                                <input type="text" class="form-control" name="name" placeholder="Search Here" title="Search here">
                                            </form>
                                        </div>
                                        <div>
                                            <a href="CustomerController?service=insertCustomer" class="btn btn-primary text-white me-0"><i class="mdi mdi-account-plus"></i> Add new Customer</a>
                                            <a onclick="exportToExcel()" class="btn btn-primary text-white me-0"><i class="icon-download"></i> Export</a>
                                        </div>
                                    </div>
                                    <div style="text-align: center">
                                        <p class="badge badge-danger">${ms}</p>
                                    </div>  
                                    <div class="table-responsive">
                                        <table class="table table-hover" id="myTable">
                                            <thead>
                                                <tr>
                                                    <th>ID</th>
                                                    <th>Name</th>
                                                    <th>Phone</th>
                                                    <th>Date of birth</th>
                                                    <th>Gender</th>
                                                    <th>Email</th>
                                                    <th>Address</th>
                                                    <th>Username</th>
                                                    <th>Password</th>
                                                    <th>Status</th>
                                                    <th>Update</th>
                                                    <th>Delete</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${data}" var="d">
                                                    <fmt:formatDate value="${d.dob}" pattern="dd-MM-yyyy" var="formattedDate" />
                                                    <tr>
                                                        <td>${d.customer_id}</td>
                                                        <td>${d.name}</td>
                                                        <td>${d.phone}</td>
                                                        <td>${formattedDate}</td>
                                                        <td>${d.gender==false?"Female":"Male"}</td>
                                                        <td>${d.gmail}</td> 
                                                        <td>${d.address}</td> 
                                                        <td>${d.username}</td> 
                                                        <td>******</td> 
                                                        <td>
                                                            <div class="${d.status eq "Active"?" badge badge-opacity-success":"badge badge-opacity-danger"}">
                                                                ${d.status}
                                                            </div>
                                                        </td>
                                                        <td> 
                                                            <form method="post" action="CustomerController"> 
                                                                <input type="hidden" name="service" value="updateStatus">
                                                                <input  type="hidden" name="id" id="id" value="${d.customer_id}"> 
                                                                <Select class="input" name="status" id="status"> 
                                                                    <option ${d.status eq "Active"?"selected":""} value="Active">Active</option>
                                                                    <option ${d.status eq "Deactive"?"selected":""} value="Deactive">Deactive</option>
                                                                </Select> 
                                                                <input type="submit" value="Update">
                                                            </form> 
                                                        </td>
                                                        <!--                                                        <td><div class="badge badge-info"><a href="CustomerController?service=updateCustomer&id=">Update</a></div></td>-->
                                                        <td ><div class="badge badge-danger"><a href="CustomerController?service=deleteCustomer&id=${d.customer_id}">Delete</a></div></td> 
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                        <div style="text-align: center">
                                            <c:choose>
                                                <c:when test="${currentPage > 1}">
                                                    <a href="?page=${currentPage - 1}">Previous</a>
                                                </c:when>
                                                <c:otherwise>
                                                    <span>Previous</span>
                                                </c:otherwise>
                                            </c:choose>
                                            <c:forEach begin="1" end="${totalPages}" varStatus="loop">
                                                <c:choose>
                                                    <c:when test="${loop.index == currentPage}">
                                                        <span>${loop.index}</span>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <c:if test="${id == null}">
                                                            <a href="?page=${loop.index}">${loop.index}</a>
                                                        </c:if>  
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                            <c:choose>
                                                <c:when test="${currentPage < totalPages}">
                                                    <a href="?page=${currentPage + 1}">Next</a>
                                                </c:when>
                                                <c:otherwise>
                                                    <span>Next</span>
                                                </c:otherwise>
                                            </c:choose>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- content-wrapper ends -->
                <!-- partial:../../partials/_footer.html -->
                <!-- partial -->
            </div>
            <!-- main-panel ends -->
        </div>
        <!-- page-body-wrapper ends -->
    </div>
    <!-- container-scroller -->
    <!-- plugins:js -->
    <script src="Admin/vendors/js/vendor.bundle.base.js"></script>
    <!-- endinject -->
    <!-- Plugin js for this page -->
    <script src="Admin/vendors/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
    <!-- End plugin js for this page -->
    <!-- inject:js -->
    <script src="Admin/js/off-canvas.js"></script>
    <script src="Admin/js/hoverable-collapse.js"></script>
    <script src="Admin/js/template.js"></script>
    <script src="Admin/js/settings.js"></script>
    <script src="Admin/js/todolist.js"></script>
    <script src="https://unpkg.com/xlsx/dist/xlsx.full.min.js"></script>
    <script>
                                                function exportToExcel() {
                                                    const table = document.getElementById("myTable");
                                                    const wb = XLSX.utils.table_to_book(table, {sheet: "SheetJS"});
                                                    const wbout = XLSX.write(wb, {bookType: "xlsx", type: "array"});
                                                    saveAsExcelFile(wbout, "customer.xlsx");
                                                }

                                                function saveAsExcelFile(buffer, fileName) {
                                                    const data = new Blob([buffer], {type: "application/octet-stream"});
                                                    const link = document.createElement("a");
                                                    link.href = window.URL.createObjectURL(data);
                                                    link.download = fileName;
                                                    link.click();
                                                }
    </script>
    <!-- endinject -->
    <!-- Custom js for this page-->
    <!-- End custom js for this page-->
</body>

</html>

