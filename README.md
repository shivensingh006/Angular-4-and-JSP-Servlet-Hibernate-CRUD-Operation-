# Angular-5-and-JSP-Servlet-Hibernate-CRUD-Operation-
Angular 5 and JSP Servlet Hibernate CRUD Operation.

Angular 5 -
 - Created service 'get-user.service' for all the CRUD operation
 - Create service using SP-Servlet-Hibernate and use in this service
 - For example for update i'm calling  - http://localhost:8085/Servlet/update
 - 8085 - this is port where servlet is running. you have to change this
 
 
 JSP-Servlet-Hibernate-CRUD-Operation - 
  -in HibernateUtil.java file update the database, root and password. Also port where Mysql server is running
 this is for Mysql server
 - In this application same functionality I'm using for WEBUI and service which is using in Angular 5
 -  For Example
 if(action != null) { //action param getting from angular app
	 PrintWriter out = response.getWriter();
	 //i'm using '"Access-Control-Allow-Origin", "*"' because this for local systme for server you have to change this.
	 response.addHeader("Access-Control-Allow-Origin", "*");   
	 response.setContentType("application/json");
	 response.setCharacterEncoding("UTF-8");
	 out.print("yes");
	 out.flush();
 }else{
	servlet page

	}
	
	
- How It will work- 
-https://youtu.be/P4HY3Y4R3sg
	 
 
