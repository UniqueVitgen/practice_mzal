
<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <meta name="description" content="${vmc.type} - ${vmc.model}">
        <meta name="author" content="">
        <meta name="keywords" content="${vmc.model} for sale, ${vmc.model}, ${vmc.model} price, ${vmc.model} buy">
        <meta name="robots" content="all">

         <title> ${vmc.model} for sale | VMC & HMC </title>
  

        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="../resources/assets/css/bootstrap.min.css">
        
        <!-- Customizable CSS -->
        <link rel="stylesheet" href="../resources/assets/css/main.css">
        <link rel="stylesheet" href="../resources/assets/css/green.css">
        <link rel="stylesheet" href="../resources/assets/css/owl.carousel.css">
        <link rel="stylesheet" href="../resources/assets/css/owl.transitions.css">
        <link rel="stylesheet" href="../resources/assets/css/animate.min.css">

        <!-- Demo Purpose Only. Should be removed in production -->
        <link rel="stylesheet" href="../resources/assets/css/config.css">

        <link href="../resources/assets/css/green.css" rel="alternate stylesheet" title="Green color">
        <link href="../resources/assets/css/blue.css" rel="alternate stylesheet" title="Blue color">
        <link href="../resources/assets/css/red.css" rel="alternate stylesheet" title="Red color">
        <link href="../resources/assets/css/orange.css" rel="alternate stylesheet" title="Orange color">
        <link href="../resources/assets/css/navy.css" rel="alternate stylesheet" title="Navy color">
        <link href="../resources/assets/css/dark-green.css" rel="alternate stylesheet" title="Darkgreen color">
        <!-- Demo Purpose Only. Should be removed in production : END -->

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
        
        <!-- Icons/Glyphs -->
        <link rel="stylesheet" href="../resources/assets/css/font-awesome.min.css">
        
        <!-- Favicon -->
        <link rel="shortcut icon" href="../resources/assets/images/favicon.ico">

        <!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
        <!--[if lt IE 9]>
            <script src="js/html5shiv.js"></script>
            <script src="js/respond.min.js"></script>
        <![endif]-->

        
    </head>
<body>
    
    <div class="wrapper">

        
        
<!-- ============================================================= TOP NAVIGATION ============================================================= -->
<%@include file="/WEB-INF/pages/in/nav.jsp" %>        
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->       <!-- ============================================================= HEADER ============================================================= -->
<%@include file="/WEB-INF/pages/in/header.jsp" %>
<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->

    
    <div id="top-mega-nav">
    <div class="container">
        <nav>
            <ul class="inline">
                <!--<li class="dropdown le-dropdown">-->
                  <%@include file="/WEB-INF/pages/in/dropdown_le_dropdown.jsp" %>
                <!--</li>-->

                <li class="breadcrumb-nav-holder"> 
                    <ul>

                        <!--<li class="breadcrumb-item">-->
                          <%@include file="/WEB-INF/pages/in/breadcrumb_item.jsp" %>
                        <!--</li>--> 
  
                             <li class="breadcrumb-item">
                                <a href="/automated_line"><spring:message code="all_departments.automated_line" text="Aggregate machine" /></a>
                        </li> 
                        
                       <li class="breadcrumb-item current">
                            <a href="">
                                <c:if test="${pageContext.response.locale == 'en'}"><spring:message text="${automatedLine.manufacturerRu}" />
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}"><spring:message text="${automatedLine.manufacturerRu}" />
                                </c:if> -
                                <c:if test="${pageContext.response.locale == 'en'}"><spring:message text="${automatedLine.modelEn}" />
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}"><spring:message text="${automatedLine.modelRu}" />
                                </c:if></a>
                        </li> 
                    </ul>
                </li><!-- /.breadcrumb-nav-holder --> 
                <!--/.breadcrumb-nav-holder--> 
                            

            </ul> 
            <!--/.inline--> 
        </nav>

    </div> 
        <!--/.container--> 
</div> 
    <!--/#top-mega-nav--> 






