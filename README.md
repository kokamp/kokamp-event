# kokamp-event

Setup








<!--tr
	{mso-height-source:auto;}
col
	{mso-width-source:auto;}
td
	{padding-top:1.0px;
	padding-right:1.0px;
	padding-left:1.0px;
	mso-ignore:padding;
	color:windowtext;
	font-size:18.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:Arial;
	mso-generic-font-family:auto;
	mso-font-charset:0;
	text-align:general;
	vertical-align:bottom;
	border:none;
	mso-background-source:auto;
	mso-pattern:auto;}
.oa1
	{border-top:1.0pt solid white;
	border-right:1.0pt solid white;
	border-bottom:3.0pt solid white;
	border-left:1.0pt solid white;
	background:#1CADE4;
	mso-pattern:auto none;
	vertical-align:top;
	padding-bottom:3.6pt;
	padding-left:7.2pt;
	padding-top:3.6pt;
	padding-right:7.2pt;}
.oa2
	{border-top:3.0pt solid white;
	border-right:1.0pt solid white;
	border-bottom:1.0pt solid white;
	border-left:1.0pt solid white;
	background:#CCE3F5;
	mso-pattern:auto none;
	vertical-align:top;
	padding-bottom:3.6pt;
	padding-left:7.2pt;
	padding-top:3.6pt;
	padding-right:7.2pt;}
.oa3
	{border:1.0pt solid white;
	background:#E7F1FA;
	mso-pattern:auto none;
	vertical-align:top;
	padding-bottom:3.6pt;
	padding-left:7.2pt;
	padding-top:3.6pt;
	padding-right:7.2pt;}
.oa4
	{border:1.0pt solid white;
	background:#CCE3F5;
	mso-pattern:auto none;
	vertical-align:top;
	padding-bottom:3.6pt;
	padding-left:7.2pt;
	padding-top:3.6pt;
	padding-right:7.2pt;}
-->




  
 
 
  
  Java 8 


  
  
  http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html


  
  
  
  

 
 
  
  Maven 3


  
  
  https://maven.apache.org/download.cgi


  
  
  
  

 
 
  
  Eclipse or Intellij
  


  (Latest
  version)


  
  
  https://www.jetbrains.com/idea/


  
  
  
  
  

 
 
  
  Mongo
  DB 4.0.1


  
  
  https://www.mongodb.com/download-center#community


  
  
                          


  
  
 
 
  
  Compass
  : Mongo DB Client GUI.


  
  
  https://docs.mongodb.com/compass/master/install/


  
  
  
  
  

 
 
  
  Git
  (2.18.0 )


  
  
  https://git-scm.com/downloads
  
  
  Setup Mongo DB : CLI or GUI 
  Create DB : kokampevent
  Create collection event 
  


  ========= Run =================
  kokamp-event-parent $ mvn clean install
  cd     kokamp-event-exposition
         mvn clean spring-boot:run
============  Test the API
         http://localhost:9090/swagger-ui.html
         
         ************************  ENJOY IT  *************************************************
         
  
  
  
  

 














