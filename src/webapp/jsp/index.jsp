<%@page language="java" contentType="text/html" %>
       <html>
       <head>
           <title>JSP PAGE !</title>
       </head>
       <body>
       Nasz pierwszy servlet jsp!
       <h1><%

       for(int i =0;i<100;i++) {
        out.print(i + " ");
        if(i>0 && i%10 ==0)
            out.print("<br>");
        }%></h1>



       </body>
       </html>