<!-- ========================================= BREADCRUMB : END ========================================= --></div>     <div id="single-product">
    <div class="container">

         <div class="no-margin col-xs-12 col-sm-6 col-md-5 gallery-holder">
    <div class="product-item-holder size-big single-product-gallery small-gallery">

        <div id="owl-single-product">
            <div class="single-product-gallery-item" id="slide1">
                <!--<a data-rel="prettyphoto" href="../resources/assets/images/products/${vmc.photo1}">-->
                <a data-rel="prettyphoto" href="resources/assets/images/products/${automatedLine.photo1}">
                    <img class="img-responsive" alt="${automatedLine.modelEn}"
                         src="resources/assets/images/products/${automatedLine.photo1}"
                         data-echo="resources/assets/images/products/standart.png" />
                         <!--src="../resources/assets/images/products/${vmc.photo1}"-->
                         <!--data-echo="../resources/assets/images/products/${vmc.photo1}" />-->
                         <!--src="../resources/assets/images/blank.gif"--> 
                </a>
            </div><!-- /.single-product-gallery-item -->
            
            <div class="single-product-gallery-item" id="slide2">
                <a data-rel="prettyphoto" href="resources/assets/images/products/${automatedLine.photo2}">
                    <img class="img-responsive" alt="${automatedLine.modelEn}"
                         src="resources/assets/images/products/${automatedLine.photo2}"
                         data-echo="resources/assets/images/products/standart.png" />
                         <!--src="../resources/assets/images/blank.gif"-->
                </a>
            </div><!-- /.single-product-gallery-item -->
            
            <div class="single-product-gallery-item" id="slide3">
                <a data-rel="prettyphoto" href="resources/assets/images/products/${automatedLine.photo3}">
                    <img class="img-responsive" alt="${automatedLine.modelEn}"
                         src="resources/assets/images/products/${automatedLine.photo3}"
                         data-echo="resources/assets/images/products/standart.png" />
                         <!--src="../resources/assets/images/blank.gif"--> 
                </a>
            </div><!-- /.single-product-gallery-item -->
            
            <%--<div class="single-product-gallery-item" id="slide4">--%>
                <%--<a data-rel="prettyphoto" href="../resources/assets/images/products/${automatedLine.photo4}">--%>
                    <%--<img class="img-responsive" alt="${automatedLine.modelEn}" --%>
                         <%--src="../resources/assets/images/products/${automatedLine.photo4}" --%>
                         <%--data-echo="../resources/assets/images/products/${automatedLine.photo4}" />--%>
                         <%--<!--src="../resources/assets/images/blank.gif"--> --%>
                <%--</a>--%>
            <%--</div><!-- /.single-product-gallery-item -->--%>
            <%----%>
            <%--<div class="single-product-gallery-item" id="slide5">--%>
                <%--<a data-rel="prettyphoto" href="../resources/assets/images/products/${automatedLine.photo5}">--%>
                    <%--<img class="img-responsive" alt="${automatedLine.modelEn}" --%>
                         <%--src="../resources/assets/images/products/${automatedLine.photo5}" --%>
                         <%--data-echo="../resources/assets/images/products/${automatedLine.photo5}" />--%>
                         <%--<!--src="../resources/assets/images/blank.gif"--> --%>
                <%--</a>--%>
            <%--</div><!-- /.single-product-gallery-item -->--%>
            


<!--            <div class="single-product-gallery-item" id="slide2">
                <a data-rel="prettyphoto" href="../resources/assets/images/products/product-gallery-01.jpg">
                    <img class="img-responsive" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/product-gallery-01.jpg" />
                </a>
            </div> /.single-product-gallery-item 
