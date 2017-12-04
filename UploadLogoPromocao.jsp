<%-- 
    Document   : UploadLogoPromocao
    Created on : 15/03/2013, 15:05:00
    Author     : Hipercom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
xmlns:ui="http://java.sun.com/jsf/facelets"
xmlns:h="http://java.sun.com/jsf/html"
xmlns:f="http://java.sun.com/jsf/core"
xmlns:p="http://primefaces.prime.com.tr/ui">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    </head>
    <body>
        <h1>Hello World!</h1>


        <form action="upload.jsp" method="post" enctype="multipart/form-data" >  
            Selecione o arquivo: <input type="file" name="file1">  
            <input type="submit" value="Upload" />  

        </form>  

  <h:form enctype="multipart/form-data">
         <p:fileUpload value="#" />
        
  </h:form>
     <h:inputText value="#"  label="Nome" id="est_nome">                               
                                                        
     </h:inputText>


    </body>
</html>
