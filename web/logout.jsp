<!--  //  HttpSession session=Request.getSession(true);//same work
                 // session.invalidate();-->
		
                 
   <%              
             Cookie ck=new Cookie("uname","");
            ck.setMaxAge(0);
            response.addCookie(ck);
            response.sendRedirect("index.jsp");
            
            %>