<!--    
            <div class="single-product-gallery-item" id="slide3">
                <a data-rel="prettyphoto" href="../resources/assets/images/products/product-gallery-01.jpg">
                    <img class="img-responsive" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/product-gallery-01.jpg" />
                </a>
            </div> /.single-product-gallery-item -->
        </div><!-- /.single-product-slider -->


        <div class="single-product-gallery-thumbs gallery-thumbs">

            <div id="owl-single-product-thumbnails">
                <a class="horizontal-thumb active" data-target="#owl-single-product" data-slide="0" href="#slide1">
                    <!--<img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/bench${automatedLine.id}.jpg" />-->
                    <!--<img width="67" alt="" src="../resources/assets/images/products/${automatedLine.photo1}" data-echo="../resources/assets/images/products/${automatedLine.photo1}" />-->
                    <img width="67" alt="${automatedLine.modelEn}" src="resources/assets/images/products/${automatedLine.workpiecePhoto1}" data-echo="resources/assets/images/products/standart.png" />
                </a>

                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="1" href="#slide2">
                    <!--<img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/automatedLinegallery-thumb-01.jpg" />-->
                    <img width="67" alt="${automatedLine.modelEn}"  src="resources/assets/images/products/automatedLine${automatedLine.workpiecePhoto2}" data-echo="resources/assets/images/products/standart.png"  />
                </a>

                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="2" href="#slide3">
                    <!--<img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/automatedLinebench${automatedLine.id}.jpg" />-->
                    <img width="67" alt="${automatedLine.modelEn}"  src="resources/assets/images/products/${automatedLine.photo3}" data-echo="resources/assets/images/products/standart.png"  />
                </a>

                <%--<a class="horizontal-thumb" data-target="#owl-single-product" data-slide="3" href="#slide4">--%>
                    <%--<img width="67" alt="${vmc.model}"  src="../resources/assets/images/products/${lightOffice.photo4}" data-echo="../resources/assets/images/products/${lightOffice.photo4}"  />--%>
                <%--</a>--%>

                <%--<a class="horizontal-thumb" data-target="#owl-single-product" data-slide="4" href="#slide5">                  --%>
                    <%--<img width="67" alt="${vmc.model}"  src="../resources/assets/images/products/${lightOffice.photo5}" data-echo="../resources/assets/images/products/${lightOffice.photo5}"  />--%>
                <%--</a>--%>

<!--                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="2" href="#slide4">
                    <img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/vmcbench${vmc.id}.jpg" />
                    <img width="67" alt=""  src="${vmc.photo4}" data-echo="${vmc.photo4}"  />
                </a>-->
<!--                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="2" href="#slide3">
                    <img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/bench${vmc.id}.jpg" />
                    <img width="67" alt="" src="../resources/assets/images/products/bench4.jpg" data-echo="../resources/assets/images/products/bench4.jpg" />-->
                <!--</a>-->

<!--                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="0" href="#slide1">
                    <img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/gallery-thumb-01.jpg" />
                </a>

                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="1" href="#slide2">
                    <img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/gallery-thumb-01.jpg" />
                </a>-->

<!--                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="2" href="#slide3">
                    <img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/gallery-thumb-01.jpg" />
                </a>

                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="0" href="#slide1">
                    <img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/gallery-thumb-01.jpg" />
                </a>

                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="1" href="#slide2">
                    <img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/gallery-thumb-01.jpg" />
                </a>

                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="2" href="#slide3">
                    <img width="67" alt="" src="../resources/assets/images/blank.gif" data-echo="../resources/assets/images/products/gallery-thumb-01.jpg" />
                </a>-->
            </div> 
                <!--/#owl-single-product-thumbnails--> 

            <div class="nav-holder left hidden-xs">
                <a class="prev-btn slider-prev" data-target="#owl-single-product-thumbnails" href="#prev"></a>
            </div> 
            <!--/.nav-holder--> 
            
            <div class="nav-holder right hidden-xs">
                <a class="next-btn slider-next" data-target="#owl-single-product-thumbnails" href="#next"></a>
            </div> 
            <!--/.nav-holder--> 

        </div>
                <!-- /.gallery-thumbs -->

    </div><!-- /.single-product-gallery -->
