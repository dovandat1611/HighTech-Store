<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : checkout
    Created on : May 16, 2023, 9:57:14 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en" style class=" js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache svg inlinesvg smil svgclippaths">
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
    <body class="">

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

        <section class="site-banner padding-small bg-light-grey">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="breadcrumbs">
                            <span class="item">
                                <a href="HomeController">Home /</a>
                            </span>
                            <span class="item">
                                <a href="ShopController">Shop /</a>
                            </span>
                            <span class="item">Checkout</span>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="shopify-cart checkout-wrap padding-large">
            <div class="container">

                <c:if test="${not empty sessionScope.account}">

                    <c:forEach var="c" items="${listC}">
                        <form class="form-group" action="CheckoutController" method="post">
                            <input type="hidden" name="service" value="addOrder">
                            <div class="row d-flex flex-wrap">
                                <div class="col-lg-6">
                                    <h2 class="section-title">Billing Details</h2>
                                    <div class="billing-details">
                                        <input type="hidden" name="id" value="${c.customer_id}">
                                        <input type="hidden" name="total_price" value="${totalprice}">
                                        <input type="hidden" name="status" value="Wait">
                                        <label for="cname">Name Receiver*</label>
                                        <input type="text" id="cname" name="name_receiver" value="${c.name}" class="form-control" required>
                                        <label for="cname">Phone Receiver</label>
                                        <input type="text" id="cname" name="phone_receiver" value="${c.phone}" class="form-control" required> 
                                        <label for="cname">Address Receiver*</label>
                                        <input type="text" id="cname" name="address_receiver" value="${c.address}" class="form-control" required> 
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="your-order">
                                        <h2 class="section-title">Cart Totals</h2>
                                        <div class="total-price">
                                            <table cellspacing="0" class="table">
                                                <tbody>
                                                    <tr class="order-total">
                                                        <th>Total</th>
                                                        <td data-title="Total">
                                                            <span class="price-amount amount text-primary">
                                                                <bdi>
                                                                    <span class="price-currency-symbol number">${totalprice}</span></bdi>
                                                            </span>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>    
                                            <div class="list-group mt-5 mb-3">
                                                <label class="list-group-item d-flex">
                                                    <input class="form-check-input flex-shrink-0" type="radio" checked value="Ship COD" name="payment" id="listGroupRadios3">
                                                    <div>
                                                        <strong>Ship COD</strong>
                                                        <p>Cash on delivery (COD) is when a recipient pays for a good or service at the time of delivery.</p>
                                                    </div>
                                                </label>
                                                <label class="list-group-item d-flex">
                                                    <input class="form-check-input flex-shrink-0" type="radio" value="Payment by Card" name="payment" id="listGroupRadios3">
                                                    <div>
                                                        <strong>VNPAY</strong>
                                                        <p>Pay via VNPAY; you can pay with your credit card if you don’t have a VNPAY account.</p>
                                                    </div>
                                                </label>
                                            </div>
                                            <button type="submit" name="submit" class="btn btn-dark btn-full btn-medium">Place an order</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </c:forEach>
                </c:if>


                <c:if test="${empty sessionScope.account}">
                    <form class="form-group" action="CheckoutGuestController" method="post">
                        <input type="hidden" name="service" value="addOrder">
                        <div class="row d-flex flex-wrap">
                            <div class="col-lg-6">
                                <h2 class="section-title">Billing Details</h2>
                                <div class="billing-details">
                                    <input type="hidden" name="total_price" value="${totalprice}">
                                    <input type="hidden" name="status" value="Wait">
                                    <label for="cname">Name Receiver*</label>
                                    <input type="text" id="cname" name="name_receiver"  class="form-control" required>
                                    <label for="cname">Phone Receiver</label>
                                    <input type="text" id="cname" name="phone_receiver"  class="form-control" required> 
                                    <p>${ms1}</p>
                                    <label for="cname">Gmail Receiver*</label>
                                    <input type="text" id="cname" name="gmail_receiver"  class="form-control" required> 
                                    <p>${ms2}</p>
                                    <p>${ms3}</p>
                                    <p>
                                        <label for="gender">Gender: </label>
                                        <input type="radio" name="gender" value="1"> Male  
                                        <input style="margin-left:50px" type="radio" name="gender" value="0" > Female
                                    </p>
                                    <label for="cname">Address Receiver*</label>
                                    <input type="text" id="cname" name="address_receiver"  class="form-control" required> 
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="your-order">
                                    <h2 class="section-title">Cart Totals</h2>
                                    <div class="total-price">
                                        <table cellspacing="0" class="table">
                                            <tbody>
                                                <tr class="order-total">
                                                    <th>Total</th>
                                                    <td data-title="Total">
                                                        <span class="price-amount amount text-primary">
                                                            <bdi>
                                                                <span class="price-currency-symbol number">${totalprice}</span></bdi>
                                                        </span>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>    
                                        <div class="list-group mt-5 mb-3">
                                            <label class="list-group-item d-flex">
                                                <input class="form-check-input flex-shrink-0" type="radio" checked value="Ship COD" name="payment" id="listGroupRadios3">
                                                <div>
                                                    <strong>Ship COD</strong>
                                                    <p>Cash on delivery (COD) is when a recipient pays for a good or service at the time of delivery.</p>
                                                </div>
                                            </label>
                                            <label class="list-group-item d-flex">
                                                <input class="form-check-input flex-shrink-0" type="radio" value="Payment by Card" name="payment" id="listGroupRadios3">
                                                <div>
                                                    <strong>VNPAY</strong>
                                                    <p>Pay via VNPAY; you can pay with your credit card if you don’t have a VNPAY account.</p>
                                                </div>
                                            </label>
                                        </div>
                                        <button type="submit" name="submit" class="btn btn-dark btn-full btn-medium">Place an order</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </c:if>

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

        <script>
            const numberElements = document.getElementsByClassName('number');
            for (let i = 0; i < numberElements.length; i++) {
                const numberElement = numberElements[i];
                const number = parseFloat(numberElement.innerText);
                const formattedNumber = formatCurrency(number);
                numberElement.innerText = formattedNumber;
            }

            function formatCurrency(value) {
                const intValue = parseInt(value);
                const formattedValue = intValue.toLocaleString('vi-VN', {
                    style: 'currency',
                    currency: 'VND',
                });
                return formattedValue;
            }
        </script>
        <script src="Client/js/jquery-1.11.0.min.js"></script>
        <script src="Client/js/plugins.js"></script>
        <script src="Client/js/script.js"></script>

        <div id="cboxOverlay" style="display: none;"></div><div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;"><div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div><div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div><div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div><div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious"></button><button type="button" id="cboxNext"></button><button type="button" id="cboxSlideshow"></button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none; max-width: none;"></div></div></body></html>