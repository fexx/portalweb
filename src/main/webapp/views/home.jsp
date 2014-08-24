<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="ds" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html lang="en">
<meta charset="utf-8">

<head>
<title>Portalweb</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">

<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap-responsive.min.css'/>"/>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"/>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/font-awesome.min.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/pages/portalweb.css'/>"/>
<!-- Para o drag and drop -->
 <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/drag-drop/inettuts.css'/>"/>
<!-- suporte html5 para os IEs -->
<!--[if lt IE 9]>
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
</head>
<body>
<ds:menu/>
<div class="main">
 <div id="columns">
  <div class="main-inner">
    <div class="container">
      <div class="row">
	      <div class="span4">
	      	<ds:widget-box-min titulo="Testando widget" extraHeader="widget-header-black" > teste</ds:widget-box-min>
	      </div>
	      <div class="span4">
	      	<ds:widget-box-min titulo="Testando widget" extraHeader="widget-header-black" > teste</ds:widget-box-min>
	      </div>
	      <div class="span4">
	      	<ds:widget-box-min titulo="Testando widget" extraHeader="widget-header-black" > teste</ds:widget-box-min>
	      </div>
      </div>
      <div class="row">
	<div class="span6">
		<ds:widget titulo="Testando widget" color="color-blue">
			<h6 class="bigstats">Ultimas atualizações das redes sociais. Data 13/08/2014</h6>
		     <div id="big_stats" class="cf">
		       <div class="stat"> <i class="icon-anchor"></i> <span class="value">851</span> </div>
		       <div class="stat"> <i class="icon-thumbs-up-alt"></i> <span class="value">423</span> </div>
		       <div class="stat"> <i class="icon-twitter-sign"></i> <span class="value">922</span> </div>
		       <div class="stat"> <i class="icon-bullhorn"></i> <span class="value">25%</span> </div>
		     </div>
		</ds:widget>
	        
	     <ds:widget titulo="Testando widget" color="color-blue">
	     	<ul class="users-list">
				<li>
					<a href="widgets.html#">
						<img class="avatar" alt="Lucas" src="http://bootstrapmaster.com/live/origin/assets/img/avatar7.jpg">
					</a>
					<div class="name">Łukasz Holeczek 
						<div class="dropdown pull-right">
							<a class="fa icon-cog" data-toggle="dropdown" href="widgets.html#"></a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<li><a href="widgets.html#"><i class="fa fa-check"></i> Accept</a></li>
								<li><a href="widgets.html#"><i class="fa fa-times"></i>Reject</a></li>
								<li><a href="widgets.html#"><i class="fa fa-minus-sign-alt"></i>Block</a></li>
								<li><a href="widgets.html#"><i class="fa fa-trash-o"></i>Delete</a></li>
							</ul>
						</div>
					</div>
					<span class="place"><i class="fa icon-map-marker"></i>Mikolow, POLAND</span>
					<span class="job"><i class="fa icon-briefcase"></i>Founder, BootstrapMaster.com</span>                                 
				</li>
				<li>
					<a href="widgets.html#">
						<img class="avatar" alt="Bill" src="http://bootstrapmaster.com/live/origin/assets/img/avatar7.jpg">
					</a>
					<div class="name">Bill Cole
						<div class="dropdown pull-right">
							<a class="fa icon-cog" data-toggle="dropdown" href="widgets.html#"></a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<li><a href="widgets.html#"><i class="fa fa-check"></i> Accept</a></li>
								<li><a href="widgets.html#"><i class="fa fa-times"></i>Reject</a></li>
								<li><a href="widgets.html#"><i class="fa fa-minus-square-o"></i>Block</a></li>
								<li><a href="widgets.html#"><i class="fa fa-trash-o"></i>Delete</a></li>
							</ul>
						</div>
					</div>
					<span class="place"><i class="fa icon-map-marker"></i>London, ENGLAND</span>
					<span class="job"><i class="fa icon-briefcase"></i>CEO, Rainbow INC</span>                                 
				</li>
				<li>
					<a href="widgets.html#">
						<img class="avatar" alt="Jane" src="http://bootstrapmaster.com/live/origin/assets/img/avatar7.jpg">
					</a>
					<div class="name">Jane Sanchez
						<div class="dropdown pull-right">
							<a class="fa icon-cog" data-toggle="dropdown" href="widgets.html#"></a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<li><a href="widgets.html#"><i class="fa fa-check"></i> Accept</a></li>
								<li><a href="widgets.html#"><i class="fa fa-times"></i>Reject</a></li>
								<li><a href="widgets.html#"><i class="fa fa-minus-square-o"></i>Block</a></li>
								<li><a href="widgets.html#"><i class="fa fa-trash-o"></i>Delete</a></li>
							</ul>
						</div>
					</div>
					<span class="place"><i class="fa icon-map-marker"></i>Berlin, GERMANY</span>
					<span class="job"><i class="fa icon-briefcase"></i>Head of Stars Group</span>                               
				</li>
				<li>
					<a href="widgets.html#">
						<img class="avatar" alt="Kate" src="http://bootstrapmaster.com/live/origin/assets/img/avatar7.jpg">
					</a>
					<div class="name">Kate Presley
						<div class="dropdown pull-right">
							<a class="fa icon-cog" data-toggle="dropdown" href="widgets.html#"></a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<li><a href="widgets.html#"><i class="fa fa-check"></i> Accept</a></li>
								<li><a href="widgets.html#"><i class="fa fa-times"></i>Reject</a></li>
								<li><a href="widgets.html#"><i class="fa fa-minus-square-o"></i>Block</a></li>
								<li><a href="widgets.html#"><i class="fa fa-trash-o"></i>Delete</a></li>
							</ul>
						</div>
					</div>
					<span class="place"><i class="fa icon-map-marker"></i>Madrid, SPAIN</span>
					<span class="job"><i class="fa icon-briefcase"></i>Creative Director, IdeaLab LTD</span>                                  
				</li>
				<li>
					<a href="widgets.html#">
						<img class="avatar" alt="Lucas" src="http://bootstrapmaster.com/live/origin/assets/img/avatar7.jpg">
					</a>
					<div class="name">Anna Holmes 
						<div class="dropdown pull-right">
							<a class="fa icon-cog" data-toggle="dropdown" href="widgets.html#"></a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<li><a href="widgets.html#"><i class="fa fa-check"></i> Accept</a></li>
								<li><a href="widgets.html#"><i class="fa fa-times"></i>Reject</a></li>
								<li><a href="widgets.html#"><i class="fa fa-minus-square-o"></i>Block</a></li>
								<li><a href="widgets.html#"><i class="fa fa-trash-o"></i>Delete</a></li>
							</ul>
						</div>
					</div>
					<span class="place"><i class="fa icon-map-marker"></i>Paris, FRANCE</span>
					<span class="job"><i class="fa icon-briefcase"></i>Co-Founder, ArtStudio</span>                                 
				</li>
			</ul>
	     </ds:widget>
	     
	     <ds:widget titulo="Ulimas noticias" color="color-blue" icone="icon-list-alt">
	     		<div class="widget-content">
	              <ul class="news-items">
	                <li>
	                  <div class="news-item-date"> <span class="news-item-day">29</span> <span class="news-item-month">Aug</span> </div>
	                  <div class="news-item-detail"> <a href="http://www.egrappler.com/thursday-roundup-40/" class="news-item-title" target="_blank">Thursday Roundup # 40</a>
	                    <p class="news-item-preview"> This is our web design and development news series where we share our favorite design/development related articles, resources, tutorials and awesome freebies. </p>
	                  </div>
	                </li>
	                <li>
	                  <div class="news-item-date"> <span class="news-item-day">15</span> <span class="news-item-month">Jun</span> </div>
	                  <div class="news-item-detail"> <a href="http://www.egrappler.com/retina-ready-responsive-app-landing-page-website-template-app-landing/" class="news-item-title" target="_blank">Retina Ready Responsive App Landing Page Website Template – App Landing</a>
	                    <p class="news-item-preview"> App Landing is a retina ready responsive app landing page website template perfect for software and application developers and small business owners looking to promote their iPhone, iPad, Android Apps and software products.</p>
	                  </div>
	                </li>
	                <li>
	                  <div class="news-item-date"> <span class="news-item-day">29</span> <span class="news-item-month">Oct</span> </div>
	                  <div class="news-item-detail"> <a href="http://www.egrappler.com/open-source-jquery-php-ajax-contact-form-templates-with-captcha-formify/" class="news-item-title" target="_blank">Open Source jQuery PHP Ajax Contact Form Templates With Captcha: Formify</a>
	                    <p class="news-item-preview"> Formify is a contribution to lessen the pain of creating contact forms. The collection contains six different forms that are commonly used. These open source contact forms can be customized as well to suit the need for your website/application.</p>
	                  </div>
	                </li>
	              </ul>
	            </div>
	     </ds:widget>
	     
	</div>
    <div class="span6">
        
        <ds:widget titulo="Atalhos importantes" icone="icon-bookmark" color="color-blue">
        	<div class="shortcuts"> 
        		<a href="javascript:;" class="shortcut"><i class="shortcut-icon icon-list-alt"></i>
        			<span class="shortcut-label">Aplicativos</span> </a><a href="javascript:;" class="shortcut">
        			<i class="shortcut-icon icon-bookmark"></i>
        			<span class="shortcut-label">Favoritos</span> 
        		</a>
        		<a href="javascript:;" class="shortcut">
        			<i class="shortcut-icon icon-signal"></i> 
        			<span class="shortcut-label">Relatórios</span> 
        		</a>
        			<a href="javascript:;" class="shortcut"> 
        			<i class="shortcut-icon icon-comment"></i>
        			<span class="shortcut-label">Comentarios</span>
        		</a>
        		<a href="javascript:;" class="shortcut">
        			<i class="shortcut-icon icon-user"></i>
        			<span class="shortcut-label">Usuários</span> 
        		</a>
        		<a href="javascript:;" class="shortcut">
       				<i class="shortcut-icon icon-file"></i>
       				<span class="shortcut-label">Notas</span> 
        		</a>
        		<a href="javascript:;" class="shortcut">
       				<i class="shortcut-icon icon-picture"></i> 
       				<span class="shortcut-label">Fotos</span> 
        		</a>
        		<a href="javascript:;" class="shortcut"> 
       				<i class="shortcut-icon icon-tag"></i>
       				<span class="shortcut-label">Tags</span> 
        		</a> 
				</div>
        </ds:widget>
        
        <ds:widget titulo="Graficos" color="color-blue" icone="icon-signal">
        	<canvas id="area-chart" class="chart-holder" height="250" width="538"> </canvas>
        </ds:widget>  
          
          <ds:widget-table titulo="Produtos/Serviços" color="color-blue" icone="icon-th-list">
          	<table class="table table-striped table-bordered">
                <thead>
                  <tr>
                    <th> Free Resource </th>
                    <th> Download</th>
                    <th class="td-actions"> </th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td> Fresh Web Development Resources </td>
                    <td> http://www.egrappler.com/ </td>
                    <td class="td-actions"><a href="javascript:;" class="btn btn-small btn-success"><i class="btn-icon-only icon-ok"> </i></a><a href="javascript:;" class="btn btn-danger btn-small"><i class="btn-icon-only icon-remove"> </i></a></td>
                  </tr>
                  <tr>
                    <td> Fresh Web Development Resources </td>
                    <td> http://www.egrappler.com/ </td>
                    <td class="td-actions"><a href="javascript:;" class="btn btn-small btn-success"><i class="btn-icon-only icon-ok"> </i></a><a href="javascript:;" class="btn btn-danger btn-small"><i class="btn-icon-only icon-remove"> </i></a></td>
                  </tr>
                  <tr>
                    <td> Fresh Web Development Resources </td>
                    <td> http://www.egrappler.com/ </td>
                    <td class="td-actions"><a href="javascript:;" class="btn btn-small btn-success"><i class="btn-icon-only icon-ok"> </i></a><a href="javascript:;" class="btn btn-danger btn-small"><i class="btn-icon-only icon-remove"> </i></a></td>
                  </tr>
                  <tr>
                    <td> Fresh Web Development Resources </td>
                    <td> http://www.egrappler.com/ </td>
                    <td class="td-actions"><a href="javascript:;" class="btn btn-small btn-success"><i class="btn-icon-only icon-ok"> </i></a><a href="javascript:;" class="btn btn-danger btn-small"><i class="btn-icon-only icon-remove"> </i></a></td>
                  </tr>
                  <tr>
                    <td> Fresh Web Development Resources </td>
                    <td> http://www.egrappler.com/ </td>
                    <td class="td-actions"><a href="javascript:;" class="btn btn-small btn-success"><i class="btn-icon-only icon-ok"> </i></a><a href="javascript:;" class="btn btn-danger btn-small"><i class="btn-icon-only icon-remove"> </i></a></td>
                  </tr>
                
                </tbody>
              </table>
          </ds:widget-table>
          
      </div>
        
      </div>
    </div>
  </div>
</div>
</div>

<ds:rodape/>
<script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.2.6.min.js"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/excanvas.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/chart.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/bootstrap.js'/>"></script>
<!-- Para o drag and drop -->
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/drag-drop/jquery-ui-personalized-1.6rc2.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/drag-drop/inettuts.js'/>"></script>
<!-- Grafico -->
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/grafico/grafico.js'/>"></script>
</body>
</html>