</div><!-- /.gallery-holder -->        
        <div class="no-margin col-xs-12 col-sm-7 body-holder">
    <div class="body">
        <!--<div class="star-holder inline"><div class="star" data-score="4"></div></div>-->
        <div class="availability">

            <c:if test="${pageContext.response.locale == 'en'}"><label>Availability:</label><span class="available">  in stock</span>
            </c:if>
            <c:if test="${pageContext.response.locale == 'russia'}"><label>В наличии:</label><span class="available">  на складе</span>
            </c:if></div>

        <div class="title"><a href="#">
            <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.modelEn}
            </c:if>
            <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.modelRu}
            </c:if></a></div>
        <div class="brand">  <spring:message code="lightall.type" text="Type"/>:
            <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.typeEn}
            </c:if>
            <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.typeRu}
            </c:if></div>

        <div class="social-row">
            <span class="st_facebook_hcount"></span>
            <span class="st_twitter_hcount"></span>
            <span class="st_pinterest_hcount"></span>
        </div>

        <div class="buttons-holder">
            <!--<a class="btn-add-to-wishlist" href="add-product-to-wish-list?id=${vmc.id}">add to wishlist</a>-->
            <!--<a class="btn-add-to-compare" href="/compare/vmc/add?id=${vmc.id}">add to compare list</a>-->
        </div>

        <div class="excerpt">
            <p>${automatedLine.descriptionEn}</p>
            <!--<p>${vmc.info2ru}</p>-->
        </div>
        
        
        
   
        <div class="prices">
<!--            <div class="price-current">$1740.00</div>
            <div class="price-prev">$2199.00</div>-->
        </div>

        <div class="qnt-holder">
<!--            <div class="le-quantity">
                <form>
                    <a class="minus" href="#reduce"></a>
                    <input name="quantity" readonly="readonly" type="text" value="1" />
                    <a class="plus" href="#add"></a>
                </form>
            </div>-->

   
<!--<a id="addto-cart" href="/add-product-to-customer-basket?id=${vmc.id}&model=${vmc.model}"  class="le-button huge"><spring:message code="vmc.addtocart" text="add to cart" /> </a>-->
<a id="addto-cart" href="/automated_line/pdf/${automatedLine.url}"  class="le-button huge"><spring:message code="lightone.download_pdf" text="Download PDF" /> </a>

    
        </div><!-- /.qnt-holder -->
    </div><!-- /.body -->

</div><!-- /.body-holder -->
    </div><!-- /.container -->
    
    
    
    
    
</div><!-- /.single-product -->

<!-- ========================================= SINGLE PRODUCT TAB ========================================= -->
<section id="single-product-tab">
    <div class="container">
        <div class="tab-holder">
            
            <ul class="nav nav-tabs simple" >
                <%--<li ><a href="#description" data-toggle="tab"> <spring:message code="vmc.video" text="Video" /></a></li>--%>
                <li class="active" ><a href="#additional-info" data-toggle="tab"> <spring:message code="automated_line.technical_data" text="Technical data" /></a></li>
                <!--<li><a href="#reviews" data-toggle="tab">Reviews (3)</a></li>-->
            </ul><!-- /.nav-tabs -->


            <div class="tab-content">
                <div class="tab-pane" id="description">
                    <p>${vmc.info1en}</p>
                 
                    
    <%--<c:choose>--%>
        <%----%>
        <%--&lt;%&ndash;<c:when test="${empty lightOffice.video1}">&ndash;%&gt;--%>
            <%--&lt;%&ndash;<iframe width="853" height="480" src="https://www.youtube.com/embed/mQ205po5vk4" frameborder="0" allowfullscreen></iframe>              &ndash;%&gt;--%>
        <%--&lt;%&ndash;</c:when>&ndash;%&gt;--%>
    <%----%>
        <%--&lt;%&ndash;<c:otherwise>   &ndash;%&gt;--%>
            <%--&lt;%&ndash;<iframe width="853" height="480" src="${lightOffice.video1}" frameborder="0" allowfullscreen></iframe>              &ndash;%&gt;--%>
            <%--&lt;%&ndash;<br>&ndash;%&gt;--%>
