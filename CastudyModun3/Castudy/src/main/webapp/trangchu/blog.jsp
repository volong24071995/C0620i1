<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 07/10/2020
  Time: 9:39 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ogani | Template</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="/csstrangchu/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/csstrangchu/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="/csstrangchu/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="/csstrangchu/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/csstrangchu/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="/csstrangchu/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="/csstrangchu/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="/csstrangchu/css/style.css" type="text/css">

</head>

<body>
<!-- Page Preloder -->
<div id="preloder">
    <div class="loader"></div>
</div>
<!-- The Modal -->
<div class="modal" id="myModal">
    <form action="/login?action=customer" method="post">
        <div class="modal-dialog">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Login</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body">
                    <label for="userName">User Name:</label><input type="text" class="form-control" id="userName" name="userName">
                    <label for="password">Password:</label><input type="password" class="form-control" id="password" name="password">
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="submit" class="btn btn-primary">Login</button>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- The Modal đăng kí -->
<div class="modal" id="myModaldk">
    <form action="/user" method="post">
        <div class="modal-dialog">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">DANG KI</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <!-- Modal body -->
                <div class="modal-body">
                    <label for="userName">User Name:</label><input type="text" class="form-control" id="name" name="name" required >
                    <label for="password">Password:</label><input type="password" class="form-control" id="pas" name="pass" required>
                    <label for="email">Email:</label><input type="email" class="form-control" id="email" name="email" required>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="submit" class="btn btn-primary">Create</button>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- Humberger Begin -->
<div class="humberger__menu__overlay"></div>
<div class="humberger__menu__wrapper">
    <div class="humberger__menu__logo">
        <a href="/TrangChu"><img src="/csstrangchu/img/logo.png" alt="img"></a>
    </div>
    <div class="humberger__menu__cart">
        <ul>
            <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
            <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
        </ul>
        <div class="header__cart__price">item: <span>$150.00</span></div>
    </div>
    <div class="humberger__menu__widget">
        <div class="header__top__right__language">
            <img src="/csstrangchu/img/language.png" alt="img">
            <div>English</div>
            <span class="arrow_carrot-down"></span>
            <ul>
                <li><a href="#">Tiếng Việt</a></li>
                <li><a href="#">English</a></li>
            </ul>
        </div>
        <div class="header__top__right__auth">
            <c:if test="${user!=null}">
                <a href="/login?action=loginOut"><i class="fa fa-user"> ${user.userName}</i> Logout</a>
            </c:if>
            <c:if test="${user==null}">
                <a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-user"></i> Login</a>
            </c:if>
        </div>
        <div class="header__top__right__auth">
            <c:if test="${user==null}">
                <a href="#" data-toggle="modal" data-target="#myModaldk"> Dangki</a>
            </c:if>
        </div>
    </div>
    <nav class="humberger__menu__nav mobile-menu">
        <ul>
            <li class="active"><a href="/TrangChu">Home</a></li>
            <li><a href="/TrangChu?action=shop">Shop</a></li>
            <li><a href="#">ProductLines</a>
                <ul class="header__menu__dropdown">
                    <c:forEach items="${tenTheLoai}" var="tenTheLoai">
                        <li><a href="/TrangChu?action=productLine&tenTheLoai=${tenTheLoai}" >${tenTheLoai}</a></li>
                    </c:forEach>
                </ul>
            </li>
            <li><a href="/TrangChu?action=blog">Blog</a></li>
            <li><a href="/TrangChu?action=contact">Contact</a></li>
        </ul>
    </nav>
    <div id="mobile-menu-wrap"></div>
    <div class="header__top__right__social">
        <a href="#"><i class="fa fa-facebook"></i></a>
        <a href="#"><i class="fa fa-twitter"></i></a>
        <a href="#"><i class="fa fa-linkedin"></i></a>
        <a href="#"><i class="fa fa-pinterest-p"></i></a>
    </div>
    <div class="humberger__menu__contact">
        <ul>
            <li><i class="fa fa-envelope"></i>Volong24071995@gmail.com</li>
            <li>Free Shipping for all Order of $99</li>
        </ul>
    </div>
</div>
<!-- Humberger End -->

<!-- Header Section Begin -->
<header class="header">
    <div class="header__top">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <div class="header__top__left">
                        <ul>
                            <li><i class="fa fa-envelope"></i>Volong24071995@gmail.com</li>
                            <li>Free Shipping for all Order of $99</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="header__top__right">
                        <div class="header__top__right__social">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-linkedin"></i></a>
                            <a href="#"><i class="fa fa-pinterest-p"></i></a>
                        </div>
                        <div class="header__top__right__language">
                            <img src="/csstrangchu/img/language.png" alt="img">
                            <div>English</div>
                            <span class="arrow_carrot-down"></span>
                            <ul>
                                <li><a href="#">Tiếng Việt</a></li>
                                <li><a href="#">English</a></li>
                            </ul>
                        </div>
                        <div class="header__top__right__auth">
                            <c:if test="${user!=null}">
                                <a href="/login?action=loginOut"><i class="fa fa-user"> ${user.userName}</i> Logout</a>
                            </c:if>
                            <c:if test="${user==null}">
                                <a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-user"></i> Login</a>
                            </c:if>
                        </div>
                        <div class="header__top__right__auth">
                            <c:if test="${user==null}">
                                <a href="#" data-toggle="modal" data-target="#myModaldk"> Dangki</a>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="header__logo">
                    <a href="/TrangChu"><img src="/csstrangchu/img/logo.png" alt=""></a>
                </div>
            </div>
            <div class="col-lg-6">
                <nav class="header__menu">
                    <ul>
                        <li><a href="/TrangChu">Home</a></li>
                        <li><a href="/TrangChu?action=shop">Shop</a></li>
                        <li><a href="#">ProductLines</a>
                            <ul class="header__menu__dropdown">
                                <c:forEach items="${tenTheLoai}" var="tenTheLoai">
                                    <li><a href="/TrangChu?action=productLine&tenTheLoai=${tenTheLoai}" >${tenTheLoai}</a></li>
                                </c:forEach>
                            </ul>
                        </li>
                        <li class="active"><a href="/TrangChu?action=blog">Blog</a></li>
                        <li><a href="/TrangChu?action=contact">Contact</a></li>
                    </ul>
                </nav>
            </div>
            <div class="col-lg-3">
                <div class="header__cart">
                    <ul>
                        <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                        <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                    </ul>
                    <div class="header__cart__price">item: <span>$150.00</span></div>
                </div>
            </div>
        </div>
        <div class="humberger__open">
            <i class="fa fa-bars"></i>
        </div>
    </div>
