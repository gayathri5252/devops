
<%@page import="com.hibernate.*"%>  
<jsp:useBean id="obj" class="com.hibernate.student">  
   </jsp:useBean> 
<jsp:setProperty property="*" name="obj"/>  

<%  
int i=StudentDao.register(obj);  
if(i>0)  
out.print("You are successfully registered");  
  
%>  