<%--&lt;%&ndash;<!--            <br>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<c:if test="${not empty vmc.video2}">&ndash;%&gt;--%>
               <%--&lt;%&ndash;<iframe width="853" height="480"  src="${vmc.video2}" frameborder="0" allowfullscreen></iframe>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<br>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<br>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</c:if>&ndash;%&gt;--%>
  <%--&lt;%&ndash;-->&ndash;%&gt;--%>

      <%--&lt;%&ndash;&ndash;%&gt;--%>
        <%--&lt;%&ndash;</c:otherwise>&ndash;%&gt;--%>
                <%----%>
    <%--</c:choose>          --%>
                    
                    
  
                    

                </div> 
          

                
                
                
                <div class="tab-pane active" id="additional-info">
                    <ul class="tabled-data">


                        <li>
                            <label><spring:message code="automated_line.model" text="model" /></label>
                            <div class="value">
                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.modelEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.modelRu}
                                </c:if></div>

                        </li>

                        
                        <li>
                            <label><spring:message code="lightcompare.type" text="type" /></label>
                            <div class="value">
                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.typeEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.typeRu}
                                </c:if></div>
                            
                        </li>
                        <li>
                            <label><spring:message code="lightcompare.manufacturer" text="Manufacturer" /></label>
                            <div class="value">
                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.manufacturerEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.manufacturerRu}
                                </c:if>
                                </div>
                            
                        </li>
                        <%--<li>--%>
                            <%--<label><spring:message code="lightcompare.country" text="Country" /></label>--%>
                            <%--<div class="value">${automatedLine.countryEn}</div>--%>
                        <%--</li>--%>
                        <li>
                            <label><spring:message code="lightcompare.cnc" text="cnc"/></label>
                            <div class="value">
                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.cncEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.cncRu}
                                </c:if>
                                </div>
                        </li>
                        <li>
                            <label><spring:message code="lightcompare.cnc_full" text="cnc full"/></label>
                            <div class="value">
                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.cncFullEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.cncFullRu}
                                </c:if>
                                </div>
                        </li>
                        
                        <li>
                            <label><spring:message code="lightcompare.machine_condition" text="machine condition"/></label>
                            <div class="value">
                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.machineConditionEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.machineConditionRu}
                                </c:if>
                                </div>
                        </li>
                        
                        <%--<li>--%>
                            <%--<label><spring:message code="lightcompare.luminous_flux_emergency" text="luminous Flux Emergency"/></label>--%>
                            <%--<div class="value">--%>
                                                <%--<c:choose>--%>
                                                <%--<c:when test="${lightOffice.luminousFluxEmergency==0}">--%>
                                                  <%--- --%>
                                                <%--</c:when>    --%>
                                                <%--<c:otherwise>--%>
                                               <%--${lightOffice.luminousFluxEmergency} --%>
                                                <%--</c:otherwise>--%>
                                                <%--</c:choose>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        
                        <li>
                            <label><spring:message code="automated_line.machine_location" text="Machine location"/></label>
                            <div class="value">
                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.machineLocationEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.machineLocationRu}
                                </c:if>
                                </div>
                        </li>
                        
                        <%--<li>--%>
                            <%--<label><spring:message code="lightcompare.size" text="size"/></label>--%>
                            <%--<div class="value">--%>
                                <%--${lightOffice.size} --%>
                                <%--<br/>  --%>
                                 <%--<c:if test="${not empty item1.sizeInstallation}" >--%>
                                              <%--<br/>  (${automatedLine.sizeInstallation} Installation size)--%>
                                            <%--</c:if>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        
                        <li>
                            <label><spring:message code="automated_line.year" text="Year"/></label>
                            <div class="value">${automatedLine.year}</div>
                        </li>
                        
                        <li>
                            <label><spring:message code="automated_line.workpiece" text="workpiece"/></label>
                            <div class="value">


                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.workpieceEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.workpieceRu}
                                </c:if>
                                </div>
                        </li>
                        
                        <li>
                            <label><spring:message code="automated_line.workpiece_weight" text="workpiece weight"/></label>
                            <div class="value">${automatedLine.workpieceWeight}</div>
                        </li>
                        
                        <li>
                            <label><spring:message code="automated_line.workpiece_description" text="workpiece description"/></label>
                            <div class="value">

                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.workpieceDescriptionEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.workpieceDescriptionRu}
                                </c:if>
                                </div>
                        </li>
                        
                        <li>
                            <label><spring:message code="automated_line.dimensions" text="dimensions"/></label>
                            <div class="value">${automatedLine.dimensions}</div>
                        </li>
                        
                        <li>
                            <label><spring:message code="automated_line.weight" text="weight"/></label>
                            <div class="value">${automatedLine.weight}</div>
                        </li>
                        
                        <%--<li>--%>
                            <%--<label><spring:message code="numOfWorkingStaff" text="num of working staff"/> </label>--%>
                            <%--<div class="value">${automatedLine.numOfWorkingStaff}</div>--%>
                        <%--</li>--%>

                        <li>
                            <label><spring:message code="automated_line.productivity" text="productivity"/> </label>
                            <div class="value">${automatedLine.productivity}</div>
                        </li>

                        <li>
                            <label><spring:message code="automated_line.price" text="price"/> </label>
                            <div class="value">${automatedLine.price}</div>
                        </li>

                        <li>
                            <label><spring:message code="automated_line.description" text="description"/> </label>
                            <div class="value">
                                <c:if test="${pageContext.response.locale == 'en'}">${automatedLine.descriptionEn}
                                </c:if>
                                <c:if test="${pageContext.response.locale == 'russia'}">${automatedLine.descriptionRu}
                                </c:if>
                            </div>
                        </li>
                        
                        <%--<li>--%>
                            <%--<label>dimming Function</label>--%>
                            <%--<div class="value">--%>
                            <%--<c:choose>--%>
                                <%--<c:when test="${empty lightOffice.dimmingFunction}">--%>
                                 <%--<p> - </p>--%>
                                <%--</c:when>    --%>
                                <%--<c:otherwise>--%>
                               <%--<p>  ${lightOffice.dimmingFunction}  </p>--%>
                                <%--</c:otherwise>--%>
                            <%--</c:choose>     --%>
                            <%--</div>--%>
                        <%--</li>--%>
                        
                        <%--<li>--%>
                            <%--<label>mounting Type</label>--%>
                            <%--<div class="value">--%>
                                <%--<c:choose>--%>
                                    <%--<c:when test="${empty lightOffice.mountingType}">--%>
                                     <%--<p> - </p>--%>
                                    <%--</c:when>    --%>
                                    <%--<c:otherwise>--%>
                                   <%--<p> ${lightOffice.mountingType} </p>--%>
                                    <%--</c:otherwise>--%>
                                <%--</c:choose>    --%>
                            <%--</div>--%>
                        <%--</li>--%>
                        
      
                        
                        
                    </ul><!-- /.tabled-data -->

