<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%-- 
    Document   : about
    Created on : May 16, 2023, 9:55:48 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
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

        <section class="site-banner jarallax min-height300 padding-large" style="background: url(images/about/teamworking.jpg) no-repeat;">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-title">About us</h1>
                        <div class="breadcrumbs">
                            <span class="item">
                                <a href="index.jsp">Home /</a>
                            </span>
                            <span class="item">About</span>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section id="shipping-information" class="padding-large">
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
        </section>


        <section id="about-us">
            <div class="container ">
                <div class="row d-flex align-items-center">
                    <c:forEach items="${about}" var="a">
                        <div class="col-lg-6 col-md-12">
                            <div class="image-holder">
                                <img src="${a.image}" alt="single" class="about-image">
                            </div>
                        </div>

                        <div class="col-lg-6 col-md-12">
                            <div class="detail">
                                <div class="display-header">
                                    <h2 class="section-title">${a.getTitle()}</h2>
                                    <p>${a.getContent()}</p>
                                    <div class="btn-wrap">
                                        <a href="ShopController" class="btn btn-dark btn-medium d-flex align-items-center" tabindex="0">Shop our store<i class="icon icon-arrow-io"></i>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>

        <section id="testimonials" class="padding-large no-padding-bottom">
            <div class="container">
                <div class="reviews-content">
                    <div class="row d-flex flex-wrap">
                        <div class="col-md-2">
                            <div class="review-icon">
                                <i class="icon icon-right-quote"></i>
                            </div>
                        </div>
                        <div class="col-md-8">
                            <div class="swiper testimonial-swiper overflow-hidden">
                                <div class="swiper-wrapper">
                                    <c:forEach items="${allquote}" var="q">
                                        <div class="swiper-slide">
                                            <div class="testimonial-detail">
                                                <p>${q.content}</p>
                                                <div class="author-detail">
                                                    <div class="name">${q.author}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                            <div class="swiper-arrows">
                                <button class="prev-button">
                                    <i class="icon icon-arrow-left"></i>
                                </button>
                                <button class="next-button">
                                    <i class="icon icon-arrow-right"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <hr>
        <section id="latest-blog" class="padding-large">
            <div class="container">
                <div class="section-header d-flex flex-wrap align-items-center justify-content-between">
                    <h2 class="section-title">News</h2>
                    <div class="btn-wrap align-right">
                        <a href="NewsCustomerController" class="d-flex align-items-center">Read All Articles <i class="icon icon icon-arrow-io"></i>
                        </a>
                    </div>
                </div>
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
            </div>
        </section>

        <section id="brand-collection" class="padding-medium bg-light-grey">
            <div class="container">
                <div class="d-flex flex-wrap justify-content-between" style="margin-bottom: 20px;">
                    <c:forEach items="${brandbanner}" var="d" begin="0" end="4">
                        <img src="${d.image}" alt="phone" class="brand-image" style="width: 100px; height: 50px;">
                    </c:forEach>
                </div>
                <div class="d-flex flex-wrap justify-content-between">
                    <c:forEach items="${brandbanner}" var="d" begin="5" end="9">
                        <img src="${d.image}" alt="phone" class="brand-image" style="width: 100px; height: 50px;">
                    </c:forEach>
                </div>
            </div>
        </section>

        <section id="instagram" class="padding-large">
        </section>
        <%@include file="footer.jsp" %>
        <script src="Client/js/jquery-1.11.0.min.js"></script>
        <script src="Client/js/plugins.js"></script>
        <script src="Client/js/script.js"></script>

    </body>
</html>
