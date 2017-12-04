
<head>
	<meta charset="utf-8"/>
	<title>Painel Administrativo</title>
	
	<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen" />
	<!--[if lt IE 9]>
	<link rel="stylesheet" href="css/ie.css" type="text/css" media="screen" />
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	<script src="js/jquery-1.5.2.min.js" type="text/javascript"></script>
	<script src="js/hideshow.js" type="text/javascript"></script>
	<script src="js/jquery.tablesorter.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/jquery.equalHeight.js"></script>
	<script type="text/javascript">
	$(document).ready(function() 
    	{ 
      	  $(".tablesorter").tablesorter(); 
   	 } 
	);
	$(document).ready(function() {

	//When page loads...
	$(".tab_content").hide(); //Hide all content
	$("ul.tabs li:first").addClass("active").show(); //Activate first tab
	$(".tab_content:first").show(); //Show first tab content

	//On Click Event
	$("ul.tabs li").click(function() {

		$("ul.tabs li").removeClass("active"); //Remove any "active" class
		$(this).addClass("active"); //Add "active" class to selected tab
		$(".tab_content").hide(); //Hide all tab content

		var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
		$(activeTab).fadeIn(); //Fade in the active ID content
		return false;
	});

});
    </script>
    <script type="text/javascript">
    $(function(){
        $('.column').equalHeight();
    });
</script>

</head>




	<header id="header">
		<hgroup>
			<h1 class="site_title"><a href="index.html">Painel Administrativo</a></h1>
			<h2 class="section_title">Dashboard</h2><div class="btn_view_site"><a href="http://www.medialoot.com">Visualizar Site</a></div>
		</hgroup>
	</header> <!-- end of header bar -->
	
	<section id="secondary_bar">
		<div class="user">
			<p>John Doe (<a href="#">3 Messages</a>)</p>
			<!-- <a class="logout_user" href="#" title="Logout">Logout</a> -->
		</div>
		<div class="breadcrumbs_container">
			<article class="breadcrumbs"><a href="index.html">Website Admin</a> <div class="breadcrumb_divider"></div> <a class="current">Dashboard</a></article>
		</div>
	</section><!-- end of secondary bar -->
	
	<aside id="sidebar" class="column">
		<form class="quick_search">
			<input type="text" value="Quick Search" onfocus="if(!this._haschanged){this.value=''};this._haschanged=true;">
		</form>
		<hr/>
		<h3>Estabelecimnetos</h3>
		<ul class="toggle">
			<li class="icn_new_article"><a href="#">Adicionar Estabelecimento</a></li>
			<li class="icn_edit_article"><a href="#">Editar Dados de Estabelecimento</a></li>
			<li class="icn_categories"><a href="#">Listar Estabelecimento</a></li>
			<li class="icn_tags"><a href="#">Cadastrar Promo��es de Estabelecimento</a></li>
		</ul>
		<h3>Usu�rios</h3>
		<ul class="toggle">
			<li class="icn_add_user"><a href="#">Adicionar Novo Usu�rio</a></li>
			<li class="icn_view_users"><a href="#">Visualizar Usu�rios</a></li>
			<li class="icn_profile"><a href="#">Seu Perfil</a></li>
		</ul>
		<h3>Banners</h3>
		<ul class="toggle">
			<li class="icn_folder"><a href="#">Gerenciar Banners</a></li>
			<li class="icn_photo"><a href="#">Gallery</a></li>
			<li class="icn_audio"><a href="#">Audio</a></li>
			<li class="icn_video"><a href="#">Video</a></li>
		</ul>
		<h3>Admin</h3>
		<ul class="toggle">
			<li class="icn_settings"><a href="#">Op��es</a></li>
			<li class="icn_security"><a href="#">Seguran�a</a></li>
			<li class="icn_jump_back"><a href="#">Logout</a></li>
		</ul>
		
		
	</aside><!-- end of sidebar -->
        
        
        