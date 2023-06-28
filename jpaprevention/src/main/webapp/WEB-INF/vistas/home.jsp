<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <!-- Codificación de Caracteres -->
        <meta charset="UTF-8">

        <!-- Configuración inicial de ancho y escala -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
        <!-- Título de la página -->
        <title>AwakeLab</title>

        <!-- Hoja de estilo -->
        <link rel="stylesheet" href="<core:url value="/res/css/styles.css" />">
    </head>
	<body>
	    
	    <!-- Navbar -->
	    <jsp:include page="navbar-home.jsp"/>
	    <!-- End Navbar -->

				<div class="container mt-5">
			<h1 class="text-center">Sistema Asesoria de Prevención de Riesgos</h1>
			<p class="text-center fs-4" >Sistema de información que permitirá administrar los principales procesos que se llevan a cabo día a día</p>
								
			<div class="row mt-4 d-flex justify-content-around">			
				<div class="card col-xs-12 col-sm-6 col-md-3" >
					<img src="https://img.freepik.com/vector-gratis/nuevo-concepto-mensaje-pagina-destino_52683-26980.jpg" class="card-img-top" alt="Celular con carta de mensaje">
					<div class="card-body">							
						<p class="card-text">Envianos un mensaje.</p>
						<a href="${pageContext.request.contextPath}/contacto" class="btn btn-primary d-grid gap-2">Contacto</a>							
					</div>						
				</div>
					
				<div class="card col-xs-12 col-sm-6 col-md-3" >
					<img src="https://media.gettyimages.com/id/1269452744/es/vector/lista-de-verificaci%C3%B3n-portapapeles-e-icono-de-l%C3%A1piz-dise%C3%B1o-plano-sobre-fondo-blanco.jpg?s=612x612&w=gi&k=20&c=FwNYmm4Bpsn07BCOUNo37yr1EWwT68mNBy_nYZV5Ee0=" class="card-img-top" alt="escritorio con hojas y checks">
					<div class="card-body">							
						<p class="card-text">Programa tu capacitación. </p> 							
						<a href="${pageContext.request.contextPath}/capacitacion/new" class="btn btn-primary d-grid gap-2">Crear Capacitacion</a>
						<a href="${pageContext.request.contextPath}/capacitaciones" class="btn btn-primary d-grid gap-2 mt-3">Listar Capacitaciones</a>
					</div>
				</div>
					
			</div>

		</div>
        
        <!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
	    
	    <!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
    </body>