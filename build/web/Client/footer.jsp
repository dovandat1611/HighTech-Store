<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : home
    Created on : May 16, 2023, 9:58:20 AM
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

        <footer id="footer">
            <div class="container">
                <div class="footer-menu-list">
                    <div class="row d-flex flex-wrap justify-content-between">
                        <div class="col-lg-3 col-md-6 col-sm-6">
                            <div class="footer-menu">
                                <c:forEach items="${titlefooter}" var="item" varStatus="loop">
                                    <c:if test="${loop.index eq 0}">
                                        <h5 class="widget-title">${item.title}</h5>
                                    </c:if>
                                </c:forEach>
                                <c:forEach var="item" items="${footer1}">
                                    <ul class="menu-list list-unstyled">
                                        <li class="menu-item">
                                            <a href="${item.content}">${item.title}</a>
                                        </li>
                                    </ul>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6 col-sm-6">
                            <div class="footer-menu">
                                <c:forEach items="${titlefooter}" var="item" varStatus="loop">
                                    <c:if test="${loop.index eq 1}">
                                        <h5 class="widget-title">${item.title}</h5>
                                    </c:if>
                                </c:forEach>
                                <c:forEach var="item" items="${footer2}">
                                    <ul class="menu-list list-unstyled">
                                        <li class="menu-item">
                                            <a href="${item.content}">${item.title}</a>
                                        </li>
                                    </ul>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6 col-sm-6">
                            <div class="footer-menu">
                                <c:forEach items="${titlefooter}" var="item" varStatus="loop">
                                    <c:if test="${loop.index eq 2}">
                                        <h5 class="widget-title">${item.title}</h5>
                                    </c:if>
                                </c:forEach>
                                <p style="margin-top: 5px; margin-bottom: 5px;">${footer3[0].title}</p> 
                                <a href="mailto:hightech05vn@gmail.com">
                                    <strong style="margin-top: 5px; margin-bottom: 5px; color: #8d8d8d;text-decoration: underline;">
                                        ${footer3[1].content}
                                    </strong></a>
                                <p style="margin-top: 5px; margin-bottom: 5px;">${footer3[2].title}</p>
                                <a href="tel://0968519615">
                                    <strong style="margin-top: 5px; margin-bottom: 5px; color: #8d8d8d">
                                        ${footer3[3].content}
                                    </strong></a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6 col-sm-6">
                            <div class="footer-menu">
                                <c:forEach items="${titlefooter}" var="item" varStatus="loop">
                                    <c:if test="${loop.index eq 3}">
                                        <h5 class="widget-title">${item.title}</h5>
                                    </c:if>
                                </c:forEach>

                                <p>${footer4[0].title}</p>
                                <div class="social-links">
                                    <ul class="d-flex list-unstyled">
                                        <li>
                                            <a href="${footer4[1].content}">
                                                <i class="icon icon-facebook"></i>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${footer4[2].content}">
                                                <i class="icon icon-twitter"></i>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${footer4[3].content}">
                                                <i class="icon icon-youtube-play"></i>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${footer4[4].content}">
                                                <i class="icon icon-behance-square"></i>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer> 

        <script src="Client/js/jquery-1.11.0.min.js"></script>
        <script src="Client/js/plugins.js"></script>
        <script src="Client/js/script.js"></script>
    </body>
</html>