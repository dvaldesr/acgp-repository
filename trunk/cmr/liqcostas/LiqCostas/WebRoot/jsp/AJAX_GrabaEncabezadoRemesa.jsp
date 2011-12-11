<%@ page language='java' contentType="text/html"%>
<%@page import="utils.LoggerInstance"%>
<%@page import='Proc.Remesa'%>
<%
	String NumRemesa="-1";
	Seguridad.ValidaSesion val = new Seguridad.ValidaSesion();			
	int res = val.valida(request);
	if (res != 0) {
		NumRemesa="-2";
	}
	else {	
	    try {
			String sUsuario = request.getParameter("USUARIO")!=null?request.getParameter("USUARIO").toString().trim():"";
			String sFechaRemesa = request.getParameter("FECHAREMESA")!=null?request.getParameter("FECHAREMESA").toString().trim():"";
			String sNumInterno = request.getParameter("NUMINTERNO")!=null?request.getParameter("NUMINTERNO").toString().trim():"";
			String sAbo = request.getParameter("ABO")!=null?request.getParameter("ABO").toString().trim():"";
			String sMonto = request.getParameter("MONTO")!=null?request.getParameter("MONTO").toString().trim():"0";
			String sMoneda = request.getParameter("MONEDA")!=null?request.getParameter("MONEDA").toString().trim():"";
			String sTipoProd = request.getParameter("TIPOPROD")!=null?request.getParameter("TIPOPROD").toString().trim():"";
			String sGrupo = request.getParameter("GRUPO")!=null?request.getParameter("GRUPO").toString().trim():"";
			Remesa objRemesa = new Remesa();
			
			NumRemesa = objRemesa.IngresarEncRemesa(sUsuario,sAbo,sFechaRemesa,sNumInterno,sMoneda,sMonto,Integer.parseInt(sTipoProd),Integer.parseInt(sGrupo));
			
		} catch(Exception ex) {
			LoggerInstance.error(Thread.currentThread().getStackTrace()[2] , ex);
		}
		
	}	
 %> 
{"total":"<%=NumRemesa%>"}