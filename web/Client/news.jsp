<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%-- 
    Document   : blog
    Created on : May 16, 2023, 9:56:42 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Ultras - Clothing Store eCommerce Store HTML Website Template</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="format-detection" content="telephone=no">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="author" content="">
        <meta name="keywords" content="">
        <meta name="description" content="">
        <link rel="stylesheet" type="text/css" href="Client/css/normalize.css">
        <link rel="stylesheet" type="text/css" href="Client/icomoon/icomoon.css">
        <link rel="stylesheet" type="text/css" media="all" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="Client/css/vendor.css">
        <link rel="stylesheet" type="text/css" href="Client/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
        <!-- script
        ================================================== -->
        <script src="Client/js/modernizr.js"></script>
        <!-- Google tag (gtag.js) -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=G-PV3J437JX5"></script>
        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag('js', new Date());

            gtag('config', 'G-PV3J437JX5');
        </script>
    </head>
    <body>

        <div class="preloader-wrapper">
            <div class="preloader">
            </div>
        </div>

        <header id="header">
            <div id="header-wrap">
                <nav class="primary-nav padding-small">
                    <div class="container">
                        <div class="row d-flex align-items-center">
                            <div class="col-lg-2 col-md-2">
                                <div class="main-logo">
                                    <a href="HomeController">
                                        <img style="width: 60%" src="images/hightechlogo.png" alt="logo">
                                    </a>
                                </div>
                            </div>
                            <div class="col-lg-10 col-md-10">
                                <div class="navbar">

                                    <div id="main-nav" class="stellarnav d-flex justify-content-end right">
                                        <ul class="menu-list">

                                            <li class="menu-item has-sub">
                                            <li><a href="HomeController" class="item-anchor active">Home</a></li>
                                            </li>
                                            <li>
                                                <a href="ShopController" class="item-anchor d-flex align-item-center" data-effect="Shop">Shop</a>
                                            </li>

                                            <li class="menu-item has-sub">
                                                <a href="AboutCustomerController" class="item-anchor d-flex align-item-center" data-effect="About">About<i class="icon icon-chevron-down"></i></a>
                                                <ul class="submenu">
                                                    <li><a href="AboutCustomerController" class="item-anchor">About</a></li>
                                                    <li><a href="PrivacyCustomerController" class="item-anchor">Privacy</a></li>
                                                    <li><a href="ReturnsCustomerController" class="item-anchor">Returns</a></li>
                                                    <li><a href="ConditionsCustomerController" class="item-anchor">Conditions</a></li>
                                                    <li><a href="CareerCustomerController" class="item-anchor">Career</a></li>
                                                    <li><a href="DeliveryCustomerController" class="item-anchor">Delivery</a></li>
                                                </ul>
                                            </li>

                                            <li class="menu-item has-sub">
                                                <a href="ContactCustomerController" class="item-anchor d-flex align-item-center" data-effect="Contact">Contact<span class="text-primary"></span></a>
                                            </li>

                                            <li class="menu-item has-sub">
                                                <a href="NewsCustomerController" class="item-anchor d-flex align-item-center" data-effect="Blog">News</a>
                                            </li>

                                            <li>
                                                <a href="CartController">
                                                    <i class="icon icon-shopping-cart"></i>
                                                </a>
                                            </li>


                                            <c:if test="${empty sessionScope.account}">
                                                <li class="menu-item has-sub">
                                                    <a href="LoginController" class="item-anchor d-flex align-item-center icon icon-user"></i></a>
                                                </li>
                                            </c:if>

                                            <c:if test="${not empty sessionScope.account}">
                                                <li class="menu-item has-sub">
                                                    <a href="HomeController" class="item-anchor d-flex align-item-center icon icon-user"><i class="icon icon-chevron-down"></i></a>
                                                    <ul class="submenu">
                                                        <li><a href="ProfileController" class="item-anchor">Profile</a></li>
                                                        <li><a href="ChangesPasswordController" class="item-anchor">Password<span class="text-primary"></span></a></li>
                                                        <li><a href="OrderCustomerController" class="item-anchor">Order</a></li>
                                                        <li><a href="OrderWarrantyController" class="item-anchor">Order Warranty</a></li>
                                                        <li><a href="WarrantyCustomerController" class="item-anchor">Warranty</a></li>
                                                        <li><a href="LogoutController?logout=1" class="item-anchor">Log out<span class="text-primary"></span></a></li>
                                                    </ul>
                                                </li>
                                            </c:if>                                                      
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
        </header>


        <section class="site-banner jarallax min-height300 padding-large" style="background: url(images/banner/macbook.jpg) no-repeat; background-position: top;">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-title">News Page</h1>
                        <div class="breadcrumbs">
                            <span class="item">
                                <a href="HomeController">Home /</a>
                            </span>
                            <span class="item">News</span>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section id="latest-blog" class="post-grid padding-large">
            <div class="container">
                <div class="row d-flex flex-wrap">
                    <c:forEach items="${news}" var="n">
                        <article class="col-md-4 post-item">
                            <div class="image-holder zoom-effect">
                                <a href="NewsDetailCustomerController?id=${n.news_id}">
                                    <img src="${n.image}" alt="post" class="post-image">
                                </a>
                            </div>
                            <div class="post-content d-flex">
                                <div class="meta-date">
                                    <div class="meta-day text-primary">${n.day}</div>
                                    <div class="meta-month">${n.month}-${n.year}</div>
                                </div>
                                <div class="post-header">
                                    <h3 class="post-title">
                                        <a href="NewsDetailCustomerController?id=${n.news_id}">${n.title}</a>
                                    </h3>
                                    <a href="NewsCustomerController" class="blog-categories">${n.newsgroup_name}</a>
                                </div>
                            </div>
                        </article>  
                    </c:forEach>
                </div>
                <div>
                    <nav class="navigation paging-navigation text-center padding-medium" role="navigation">
                        <div class="pagination loop-pagination d-flex justify-content-center">
                            <c:choose>
                                <c:when test="${currentPage > 1}">
                                    <a href="?page=${currentPage - 1}" class="pagination-arrow d-flex align-items-center">
                                        <i class="icon icon-arrow-left"></i>
                                    </a>
                                </c:when>
                                <c:otherwise>
                                    <a href="#" class="pagination-arrow d-flex align-items-center">
                                        <i class="icon icon-arrow-left"></i>
                                    </a>
                                </c:otherwise>
                            </c:choose>

                            <c:forEach begin="1" end="${totalPages}" varStatus="loop">
                                <c:choose>
                                    <c:when test="${loop.index == currentPage}">
                                        <span aria-current="page" class="page-numbers current">${loop.index}</span>
                                    </c:when>
                                    <c:otherwise>
                                        <c:if test="${id == null}">
                                            <a href="?page=${loop.index}" class="page-numbers">${loop.index}</a>
                                        </c:if>  
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>

                            <c:choose>
                                <c:when test="${currentPage < totalPages}">
                                    <a href="?page=${currentPage + 1}" class="pagination-arrow d-flex align-items-center">
                                        <i class="icon icon-arrow-right"></i>
                                    </a>
                                </c:when>
                                <c:otherwise>
                                    <a href="#" class="pagination-arrow d-flex align-items-center">
                                        <i class="icon icon-arrow-right"></i>
                                    </a>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </nav>
                </div>
            </div>
        </section>


        <section id="shipping-information">
            <hr>
            <div class="container">
                <div class="row d-flex flex-wrap align-items-center justify-content-between">
                    <div class="col-md-3 col-sm-6">
                        <div class="icon-box">
                            <i class="icon icon-truck"></i>
                            <h4 class="block-title">
                                <strong>Free shipping</strong> Over $200
                            </h4>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="icon-box">
                            <i class="icon icon-return"></i>
                            <h4 class="block-title">
                                <strong>Money back</strong> Return within 7 days
                            </h4>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="icon-box">
                            <i class="icon icon-tags1"></i>
                            <h4 class="block-title">
                                <strong>Buy 4 get 5th</strong> 50% off
                            </h4>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="icon-box">
                            <i class="icon icon-help_outline"></i>
                            <h4 class="block-title">
                                <strong>Any questions?</strong> experts are ready
                            </h4>
                        </div>
                    </div>
                </div>
            </div>
            <hr>
        </section>
        <%@include file="footer.jsp" %>       
        <script src="Client/js/jquery-1.11.0.min.js"></script>
        <script src="Client/js/plugins.js"></script>
        <script src="Client/js/script.js"></script>
    </body>
</html>