<!--                    <div class="meta-row">
                        <div class="inline">
                            <label>SKU:</label>
                            <span>54687621</span>
                        </div>-->
                        <!-- /.inline -->

                        <!--<span class="seperator">/</span>-->

<!--                        <div class="inline">
                            <label>categories:</label>
                            <span><a href="#">-50% sale</a>,</span>
                            <span><a href="#">gaming</a>,</span>
                            <span><a href="#">desktop PC</a></span>
                        </div> /.inline -->

                        <!--<span class="seperator">/</span>-->

<!--                        <div class="inline">
                            <label>tag:</label>
                            <span><a href="#">fast</a>,</span>
                            <span><a href="#">gaming</a>,</span>
                            <span><a href="#">strong</a></span>
                        </div> /.inline 
                    </div> /.meta-row 
                </div>-->
                        <!-- /.tab-pane #additional-info -->



            </div><!-- /.tab-content -->

        </div><!-- /.tab-holder -->
    </div><!-- /.container -->
</section><!-- /#single-product-tab -->
<!-- ========================================= SINGLE PRODUCT TAB : END ========================================= -->


<!-- ========================================= RECENTLY VIEWED ========================================= -->
<section id="recently-reviewd" class="wow fadeInUp">
    <div class="container">
        <div class="carousel-holder hover">
            
            <div class="title-nav">
                <h2 class="h1">Random Light</h2>
                <div class="nav-holder">
                    <a href="#prev" data-target="#owl-recently-viewed" class="slider-prev btn-prev fa fa-angle-left"></a>
                    <a href="#next" data-target="#owl-recently-viewed" class="slider-next btn-next fa fa-angle-right"></a>
                </div>
            </div> 
            <!--/.title-nav--> 

            <div id="owl-recently-viewed" class="owl-carousel product-grid-holder">
               
                
                
         <c:forEach items="${listRandomVmc}" var="vmc">
                    
               
                <div class="no-margin carousel-item product-item-holder size-small hover">
                    <div class="product-item">
                        <!--<div class="ribbon red"><span>sale</span></div>--> 
                        <div class="image">
                            <a href="/vmc${vmc.id}">
                            <img alt="${vmc.model}" src="/resources/assets/images/products/${vmc.photo1}" data-echo="/resources/assets/images/products/${vmc.photo1}" />
                             </a>
                        </div>
                        <div class="body">
                            <div class="title">
                                <a href="/vmc${vmc.id}">${vmc.model} <br>     ${vmc.manufacturer}</a>
                            </div>
                            <div class="brand">${vmc.year}</div>
                        </div>
