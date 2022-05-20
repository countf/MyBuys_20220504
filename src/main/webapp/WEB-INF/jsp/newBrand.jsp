<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="zxx">
<!--<![endif]-->
<!-- Begin Head -->

<head>
    <title>SplashDash</title>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="author" content="">
    <meta name="MobileOptimized" content="320">
    <!--Start Style -->
    <link rel="stylesheet" type="text/css" href="../../static/css/fonts.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/icofont.min.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/style.css">
    <link rel="stylesheet" id="theme-change" type="text/css" href="">
</head>


<body>
<div class="loader">
    <div class="spinner">
        <img src="../../static/picture/loader.gif" alt="">
    </div>
</div>
<!-- Main Body -->
<div class="page-wrapper">
    <!-- Header Start -->
    <header class="header-wrapper main-header">
        <div class="header-inner-wrapper">
            <div class="logo-wrapper">
                <a href="../../index.html" class="admin-logo">
                    <img src="../../static/picture/logo.png" alt="">
                </a>
            </div>
            <div class="header-right">
                <div class="serch-wrapper">
                    <form>
                        <input type="text" placeholder="Search Here...">
                    </form>
                    <a class="search-close" href="javascript:void(0);"><span class="icofont-close-line"></span></a>
                </div>
                <div class="header-left">
                    <div class="header-links">
                        <a href="javascript:void(0);" class="toggle-btn">
                            <span></span>
                        </a>
                    </div>
                    <div class="header-links search-link">
                        <a class="search-toggle" href="javascript:void(0);">
                            <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewbox="0 0 56.966 56.966" style="enable-background:new 0 0 56.966 56.966;" xml:space="preserve">
                                    <path d="M55.146,51.887L41.588,37.786c3.486-4.144,5.396-9.358,5.396-14.786c0-12.682-10.318-23-23-23s-23,10.318-23,23
                                    s10.318,23,23,23c4.761,0,9.298-1.436,13.177-4.162l13.661,14.208c0.571,0.593,1.339,0.92,2.162,0.92
                                    c0.779,0,1.518-0.297,2.079-0.837C56.255,54.982,56.293,53.08,55.146,51.887z M23.984,6c9.374,0,17,7.626,17,17s-7.626,17-17,17
                                    s-17-7.626-17-17S14.61,6,23.984,6z"></path>
                                </svg>
                        </a>
                    </div>
                </div>
                <div class="header-controls">
                    <div class="setting-wrapper header-links">
                        <a href="javascript:void(0);" class="setting-info">
                                <span class="header-icon">
                                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" viewbox="0 0 16 16">
                                        <path d="M7 0h2v3h-2v-3z"></path>
                                        <path d="M6 4v3h1v9h2v-9h1v-3z"></path>
                                        <path d="M2 0h2v8h-2v-8z"></path>
                                        <path d="M1 9v3h1v4h2v-4h1v-3z"></path>
                                        <path d="M12 0h2v10h-2v-10z"></path>
                                        <path d="M11 11v3h1v2h2v-2h1v-3z"></path>
                                    </svg>
                                </span>
                        </a>
                    </div>
                    <div class="cart-wrapper header-links">
                        <a href="javascript:void(0);" class="cart-info">
                                <span class="header-icon">
                                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewbox="0 0 512 512" xml:space="preserve">
                                        <g>
                                            <g>
                                                <path d="M402.351,381.058h-203.32l-11.806-47.224h266.587L512,101.085H129.038L108.882,20.46H0v33.4h82.804l82.208,328.827
                                                    c-24.053,5.971-41.938,27.737-41.938,53.611c0,30.461,24.781,55.242,55.241,55.242c30.459,0,55.241-24.781,55.241-55.242
                                                    c0-7.755-1.613-15.138-4.511-21.841h122.577c-2.897,6.703-4.511,14.086-4.511,21.841c0,30.461,24.781,55.242,55.241,55.242
                                                    c30.459,0,55.241-24.781,55.241-55.242C457.592,405.84,432.811,381.058,402.351,381.058z M287.029,300.434h-37.08l-8.284-66.275
                                                    h45.365V300.434z M411.912,134.484h57.31l-16.568,66.275h-49.026L411.912,134.484z M399.453,234.16h44.85l-16.568,66.275h-36.566
                                                    L399.453,234.16z M320.428,134.484h57.824l-8.284,66.275h-49.539V134.484z M320.428,234.159h45.365l-8.284,66.275h-37.08V234.159z
                                                     M287.029,134.484v66.275h-49.539l-8.284-66.275H287.029z M137.388,134.484h58.158l8.284,66.275h-49.873L137.388,134.484z
                                                     M162.307,234.159h45.699l8.284,66.275h-37.414L162.307,234.159z M178.315,458.141c-12.043,0-21.841-9.798-21.841-21.842
                                                    c0-12.043,9.798-21.841,21.841-21.841s21.841,9.798,21.841,21.841C200.156,448.343,190.358,458.141,178.315,458.141z
                                                     M402.351,458.141c-12.043,0-21.841-9.798-21.841-21.842c0-12.043,9.798-21.841,21.841-21.841
                                                    c12.043,0,21.841,9.798,21.841,21.841C424.192,448.343,414.394,458.141,402.351,458.141z"></path>
                                            </g>
                                        </g>
                                    </svg>
                                </span>
                            <span class="item-count">03</span>
                        </a>
                        <div class="of-notification-comment">
                            <div class="of-nt-text">
                                <h5>Shopping Cart</h5>
                                <h6>Your Have 3 Item In Your Cart</h6>
                            </div>
                            <div class="of-nt-scroll">

                                <div class="of-nt-flex">
                                    <div class="of-nt-img">
                                        <img src="../../static/picture/product2.png" alt="">
                                    </div>
                                    <div class="of-nt-cmnt">
                                        <p>Ceiling Light<span>
										<svg xmlns="http://www.w3.org/2000/svg" width="9px" height="8px">
											<defs>
											<filter>
												<feflood flood-color="#222222" flood-opacity="1" result="floodOut"></feflood>
												<fecomposite operator="atop" in="floodOut" in2="SourceGraphic" result="compOut"></fecomposite>
												<feblend mode="normal" in="compOut" in2="SourceGraphic"></feblend>
											</filter>

											</defs>
											<g>
											<path fill-rule="evenodd" fill="#222222" d="M4.713,3.998 L7.864,0.850 C8.060,0.654 8.060,0.337 7.864,0.142 C7.668,-0.054 7.351,-0.054 7.155,0.142 L4.005,3.290 L0.854,0.142 C0.659,-0.054 0.342,-0.054 0.146,0.142 C-0.050,0.337 -0.050,0.654 0.146,0.850 L3.296,3.998 L0.146,7.146 C-0.050,7.341 -0.050,7.658 0.146,7.854 C0.244,7.952 0.372,8.001 0.500,8.001 C0.628,8.001 0.756,7.952 0.854,7.854 L4.005,4.706 L7.155,7.854 C7.253,7.952 7.381,8.001 7.510,8.001 C7.638,8.001 7.766,7.952 7.864,7.854 C8.060,7.658 8.060,7.341 7.864,7.146 L4.713,3.998 Z"></path>
											</g>
											</svg>
										</span></p>
                                        <div class="int-table-quantity">
                                            <div class="quantity-wrapper">
                                                <div class="quantity-qty">
                                                    <h5>$100</h5>
                                                </div>
                                                <div class="input-group">
                                                    <span class="quantity-minus"> - </span>
                                                    <input type="number" class="quantity" value="2">
                                                    <span class="quantity-plus"> + </span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="of-nt-flex">
                                    <div class="of-nt-img">
                                        <img src="../../static/picture/product3.png" alt="">
                                    </div>
                                    <div class="of-nt-cmnt">
                                        <p>Wooden Sofa<span>
										<svg xmlns="http://www.w3.org/2000/svg" width="9px" height="8px">
											<defs>
											<filter>
												<feflood flood-color="#222222" flood-opacity="1" result="floodOut"></feflood>
												<fecomposite operator="atop" in="floodOut" in2="SourceGraphic" result="compOut"></fecomposite>
												<feblend mode="normal" in="compOut" in2="SourceGraphic"></feblend>
											</filter>

											</defs>
											<g>
											<path fill-rule="evenodd" fill="#222222" d="M4.713,3.998 L7.864,0.850 C8.060,0.654 8.060,0.337 7.864,0.142 C7.668,-0.054 7.351,-0.054 7.155,0.142 L4.005,3.290 L0.854,0.142 C0.659,-0.054 0.342,-0.054 0.146,0.142 C-0.050,0.337 -0.050,0.654 0.146,0.850 L3.296,3.998 L0.146,7.146 C-0.050,7.341 -0.050,7.658 0.146,7.854 C0.244,7.952 0.372,8.001 0.500,8.001 C0.628,8.001 0.756,7.952 0.854,7.854 L4.005,4.706 L7.155,7.854 C7.253,7.952 7.381,8.001 7.510,8.001 C7.638,8.001 7.766,7.952 7.864,7.854 C8.060,7.658 8.060,7.341 7.864,7.146 L4.713,3.998 Z"></path>
											</g>
										</svg>
										</span></p>
                                        <div class="int-table-quantity">
                                            <div class="quantity-wrapper">
                                                <div class="quantity-qty">
                                                    <h5>$65</h5>
                                                </div>
                                                <div class="input-group">
                                                    <span class="quantity-minus"> - </span>
                                                    <input type="number" class="quantity" value="2">
                                                    <span class="quantity-plus"> + </span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="of-nt-flex">
                                    <div class="of-nt-img">
                                        <img src="../../static/picture/product.png" alt="">
                                    </div>
                                    <div class="of-nt-cmnt">
                                        <p>Dining Chair<span>
										<svg xmlns="http://www.w3.org/2000/svg" width="9px" height="8px">
											<defs>
											<filter>
												<feflood flood-color="#222222" flood-opacity="1" result="floodOut"></feflood>
												<fecomposite operator="atop" in="floodOut" in2="SourceGraphic" result="compOut"></fecomposite>
												<feblend mode="normal" in="compOut" in2="SourceGraphic"></feblend>
											</filter>

											</defs>
											<g>
											<path fill-rule="evenodd" fill="#222222" d="M4.713,3.998 L7.864,0.850 C8.060,0.654 8.060,0.337 7.864,0.142 C7.668,-0.054 7.351,-0.054 7.155,0.142 L4.005,3.290 L0.854,0.142 C0.659,-0.054 0.342,-0.054 0.146,0.142 C-0.050,0.337 -0.050,0.654 0.146,0.850 L3.296,3.998 L0.146,7.146 C-0.050,7.341 -0.050,7.658 0.146,7.854 C0.244,7.952 0.372,8.001 0.500,8.001 C0.628,8.001 0.756,7.952 0.854,7.854 L4.005,4.706 L7.155,7.854 C7.253,7.952 7.381,8.001 7.510,8.001 C7.638,8.001 7.766,7.952 7.864,7.854 C8.060,7.658 8.060,7.341 7.864,7.146 L4.713,3.998 Z"></path>
											</g>
											</svg>
										</span></p>
                                        <div class="int-table-quantity">
                                            <div class="quantity-wrapper">
                                                <div class="quantity-qty">
                                                    <h5>$86</h5>
                                                </div>
                                                <div class="input-group">
                                                    <span class="quantity-minus"> - </span>
                                                    <input type="number" class="quantity" value="2">
                                                    <span class="quantity-plus"> + </span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="int-flex-total">
                                <h4>Order Total - </h4>
                                <h5>$251</h5>
                            </div>
                            <div class="int-sop-cart-btn">
                                <a href="../../cart.html" class="ad-btn">View cart</a>
                                <a href="" class="ad-btn">checkout</a>
                            </div>
                        </div>
                    </div>

                    <div class="notification-wrapper header-links">
                        <a href="javascript:void(0);" class="notification-info">
                                <span class="header-icon">
                                    <svg enable-background="new 0 0 512 512" viewbox="0 0 512 512" xmlns="http://www.w3.org/2000/svg"><path d="m450.201 407.453c-1.505-.977-12.832-8.912-24.174-32.917-20.829-44.082-25.201-106.18-25.201-150.511 0-.193-.004-.384-.011-.576-.227-58.589-35.31-109.095-85.514-131.756v-34.657c0-31.45-25.544-57.036-56.942-57.036h-4.719c-31.398 0-56.942 25.586-56.942 57.036v34.655c-50.372 22.734-85.525 73.498-85.525 132.334 0 44.331-4.372 106.428-25.201 150.511-11.341 24.004-22.668 31.939-24.174 32.917-6.342 2.935-9.469 9.715-8.01 16.586 1.473 6.939 7.959 11.723 15.042 11.723h109.947c.614 42.141 35.008 76.238 77.223 76.238s76.609-34.097 77.223-76.238h109.947c7.082 0 13.569-4.784 15.042-11.723 1.457-6.871-1.669-13.652-8.011-16.586zm-223.502-350.417c0-14.881 12.086-26.987 26.942-26.987h4.719c14.856 0 26.942 12.106 26.942 26.987v24.917c-9.468-1.957-19.269-2.987-29.306-2.987-10.034 0-19.832 1.029-29.296 2.984v-24.914zm29.301 424.915c-25.673 0-46.614-20.617-47.223-46.188h94.445c-.608 25.57-21.549 46.188-47.222 46.188zm60.4-76.239c-.003 0-213.385 0-213.385 0 2.595-4.044 5.236-8.623 7.861-13.798 20.104-39.643 30.298-96.129 30.298-167.889 0-63.417 51.509-115.01 114.821-115.01s114.821 51.593 114.821 115.06c0 .185.003.369.01.553.057 71.472 10.25 127.755 30.298 167.286 2.625 5.176 5.267 9.754 7.861 13.798z"></path></svg>
                                </span>
                            <span class="count-notification"></span>
                        </a>
                        <div class="recent-notification">
                            <div class="drop-down-header">
                                <h4>All Notification</h4>
                                <p>You have 6 new notifications</p>
                            </div>
                            <ul>
                                <li>
                                    <a href="javascript:void(0);">
                                        <h5><i class="fas fa-exclamation-circle mr-2"></i>Storage Full</h5>
                                        <p>Lorem ipsum dolor sit amet, consectetuer.</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">
                                        <h5><i class="far fa-envelope mr-2"></i>New Membership</h5>
                                        <p>Lorem ipsum dolor sit amet, consectetuer.</p>
                                    </a>
                                </li>
                            </ul>
                            <div class="drop-down-footer">
                                <a href="javascript:void(0);" class="btn sm-btn">
                                    View All
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="user-info-wrapper header-links">
                        <a href="javascript:void(0);" class="user-info">
                            <img src="../../static/picture/user.jpg" alt="" class="user-img">
                            <div class="blink-animation">
                                <span class="blink-circle"></span>
                                <span class="main-circle"></span>
                            </div>
                        </a>
                        <div class="user-info-box">
                            <div class="drop-down-header">
                                <h4>John Brown</h4>
                                <p>UI | UX Designer</p>
                            </div>
                            <ul>
                                <li>
                                    <a href="../../profile.html">
                                        <i class="far fa-edit"></i> Edit Profile
                                    </a>
                                </li>
                                <li>
                                    <a href="../../setting.html">
                                        <i class="fas fa-cog"></i> Settings
                                    </a>
                                </li>
                                <li>
                                    <a href="../../login.html">
                                        <i class="fas fa-sign-out-alt"></i> logout
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- Sidebar Start -->
    <aside class="sidebar-wrapper">
        <div class="side-menu-wrap">
            <ul class="main-menu">
                <li>
                    <a href="javascript:void(0);" class="active">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home"><path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path><polyline points="9 22 9 12 15 12 15 22"></polyline></svg>
                            </span>
                        <span class="menu-text">
                                Dashboard
                            </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="/goProcts.do">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Procts
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="/allBrd.do">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        brdnd
                                    </span>
                            </a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a href="/goProcts.do">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-package"><line x1="16.5" y1="9.4" x2="7.5" y2="4.21"></line><path d="M21 16V8a2 2 0 0 0-1-1.73l-7-4a2 2 0 0 0-2 0l-7 4A2 2 0 0 0 3 8v8a2 2 0 0 0 1 1.73l7 4a2 2 0 0 0 2 0l7-4A2 2 0 0 0 21 16z"></path><polyline points="3.27 6.96 12 12.01 20.73 6.96"></polyline><line x1="12" y1="22.08" x2="12" y2="12"></line></svg>
                            </span>
                        <span class="menu-text">
                                Products
                            </span>
                    </a>
                </li>
                <li>
                    <a href="../../orders.html">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-truck"><rect x="1" y="3" width="15" height="13"></rect><polygon points="16 8 20 8 23 11 23 16 16 16 16 8"></polygon><circle cx="5.5" cy="18.5" r="2.5"></circle><circle cx="18.5" cy="18.5" r="2.5"></circle></svg>
                            </span>
                        <span class="menu-text">
                                Orders
                            </span>
                    </a>
                </li>
                <li>
                    <a href="customers/get.do">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-users"><path d="M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"></path><circle cx="9" cy="7" r="4"></circle><path d="M23 21v-2a4 4 0 0 0-3-3.87"></path><path d="M16 3.13a4 4 0 0 1 0 7.75"></path></svg>
                            </span>
                        <span class="menu-text">
                                Customers
                            </span>
                    </a>
                </li>
                <li>
                    <a href="../../calendar.html">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-calendar"><rect x="3" y="4" width="18" height="18" rx="2" ry="2"></rect><line x1="16" y1="2" x2="16" y2="6"></line><line x1="8" y1="2" x2="8" y2="6"></line><line x1="3" y1="10" x2="21" y2="10"></line></svg>
                            </span>
                        <span class="menu-text">
                                Calendar
                            </span>
                    </a>
                </li>

                <li>
                    <a href="/goInserData.do">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-grid nav-icon"><rect x="3" y="3" width="7" height="7"></rect><rect x="14" y="3" width="7" height="7"></rect><rect x="14" y="14" width="7" height="7"></rect><rect x="3" y="14" width="7" height="7"></rect></svg>
                            </span>
                        <span class="menu-text">
                                inserData
                            </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-wind"><path d="M9.59 4.59A2 2 0 1 1 11 8H2m10.59 11.41A2 2 0 1 0 14 16H2m15.73-8.27A2.5 2.5 0 1 1 19.5 12H2"></path></svg>
                            </span>
                        <span class="menu-text">
                                UI Kit
                            </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="../../modal.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Modal
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../tab.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Tabs
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../carousal.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Carousal
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../counter.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Counter
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../accordation.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Accordation
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../pagination.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Pagination
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../typography.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Typograpgy
                                    </span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:void(0);">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-send"><line x1="22" y1="2" x2="11" y2="13"></line><polygon points="22 2 15 22 11 13 2 9 22 2"></polygon></svg>
                            </span>
                        <span class="menu-text">
                                Form
                            </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="../../form.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Basic Form
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../tags.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Tags
                                    </span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:void(0);">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-tablet"><rect x="4" y="2" width="16" height="20" rx="2" ry="2"></rect><line x1="12" y1="18" x2="12.01" y2="18"></line></svg>
                            </span>
                        <span class="menu-text">
                                Table
                            </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="../../basic-table.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Basic Table
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../advance-table.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Advance Table
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../data-table.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Data Table
                                    </span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:void(0);">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-map"><polygon points="1 6 1 22 8 18 16 22 23 18 23 2 16 6 8 2 1 6"></polygon><line x1="8" y1="2" x2="8" y2="18"></line><line x1="16" y1="6" x2="16" y2="22"></line></svg>
                            </span>
                        <span class="menu-text">
                                Map
                            </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="../../g-map.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Google Map
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../v-map.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        vector Map
                                    </span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="../../chart.html">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-pie-chart"><path d="M21.21 15.89A10 10 0 1 1 8 2.83"></path><path d="M22 12A10 10 0 0 0 12 2v10z"></path></svg>
                            </span>
                        <span class="menu-text">
                                Chart
                            </span>
                    </a>
                </li>
                <li>
                    <a href="../../buttons.html">
                            <span class="icon-menu feather-icon">
                               <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-cloud"><path d="M18 10h-1.26A8 8 0 1 0 9 20h9a5 5 0 0 0 0-10z"></path></svg>
                            </span>
                        <span class="menu-text">
                                buttons
                            </span>
                    </a>
                </li>

                <li>
                    <a href="../../invoice.html">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-printer"><polyline points="6 9 6 2 18 2 18 9"></polyline><path d="M6 18H4a2 2 0 0 1-2-2v-5a2 2 0 0 1 2-2h16a2 2 0 0 1 2 2v5a2 2 0 0 1-2 2h-2"></path><rect x="6" y="14" width="12" height="8"></rect></svg>
                            </span>
                        <span class="menu-text">
                                Invoice
                            </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-mail"><path d="M4 4h16c1.1 0 2 .9 2 2v12c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2z"></path><polyline points="22,6 12,13 2,6"></polyline></svg>
                            </span>
                        <span class="menu-text">
                                Email
                            </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="../../inbox.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Inbox
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../email-template.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Email Template
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../chat.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Chat
                                    </span>
                            </a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a href="javascript:void(0);">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12.01" y2="16"></line></svg>
                            </span>
                        <span class="menu-text">
                                Authentication
                            </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="../../login.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Login
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../register.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Register
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../profile.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        My Profile
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../forgot-pws.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Recover Password
                                    </span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="active-li">
                    <a href="javascript:void(0);">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-layers"><polygon points="12 2 2 7 12 12 22 7 12 2"></polygon><polyline points="2 17 12 22 22 17"></polyline><polyline points="2 12 12 17 22 12"></polyline></svg>
                            </span>
                        <span class="menu-text">
                                General
                            </span>
                    </a>
                    <ul class="sub-menu show-submenu">
                        <li>
                            <a href="../../blank.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Starter
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../shop.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Shop
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../product-single.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Product Single
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../wishlist.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Wishlist
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../cart.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Cart
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Checkout
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../faq.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Faq
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="../../error.html">
                                    <span class="icon-dash">
                                    </span>
                                <span class="menu-text">
                                        Error 404
                                    </span>
                            </a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a href="../../support.html">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-voicemail"><circle cx="5.5" cy="11.5" r="4.5"></circle><circle cx="18.5" cy="11.5" r="4.5"></circle><line x1="5.5" y1="16" x2="18.5" y2="16"></line></svg>
                            </span>
                        <span class="menu-text">
                                Support
                            </span>
                    </a>
                </li>
                <li>
                    <a href="../../documentation.html">
                            <span class="icon-menu feather-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-paperclip"><path d="M21.44 11.05l-9.19 9.19a6 6 0 0 1-8.49-8.49l9.19-9.19a4 4 0 0 1 5.66 5.66l-9.2 9.19a2 2 0 0 1-2.83-2.83l8.49-8.48"></path></svg>
                            </span>
                        <span class="menu-text">
                                Documentation
                            </span>
                    </a>
                </li>
            </ul>
        </div>
    </aside>
    <!-- Container Start -->
    <div class="page-wrapper">
        <div class="main-content">
            <!-- Page Title Start -->

            <!-- Table Start -->
            <div class="row">
                <!-- Styled Table Card-->
                <div class="col-xl-8 col-lg-8">
                    <div class="card">
                        <div class="card-header" style="text-align: center">
                            <h2 >创建品牌信息</h2>
                        </div>
                        <div class="card-body">
                            <form action="/Newbrand.do">
                                <div class="row">
                                    <div class="col-xl-12 col-lg-12">
                                        <div class="form-group">
                                            <label  class="col-form-label">公司名称（中文）</label>
                                            <input class="form-control" type="text" name="nameCn" placeholder="">
                                        </div>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col-xl-12 col-lg-12">
                                        <div class="form-group">
                                            <label  class="col-form-label">公司名称（英文）</label>
                                            <input class="form-control" type="text" name="nameEn" placeholder="">
                                        </div>
                                    </div>

                                </div>

                                <div class="form-group">
                                    <label  class="col-form-label">品牌介绍</label>
                                    <input class="form-control" type="text" name="createdBy" placeholder="" id="password-input">
                                </div>

                                <div class="form-group mb-0" style="text-align: center">
                                    <button class="btn btn-primary squer-btn mt-2 mr-2" type="submit">保存</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>



        </div>
    </div>
</div>
<!-- Slide Setting Box -->

<!-- Color Setting -->

<!-- Color Setting -->
<!-- Script Start -->
<script src="../../static/js/jquery.min.js"></script>
<script src="../../static/js/popper.min.js"></script>
<script src="../../static/js/bootstrap.min.js"></script>
<script src="../../static/js/custom.js"></script>
</body>

</html>