</header>
<!-- Header Section End -->

<!-- Hero Section Begin -->
<section class="hero hero-normal">
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="hero__categories">
                </div>
            </div>
            <div class="col-lg-9">
                <div class="hero__search">
                    <div class="hero__search__form">
                        <form action="/TrangChu?action=search" method="post">
                            <input type="text" placeholder="What do you need?" name="name">
                            <button type="submit" class="site-btn">SEARCH</button>
                        </form>
                    </div>
                    <div class="hero__search__phone">
                        <div class="hero__search__phone__icon">
                            <i class="fa fa-phone"></i>
                        </div>
                        <div class="hero__search__phone__text">
                            <h5>037.606.0151</h5>
                            <span>support 24/7 time</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Hero Section End -->

<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-section set-bg" data-setbg="/csstrangchu/img/breadcrumb.jpg">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <div class="breadcrumb__text">
                    <h2>Blog</h2>
                    <div class="breadcrumb__option">
                        <a href="/TrangChu">Home</a>
                        <span>Blog</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Breadcrumb Section End -->

<!-- Blog Section Begin -->
<section class="blog spad">
    <div class="container">
        <div class="col-lg-12 col-md-4">
            <div class="row">
                <c:forEach items="${blog6List}" var="blog6List">
                <div class="col-lg-4 col-md-6 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="${blog6List.image}" alt="img">
                        </div>
                        <div class="blog__item__text">
                            <h5><a href="${blog6List.link}" target="_blank">${blog6List.title}</a></h5>
                            <a href="${blog6List.link}" target="_blank" class="blog__btn">READ MORE <span class="arrow_right"></span></a>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
    </div>
    </div>
</section>
<!-- Blog Section End -->

<!-- Footer Section Begin -->
<footer class="footer spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="footer__about">
                    <div class="footer__about__logo">
                        <a href="/TrangChu"><img src="/csstrangchu/img/logo.png" alt=""></a>
                    </div>
                    <ul>
                        <li>Address: 28 Nguyễn Tri Phương TP.Huế</li>
                        <li>Phone: 037.606.0151</li>
                        <li>Email: Volong24071995@gmail.com</li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
                <div class="footer__widget">
                    <h6>Useful Links</h6>
                    <ul>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">About Our Shop</a></li>
                        <li><a href="#">Secure Shopping</a></li>
                        <li><a href="#">Delivery infomation</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                        <li><a href="#">Our Sitemap</a></li>
                    </ul>
                    <ul>
                        <li><a href="#">Who We Are</a></li>
                        <li><a href="#">Our Services</a></li>
                        <li><a href="#">Projects</a></li>
                        <li><a href="#">Contact</a></li>
                        <li><a href="#">Innovation</a></li>
                        <li><a href="#">Testimonials</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-4 col-md-12">
                <div class="footer__widget">
                    <h6>Join Our Newsletter Now</h6>
                    <p>Get E-mail updates about our latest shop and special offers.</p>
                    <form action="#">
                        <input type="text" placeholder="Enter your mail">
                        <button type="submit" class="site-btn">Subscribe</button>
                    </form>
                    <div class="footer__widget__social">
                        <a href="#"><i class="fa fa-facebook"></i></a>
                        <a href="#"><i class="fa fa-instagram"></i></a>
                        <a href="#"><i class="fa fa-twitter"></i></a>
                        <a href="#"><i class="fa fa-pinterest"></i></a>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="footer__copyright">
                    <div class="footer__copyright__text">
                        <p>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;
                            <script>
                                document.write(new Date().getFullYear());
                            </script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </p>
                    </div>
                    <div class="footer__copyright__payment"><img src="/csstrangchu/img/payment-item.png" alt=""></div>
                </div>
            </div>
        </div>
    </div>
</footer>
<!-- Footer Section End -->

<!-- Js Plugins -->
<script src="/csstrangchu/js/jquery-3.3.1.min.js"></script>
<script src="/csstrangchu/js/bootstrap.min.js"></script>
<script src="/csstrangchu/js/jquery.nice-select.min.js"></script>
<script src="/csstrangchu/js/jquery-ui.min.js"></script>
<script src="/csstrangchu/js/jquery.slicknav.js"></script>
<script src="/csstrangchu/js/mixitup.min.js"></script>
<script src="/csstrangchu/js/owl.carousel.min.js"></script>
<script src="/csstrangchu/js/main.js"></script>



</body>

</html>