<!--                        <div class="prices">
                            <div class="price-current text-right">$1199.00</div>
                        </div>
                        <div class="hover-area">
                    <div class="add-cart-button">
                                <a href="single-product.html" class="le-button">Add to Cart</a>
                            </div>
                            <div class="wish-compare">
                                <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                <a class="btn-add-to-compare" href="#">Compare</a>
                            </div>
                        </div>-->
                    </div> 
                </div> 

        </c:forEach> 

            
                
            </div>

        </div> 
    </div> 
</section> 
<!-- ========================================= RECENTLY VIEWED : END ========================================= -->      <!-- ============================================================= FOOTER ============================================================= -->

<!-- ============================================================= FOOTER ============================================================= -->
<%@include file="/WEB-INF/pages/in/footer.jsp" %>
<!-- ============================================================= FOOTER : END ============================================================= -->   


</div><!-- /.wrapper -->

    <!-- For demo purposes â can be removed on production -->
            <!--!!!!! Do not forgot drop enpty new Message()-->
            <%@include file="/WEB-INF/pages/in/config_open.jsp" %>     
    <!-- For demo purposes â can be removed on production : End -->

    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="../resources/assets/js/jquery-1.10.2.min.js"></script>
    <script src="../resources/assets/js/jquery-migrate-1.2.1.js"></script>
    <script src="../resources/assets/js/bootstrap.min.js"></script>
    <script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
    <script src="../resources/assets/js/gmap3.min.js"></script>
    <script src="../resources/assets/js/bootstrap-hover-dropdown.min.js"></script>
    <script src="../resources/assets/js/owl.carousel.min.js"></script>
    <script src="../resources/assets/js/css_browser_selector.min.js"></script>
    <script src="../resources/assets/js/echo.min.js"></script>
    <script src="../resources/assets/js/jquery.easing-1.3.min.js"></script>
    <script src="../resources/assets/js/bootstrap-slider.min.js"></script>
    <script src="../resources/assets/js/jquery.raty.min.js"></script>
    <script src="../resources/assets/js/jquery.prettyPhoto.min.js"></script>
    <script src="../resources/assets/js/jquery.customSelect.min.js"></script>
    <script src="../resources/assets/js/wow.min.js"></script>
    <script src="../resources/assets/js/scripts.js"></script>

    <!-- For demo purposes â can be removed on production -->
    
    <script src="../resources/assets/switchstylesheet/switchstylesheet.js"></script>
    
    <script>
        $(document).ready(function(){ 
            $(".changecolor").switchstylesheet( { seperator:"color"} );
            $('.show-theme-options').click(function(){
                $(this).parent().toggleClass('open');
                return false;
            });
        });

        $(window).bind("load", function() {
           $('.show-theme-options').delay(2000).trigger('click');
        });
    </script>
    <!-- For demo purposes â can be removed on production : End -->

    <script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>