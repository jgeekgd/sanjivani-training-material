/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mypackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Mobile;

/**
 *
 * @author MRuser
 */
public class WelcomeServlet extends HttpServlet {
   
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    String filename;
    
	@Override
	public void init() throws ServletException {
 		super.init();
 		
 		// int-param can come minOccurs="0" maxOccurs="unbounded" times
		filename=getInitParameter("TabSepFile");
	}
	

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>The Mobile Store</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.print("<font face='Arial' color='#990000'");
                    out.println("<h1><br/>Welcome to The Mobile Store !</h1><hr/>");
                    out.print("The available mobile models are as follows");
                    out.print("<font face='verdana' color='Blue'");
                    out.print("<ul>");
            
            if(filename!=null)
            {
            
                BufferedReader reader=new BufferedReader(new FileReader(filename));
                String record;
                
                while((record=reader.readLine())!=null)
                {
                    String []fields=record.split(",");
                    String company=fields[0];
                    String model=fields[1];
                    double price=Double.parseDouble(fields[2]);

                    Mobile m1=new Mobile(company,model,price);

                    out.print("<li type=square>Mobile model <u>"+m1.getModel()+"</u> of Company <u>"+m1.getCompany()+"</u> costs Rs/-<u>"+m1.getPrice()+"</u>  only");


                }
                
                
                
            }
             out.print("</font>");
             out.print("</ul><br/><br/><hr/>");
             out.print("</font>");
             out.println("</body>");
             out.println("</html>");


  
        } finally { 
            out.close();
        }
    } 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    } 

}
